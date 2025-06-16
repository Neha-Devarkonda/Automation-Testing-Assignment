package com.example.tests;

import org.springframework.boot.test.context.SpringBootTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

@SpringBootTest
public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/absolute/path/to/chromedriver");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://example-e-commerce.com"); // Your application under test
    }

    @AfterClass
    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }
    }
}
