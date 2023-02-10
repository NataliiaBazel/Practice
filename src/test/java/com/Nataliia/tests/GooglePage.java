package com.Nataliia.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GooglePage {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement SearchBox=driver.findElement(By.xpath("//input[@class='gLFyf']"));
        SearchBox.sendKeys("Nataliia");
        SearchBox.sendKeys(Keys.ENTER);
        String title=driver.getTitle();
        System.out.println("title = " + title);
        WebElement LinkImages=driver.findElement(By.linkText("Images"));
        LinkImages.click();
        driver.navigate().back();
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        System.out.println("allLinks = " + allLinks.size());

        for (WebElement each : allLinks) {
            System.out.println("each.getText() = " + each.getText());

        }
    }

}
