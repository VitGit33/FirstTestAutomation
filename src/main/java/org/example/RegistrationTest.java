package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {

    private static WebDriver driver = null;
    @BeforeClass
    public void initBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void openSiteTest() throws InterruptedException {
        driver.get("https://electonicstore.com/");
        Thread.sleep(10000);

        By myAccountButtonLocator = By.xpath("//*[@class = 'list-inline']//a[contains(@title,'My Account')]");
        WebElement myAccountButtonElement = driver.findElement(myAccountButtonLocator);
        myAccountButtonElement.click();
        Thread.sleep(2000);

        By myRegisterButtonLocator = By.xpath("//*[@class = 'list-inline']//a[contains(text(),'Register')]");
        WebElement myRegisterButtonElement = driver.findElement(myRegisterButtonLocator);
        myRegisterButtonElement.click();
        Thread.sleep(2000);

        By firstNameInputLocator = By.xpath("//input[@name = 'firstname']");
        WebElement myFirstNameInputElement = driver.findElement(firstNameInputLocator);
        myFirstNameInputElement.sendKeys("Donald");
        Thread.sleep(2000);

        By lastNameInputLocator = By.xpath("//input[@name = 'lastname']");
        WebElement myLastNameInputElement = driver.findElement(lastNameInputLocator);
        myLastNameInputElement.sendKeys("Trump");
        Thread.sleep(2000);

        By emailInputLocator = By.xpath("//input[@name = 'email']");
        WebElement myEmailNameInputElement = driver.findElement(emailInputLocator);
        myEmailNameInputElement.sendKeys("donald@gmail.com");
        Thread.sleep(2000);

        By telephoneInputLocator = By.xpath("//input[@name = 'telephone']");
        WebElement myTelephoneInputElement = driver.findElement(telephoneInputLocator);
        myTelephoneInputElement.sendKeys("7737021919");
        Thread.sleep(2000);

        By passwordInputLocator = By.xpath("//input[@name = 'password']");
        WebElement myPasswordInputElement = driver.findElement(passwordInputLocator);
        myPasswordInputElement.sendKeys("12345");
        Thread.sleep(2000);

        By passwordConfirmInputLocator = By.xpath("//input[@id=\"input-confirm\"]");
        WebElement myPasswordConfirmInputElement = driver.findElement(passwordConfirmInputLocator);
        myPasswordConfirmInputElement.sendKeys("12345");
        Thread.sleep(2000);

        By subscribeLocator = By.xpath("//input[@name=\"newsletter\"]");
        WebElement subscribeElement = driver.findElement(subscribeLocator);
        subscribeElement.click();
        Thread.sleep(2000);

        By privacyCheckBoxLocator = By.xpath("//input[@type=\"checkbox\"]");
        WebElement privacyCheckBoxElement = driver.findElement(privacyCheckBoxLocator);
        privacyCheckBoxElement.click();
        Thread.sleep(2000);

        By continueButtonLocator = By.xpath("//input[@value=\"Continue\"]");
        WebElement continueButtonElement = driver.findElement(continueButtonLocator);
        continueButtonElement.click();
        Thread.sleep(3000);

    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
