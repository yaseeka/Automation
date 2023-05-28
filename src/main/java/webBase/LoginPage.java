package webBase;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    By ttxUserName=By.id("user-name");
    By txtPassword=By.id("password");
    By btnLogin=By.id("login-button");


    public void enterUserName(String username){
        webDriver.findElement(ttxUserName).clear();
        webDriver.findElement(ttxUserName).sendKeys(username);


    }

    public void enterPassword(String password){
        webDriver.findElement(txtPassword).clear();
        webDriver.findElement(txtPassword).sendKeys(password);
    }

    public String getfontsize(){
        String fSize=webDriver.findElement(btnLogin).getCssValue("font-size");
        System.out.println(fSize);
        return fSize;
    }
    public void clickLoginButton(){
        webDriver.findElement(btnLogin).click();
    }
}
