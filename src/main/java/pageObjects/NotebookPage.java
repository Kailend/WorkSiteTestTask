package pageObjects;

import core.MetodFactors;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Kailend on 25.11.2016.
 */
public class NotebookPage extends MetodFactors{

    private By downloadFotoButton=By.xpath(".//a[contains(@class,\"upload button\")]");
    private By createResumeButton=By.xpath(".//a[contains(@class,\"add button\")]");
    private By moreButton=By.xpath(".//div[1][@class=\"b-one-resume js-resume-container\"]//a[@class=\"b-one-resume__link\"]");
    private By deleteAnketfButton=By.xpath(".//div[1][@class=\"b-one-resume js-resume-container\"]//a[contains(@class,\"delete\")]");
    private By editFormLink=By.xpath(".//div[1][@class=\"b-one-resume js-resume-container\"]//a[contains(@class,\"gtm-edit \")]");



    public void downloadFoto(String str){
        clickButton(downloadFotoButton);
    }

    @Step
    public void clickCreateResume(){
        clickButton(createResumeButton);
    }
    @Step
    public void deleteFirstForm()  {
        WebDriverWait webDriverWait=new WebDriverWait(driver,4);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class=\"btn_block\"]/button")));
        clickButton(moreButton);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(deleteAnketfButton));
        clickButton(deleteAnketfButton);
        driver.switchTo().alert().accept();
    }
    @Step
    public void clickEdit(){
        clickButton(editFormLink);
    }


}
