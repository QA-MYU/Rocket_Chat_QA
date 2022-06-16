package rocket.pages;

import rocket.utils.Driver;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }
}