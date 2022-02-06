package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test1
{
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions ();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.sinsay.com/ru/ru/");
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyButtonAccept\"]"));
        webElement.click();

        driver.findElement(By.xpath(".//button[@class='action-btn__ActionBtn-zbpc1m-1 jXHDbp']")).click();
        driver.findElement(By.xpath(".//button[@class='button__ButtonPrimary-zerqf2-0 button__ButtonSecondary-zerqf2-1 gEnmSO hjeEaK']")).click();

        driver.findElement(By.id("email_id")).sendKeys("greiddimmijoumi-4198@yopmail.com");
        driver.findElement(By.id("firstname_id")).sendKeys("Ирина");
        driver.findElement(By.id("lastname_id")).sendKeys("Некрасова");
        driver.findElement(By.id("password_id")).sendKeys("Пароль");
        driver.findElement(By.xpath(".//button[@class='primary__PrimaryButtonComponent-sc-1pct4vx-0 fDECVK']")).click();

        driver.quit();

    }

}
