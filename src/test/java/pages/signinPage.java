package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signinPage {

    WebDriver ldriver;

    By firstnameById = By.id("input-firstname");
    By lastnameById = By.id("input-lastname");
    By emailById = By.id("input-email");
    By telephoneById = By.id("input-telephone");
    By passwordById = By.id("input-password");
    By passwordConfirmById = By.id("input-confirm");

    By SubscribeNO = By.xpath("//*[.='Yes']");
    By SubscribeYES = By.xpath("//*[.='No']");

    By chekBox = By.xpath("//label[text()='I have read and agree to the ']");

    By conformButton = By.xpath("//input[@type='submit']");

    public signinPage(WebDriver gdriver) {
        ldriver = gdriver;
    }

    public signinPage enterfirstName(String firstName) {
        ldriver.findElement(firstnameById).sendKeys(firstName);
        return this;
    }

    public signinPage enterlastName(String lastname) {
        ldriver.findElement(lastnameById).sendKeys(lastname);
        return this;
    }

    public signinPage enteremail(String email) {
        ldriver.findElement(emailById).sendKeys(email);
        return this;
    }

    public signinPage enterTelephone(String Telephone) {
        ldriver.findElement(telephoneById).sendKeys(Telephone);
        return this;
    }

    public signinPage enterpassword(String password) {
        ldriver.findElement(passwordById).sendKeys(password);
        return this;
    }

    public signinPage enterpasswordConfirm(String passwordConfirm) {
        ldriver.findElement(passwordConfirmById).sendKeys(passwordConfirm);
        return this;
    }

    public signinPage clickSubscribeNO() {
        ldriver.findElement(SubscribeNO).click();
        return this;
    }

    public signinPage clickSubscribeYES() {
        ldriver.findElement(SubscribeYES).click();
        return this;
    }

    public signinPage clickchekBox() {
        ldriver.findElement(chekBox).click();
        return this;
    }

    public HomePage clickconformButton() {
        ldriver.findElement(conformButton).click();
        return new HomePage(ldriver);
    }
}

