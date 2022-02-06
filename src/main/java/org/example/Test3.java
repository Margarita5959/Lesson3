package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test3 {
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
        driver.findElement(By.xpath(".//a[@href='https://www.sinsay.com/ru/ru/home']")).click();
        driver.findElement(By.xpath(".//a[@href='https://www.sinsay.com/ru/ru/home/bathroom/categories']")).click();
        driver.findElement(By.xpath(".//div[@class='close']")).click();
        driver.findElement(By.xpath(".//h3[@class='sc-eCstlR iEEdBj es-product-name']/a[@href='https://www.sinsay.com/ru/ru/0948g-90x/dywan-lazienkowy-40x60cm']")).click();
        driver.findElement(By.xpath(".//img[@src='https://www.sinsay.com/media/catalog/product/cache/40/a4e40ebdc3e371adff845072e1c73f37/0/9/0948G-90X-999-1_6.jpg']")).click();
        driver.findElement(By.xpath(".//li[@data-selen-product-id='2760425']")).click();
        driver.findElement(By.xpath(".//span[@class='add-to-cart-prefix']")).click();

        driver.quit();
    }
}
