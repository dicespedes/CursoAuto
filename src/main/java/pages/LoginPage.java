package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passField = By.id("password");
    private By loginButton = By.cssSelector("#login button");
    public LoginPage(WebDriver diver){

        this.driver = diver;
    }

    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void setPass(String pass){
        driver.findElement(passField).sendKeys(pass);
    }
    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
