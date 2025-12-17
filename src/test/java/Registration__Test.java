

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration__Test {

    @Test
    public void successfully() {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Registration first = new Registration(driver);

        first.openUrl("https://tutorialsninja.com/demo/index.php?route=account/register");
        first.enterFirstname("ujitha");
        first.enterLastname("k");
        first.enterEmail("uji@gmail.com");
        first.enterTelephone("9767527818");
        first.enterPassword("uji@123");
        first.confirmPassword("uji@123");
        first.toSubscribe();
        first.toAgree();
        first.toEnter();
    }
}

