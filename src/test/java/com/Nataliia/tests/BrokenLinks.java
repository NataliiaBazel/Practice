package com.Nataliia.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenLinks {
    public static void main(String[] args) {

        //setting up chrome
        WebDriverManager.chromedriver().setup();
        // create WebDriver instance
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://etsy.com");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        //closing any current tab
       // driver.close();

        String title=driver.getTitle();
        System.out.println("title = " + title);
        Assert.assertEquals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone", title);
        //closing all browser window opened by driver
        driver.quit();

    }

}
