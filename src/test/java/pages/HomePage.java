package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver ldriver;

    By ContinueById = By.xpath("//*[.='Continue']");

    public HomePage(WebDriver gdriver) {

        ldriver = gdriver;

        //Assert.assertEquals("");

    }

    public void clickcontinue() {

        ldriver.findElement(ContinueById).click();
    }
}


