package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleAppTest {
//    1. Open browser site http://www.uitestingplayground.com/sampleapp
//    2. Enter value in User Name field
//    3. Enter value in Password field
//    4. click "Log In" button

    @Test
    public void registrationSampleAppTest(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestingplayground.com/sampleapp");
        driver.findElement(By.name("UserName")).sendKeys("Serega");
        driver.findElement(By.name("Password")).sendKeys("pwd");
        driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]")).click();
        driver.quit();
    }
}
