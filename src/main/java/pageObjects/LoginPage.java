package pageObjects;

import core.MetodFactors;
import org.openqa.selenium.By;

/**
 * Created by Kailend on 25.11.2016.
 */
public class LoginPage extends MetodFactors {

    private By mailTextBox=By.id("Users_email");
    private By passwordTexBox=By.id("Users_password");
    private By enterButton=By.xpath(".//button[@type=\"submit\"]");

    public void inputMail(String str){
        type(mailTextBox,str);
    }

    public void inputPassword(String str){
        type(passwordTexBox,str);
    }

    public void clickEnter(){
        clickButton(enterButton);
    }

    public void login(String mail,String password){
        inputMail(mail);
        inputPassword(password);
        clickEnter();
    }


}
