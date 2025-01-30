package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HerokuAppTest {
//    1. Open browser site https://the-internet.herokuapp.com/login
//    2. Enter value in Username field
//    3. Enter value in Password field
//    4. click "Login" button

    @Test
    public void registrationHerokuAppTest(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//*[@class=\"fa fa-2x fa-sign-in\"]")).click();
        driver.quit();
    }

}