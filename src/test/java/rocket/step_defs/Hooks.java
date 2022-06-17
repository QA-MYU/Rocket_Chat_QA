package rocket.step_defs;

import rocket.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    private void setUp(){
        Driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

//    @After
//    public void destroy(Scenario scenario){
//        if (scenario.isFailed()){
//            final byte[] screenshot=((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot,"image/png","screenshot");
//        }
//        Driver.closeDriver();
//    }
}