package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.sinsay.com/ru/ru/");
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyButtonAccept\"]"));
        webElement.click();

        driver.findElement(By.xpath(".//a[@href='https://www.sinsay.com/ru/ru/shop-online']")).click();
        driver.findElement(By.xpath(".//p[@class='sidebar__Title-sc-4xriee-3 dXqanV']/a[@href='https://www.sinsay.com/ru/ru/shop-online/collection/outerwear']")).click();
        driver.findElement(By.xpath(".//div[@class='close']")).click();
        driver.findElement(By.xpath(".//a[@href='https://www.sinsay.com/ru/ru/shop-online/collection/outerwear/denim-jackets']")).click();
        driver.findElement(By.xpath(".//img[@alt='Джинсовая куртка - blue jeans - 1277F-55J - SINSAY']")).click();

        driver.quit();

    }
}
