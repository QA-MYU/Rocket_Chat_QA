package rocket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import rocket.utils.ConfigurationReader;

public class LoginPage extends BasePage{

    @FindBy (xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy (xpath = "//input[@id='senha']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement enterButton;

    public void login(){
        emailBox.sendKeys(ConfigurationReader.get("email"));
        passwordBox.sendKeys(ConfigurationReader.get("password"));
        enterButton.click();
    }
}
