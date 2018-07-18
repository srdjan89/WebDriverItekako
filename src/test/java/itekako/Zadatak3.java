/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itekako;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Срђан
 */
public class Zadatak3 {

    public Zadatak3() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Ignore
    @Test
    public void dayTwoThird() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
                + "/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://toolsqa.com/automation-practice-form/");
        driver.manage().window().maximize();
        WebElement radioSex = driver.findElement(By.xpath("//*[@id=\"sex-0\"]"));
        radioSex.click();
        WebElement yearsExp = driver.findElement(By.id("exp-2"));
        yearsExp.click();
        List<WebElement> proffesion = driver.findElements(By.name("profession"));
        proffesion.get(1).click();
        WebElement seleniumIde = driver.findElement(By.cssSelector("#tool-1"));
        seleniumIde.click();
        driver.quit();
    }

}
