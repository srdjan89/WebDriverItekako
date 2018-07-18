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
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Срђан
 */
public class Zadatak5 {

    public Zadatak5() {
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

    //@Ignore
    @Test
    public void dayTwoFifth() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
                + "/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://toolsqa.com/automation-practice-form/");

        Select select = new Select(driver.findElement(By.name("selenium_commands")));
        select.selectByIndex(0);
        select.deselectByIndex(0);
        select.selectByVisibleText("Navigation Commands");
        select.deselectByVisibleText("Navigation Commands");
        List<WebElement> allOptions = select.getOptions();
        for (int i = 0; i < allOptions.size(); i++) {
            System.out.println(allOptions.get(i).getText());
            select.selectByIndex(i);
        }
        select.deselectAll();
        driver.quit();
    }

}
