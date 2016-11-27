package tests;

import core.BrowEnter;
import dataForWork.DataUserFirst;
import myListeners.MyWorkEventListeners;
import myListeners.SimpleListener;
import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.FormUser;
import pageObjects.LoginPage;
import pageObjects.NotebookPage;
import pageObjects.UnsePage;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by Kailend on 26.11.2016.
 */
@Listeners({SimpleListener.class})
public class AddDataAndDelete extends BrowEnter{

    @Title("Login,enterData,delete")
    @org.testng.annotations.Test
    public void task() throws InterruptedException {
        driver=new EventFiringWebDriver(driver).register(new MyWorkEventListeners());
        driver.get("http://rabota.nur.kz/login");
        LoginPage loginPage=new LoginPage();
        String login="gvs_1986@mail.ru";
        loginPage.login(login,login);
        driver.get("http://rabota.nur.kz/applicant/notebook");
        NotebookPage noteBookPage=new NotebookPage();
        DataUserFirst user=new DataUserFirst();
        noteBookPage.clickCreateResume();
        FormUser formUser=new FormUser();
        formUser.clickEditPersonalData();
        UnsePage unsePage=new UnsePage();
        unsePage.fillForm(user);
        formUser.fillAllForm(user);
        Assert.assertTrue(isElement(By.xpath(".//*[@class=\"b-one-resume js-resume-container\"]"),1));
        noteBookPage.clickEdit();

        // проверить, что все элементы которые добавил отображаются на странице
        Assert.assertTrue(driver.findElement(By.xpath(".//div[@class=\"title\"]")).getText().equals(user.name+" "+user.surname));
        Assert.assertTrue(isElement(By.xpath(".//*[@class=\"static\"]//*[contains(text(),\""+user.city+"\")]"),1));
        Assert.assertTrue(isElement(By.xpath(".//*[@class=\"contacts\"]//*[contains(text(),\""+user.number+"\")]"),1));
        Assert.assertTrue(isElement(By.xpath(".//*[@class=\"contacts\"]//*[contains(text(),\" gvs_1986@mail.ru\")]"),1));
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@class=\"position\"]")).getText().equals(user.positionForSearch));
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@class=\"salary\"]")).getText().replace(" ","").contains(user.salary));
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@class=\"purpose-block\"]//div[1]/p[1]")).getText().equals(user.purpose));
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@class=\"padding_by_params education\"]/div[1]")).getText().contains(user.institute));
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@class=\"padding_by_params education\"]/div[2]")).getText().contains(user.speciality));
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@class=\"padding_by_params education\"]/div[2]")).getText().contains(user.diplom));
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@class=\"padding_by_params education\"]/div[3]")).getText().contains(user.cityEducation));
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@class=\"language_skill\"]/span[1]")).getText().toLowerCase().contains(user.language));
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@class=\"one-training__title\"]")).getText().trim().contains(user.courseName));
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@class=\"one-training__date\"]")).getText().trim().contains(Integer.toString(user.yearEndCourse)));
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@class=\"one-training__site\"]")).getText().trim().contains(user.siteOrganizator=user.siteOrganizator.substring(user.siteOrganizator.lastIndexOf("/")+1)));
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@class=\"one-training__site\"]")).getText().trim().contains(user.siteOrganizator));
        Assert.assertTrue(isElement(By.xpath(".//div[contains(text(),\"Company\")]"),1));
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@class=\"vacancy\"]")).getText().trim().contains(user.positionPrevios));
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@class=\"description\"]/p[1]")).getText().trim().contains(user.summeryExperience));
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@class=\"value_form\"]/p[1]")).getText().trim().contains(user.additionaInfo));

        formUser.setDeleteSocialNetwork();
        formUser.clickDoneButton();
        noteBookPage.deleteFirstForm();
        WebDriverWait webDriverWait=new WebDriverWait(driver,4);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class=\"b-one-resume js-resume-container\"]")));
        Assert.assertFalse(isElement(By.xpath(".//*[@class=\"b-one-resume js-resume-container\"]"),1));

    }
}
