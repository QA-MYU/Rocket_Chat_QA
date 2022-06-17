package rocket.step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import rocket.pages.HomePage;
import rocket.pages.LoginPage;
import rocket.utils.ConfigurationReader;
import rocket.utils.Driver;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyStepdefs {

    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();

    @Given("I access the login page and land on home page")
    public void i_access_the_login_page_and_land_on_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        loginPage.login();
    }

    @And("I access menu `Create Movement´")
    public void iAccessMenuCreateMovement() {
        homePage.Criar.click();
    }

    @When("I fill in all required fields")
    public void iFillInAllRequiredFields() {

        Select select= new Select(homePage.movementType);
        select.getFirstSelectedOption().click();

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Date today= Calendar.getInstance().getTime();
        String date=simpleDateFormat.format(today);
        System.out.println("date = " + date);
        homePage.data_transacao.sendKeys(date);
        homePage.data_pagamento.sendKeys(date);
        homePage.descricao.sendKeys("TEST PAYMENT");
        homePage.interessado.sendKeys("qa automation");
        homePage.valor.sendKeys("1000");

        new Select(homePage.account);
        select.getFirstSelectedOption().click();
        homePage.save.click();
    }
}