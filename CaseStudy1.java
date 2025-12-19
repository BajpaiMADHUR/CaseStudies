package org.samples;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CaseStudy1 {
    static WebDriver driver;

    @Test(priority = 0)
    public void EdurekaProfile() throws InterruptedException
    {
        driver.get("https://edureka.co/");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.linkText("Log In")).click();
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("si_popup_email")));
        Thread.sleep(2000);
        actions.click();
        actions.sendKeys("TestingEdureka@gmail.com");
        Thread.sleep(2000);
        actions.build().perform();
        actions.moveToElement(driver.findElement(By.id("si_popup_passwd")));
        Thread.sleep(2000);
        actions.click();
        actions.sendKeys("12345678");
        Thread.sleep(2000);
        actions.build().perform();
        actions.moveToElement(driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")));
        Thread.sleep(2000);
        actions.click();
        actions.build().perform();
        //chropath is a plugin that helps us to write complex xpath
        driver.findElement(By("//a[@class='dropdown-toggle trackbutton']//img[@class='img30']")).click();
        Thread.sleep(2000);
        driver.findElement(By("//ul[@class='dropdown-menu user-menu profile-xs hidden-sm hidden-xs']//a")).click();
        Thread.sleep(2000);
        WebDriverWait waitElement = new WebDriverWait(driver, 20 );
        waitElement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='active']//a[d")))
    }
}











