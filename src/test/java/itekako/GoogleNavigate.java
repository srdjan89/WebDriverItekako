/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itekako;

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
public class GoogleNavigate {

    public GoogleNavigate() {
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
    public void openGooglePage() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
                + "/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.store.demoqa.com/");
        driver.manage().window().maximize();
        WebElement myAcc = driver.findElement(By.cssSelector("#account > a"));
        myAcc.click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("https://www.store.demoqa.com/");
        driver.navigate().refresh();
        driver.quit();

    }
}
