package rocket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy (linkText = "Criar Movimentação")
    public WebElement Criar;

    @FindBy(xpath = "//select[@id='tipo']")
    public WebElement movementType;

    @FindBy (xpath = "//input[@id='data_transacao']")
    public WebElement data_transacao;

    @FindBy (xpath = "//input[@id='data_pagamento']")
    public WebElement data_pagamento;

    @FindBy (xpath = "//input[@id='descricao']")
    public WebElement descricao;

    @FindBy (xpath = "//input[@id='interessado']")
    public WebElement interessado;

    @FindBy (xpath = "//input[@id='valor']")
    public WebElement valor;

    @FindBy (xpath = "//select[@id='conta']")
    public WebElement account;

    @FindBy (xpath = "//input[@id='status_pendente']")
    public WebElement status_pendente;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement save;
}