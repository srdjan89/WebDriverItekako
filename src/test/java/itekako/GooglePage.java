/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itekako;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Срђан
 */
public class GooglePage {

    public GooglePage() {
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

        //driver.navigate().to("https://www.google.com/");
        driver.get("https://www.google.com/");
        //driver.get("http://www.svetitrifun.edu.rs/");
        driver.manage().window().maximize();
        System.out.println("Page title is \"" + driver.getTitle() + "\", and its length is " + driver.getTitle().length());
        if (driver.getCurrentUrl().equals("https://www.google.com/")) {
            System.out.println("Correct page is open!");
        }
        System.out.println("Page source length is " + driver.getPageSource().length() + ".");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("page.txt"));
            writer.write(driver.getPageSource());
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        driver.quit();

    }
}
