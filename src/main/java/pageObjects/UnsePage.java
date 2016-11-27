package pageObjects;

import core.MetodFactors;
import dataForWork.DataUserFirst;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Kailend on 26.11.2016.
 */
public class UnsePage extends MetodFactors{
        private By nameTextBox = By.id("Users_first_name");
        private By lastNameTextBox = By.id("Users_last_name");
        private By dayBirthdayDropDownList = By.id("Users_birth_day");
        private By monthBirthdayDropDonsList = By.id("Users_birth_month");
        private By yearBirthdayDropDownList = By.id("Users_birth_year");
        private By manGenderRadioButton = By.xpath(".//label[@for=\"Users_gender_0\"]");
        private By womenGenderRadionButton = By.xpath(".//label[@for=\"Users_gender_1\"]");
        private By cityDropDownList = By.id("Users_city_id");
        private By numberTelephoneTextBox = By.id("Users_phone");
        private By nextButton = By.xpath(".//button[@class=\"button button--action\"]");
        private By saveButton=By.xpath(".//button[contains(@class,\"button--confirm\")]");


        public void inputName(String str) {
            type(nameTextBox, str);
        }

        public void inputLastName(String str) {
            type(lastNameTextBox, str);
        }

        public void setDayBirthday(String day) {
            clickButton(dayBirthdayDropDownList);
            clickButton(By.xpath(".//*[@id='Users_birth_day']/*[@value=\"" + day + "\"]"));
        }

        public void setMonth(String month) {
            clickButton(monthBirthdayDropDonsList);
            clickButton(By.xpath(".//*[@id='Users_birth_month']/*[@value=\"" + month + "\"]"));
        }

        public void setYear(int year) {
            clickButton(yearBirthdayDropDownList);
            clickButton(By.xpath(".//*[@id='Users_birth_year']/*[@value=\"" + year + "\"]"));
        }

        public void setGender(String str) {
            if (str.equals("m")) {
                clickButton(manGenderRadioButton);
            } else clickButton(womenGenderRadionButton);
        }

        public void setCity(String str) {
            clickButton(cityDropDownList);
            clickButton(By.xpath(".//*[@id='Users_city_id']/*[text()=\"" + str + "\"]"));
        }

        public void inputNumber(String telephone) {
            type(numberTelephoneTextBox, telephone);
        }

        public void clickNext() {
            clickButton(nextButton);
        }

    public void clickSave() {
        clickButton(saveButton);
        WebDriverWait webDriverWait =new WebDriverWait(driver,4);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class=\"window_popup section\"]")));
    }


        public void fillForm(DataUserFirst user) {
            inputName(user.name);
            inputLastName(user.surname);
            setDayBirthday(user.day);
            setMonth(user.month);
            setYear(user.year);
            setGender(user.gender);
            setCity(user.city);
            inputNumber(user.number);
            clickSave();
        }
    }

