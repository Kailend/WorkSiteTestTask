package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.screentaker.ViewportPastingStrategy;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Kailend on 25.11.2016.
 */
public class MetodFactors {

    public static WebDriver driver;



    public void type(By by,String str){
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(str);
    }

    public void clickButton(By by){
        WebDriverWait webDriverWait=new WebDriverWait(driver,5);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    }

    public boolean isElement(By by,int time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
        List<WebElement>list=driver.findElements(by);
        if (list.size()>0){
            return true;
        }else return false;
    }

    @Attachment(value = "ScreenshotAttachment", type = "image/png")
    public byte[] createAttachment() {
        return captureScreenShot();
    }

    private byte[] captureScreenShot() {
        try {
            BufferedImage image  = new AShot().shootingStrategy(new ViewportPastingStrategy(5)).takeScreenshot(driver).getImage();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(image, "png", baos);
            baos.flush();
            byte[] imageInByte = baos.toByteArray();
            baos.close();
            return imageInByte;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Attachment Content Empty, can't create screenshot".getBytes();
    }


}
