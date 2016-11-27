package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by Kailend on 25.11.2016.
 */
public class BrowEnter extends MetodFactors{

    @BeforeTest
    @Parameters({"browser"})
    public void setBrow(@Optional("CH") String browser){

        switch (browser){
            case "CH": driver=new ChromeDriver(); break;
            case "FF": driver=new FirefoxDriver(); break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    }

    @AfterTest
    public void closeBrow(){
        driver.close();
    }
}
