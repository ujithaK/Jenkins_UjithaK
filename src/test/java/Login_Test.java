
import pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_Test {

	//For Successful Login
    @Test
    public void positiveLogin() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Login lp = new Login(driver);
        lp.openUrl();
        lp.login("uji@gmail.com", "uji@123");
    }

    //For unsuccessful login
    @Test
    public void negativeLogin() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Login lp = new Login(driver);
        lp.openUrl();
        lp.login("uji.com", "ujitha");
    }
}

