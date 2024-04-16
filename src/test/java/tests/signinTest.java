package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.signinPage;

import java.time.Duration;

public class signinTest {

    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
        signinPage logInPage = new signinPage(driver);


        logInPage
                .enterfirstName("Abdulaziz")
                .enterlastName("Alghamdi")
                .enteremail("abdulaziz.jameel.alghamdi12@gmail.com")
                .enterTelephone("0542679244")
                .enterpassword("12345678aa")
                .enterpasswordConfirm("12345678aa")
                .clickSubscribeNO()
                .clickSubscribeYES()
                .clickchekBox()
                .clickconformButton()
                .clickcontinue();


    }
}
