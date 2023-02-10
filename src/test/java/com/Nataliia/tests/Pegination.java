package com.Nataliia.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pegination {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://etsy.com");
        driver.navigate().refresh();
        driver.navigate().forward();
        String currentURL=driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);
        String currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);
       WebElement signInButton=driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']"));
       signInButton.click();
       WebElement GoogleSighIn= driver.findElement(By.xpath("//button[@data-google-button='true']"));
       GoogleSighIn.click();




    }
}
