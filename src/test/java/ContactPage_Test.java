

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ContactPage;

public class ContactPage_Test {

    @Test
    public void contactTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        ContactPage cp = new ContactPage(driver);
        cp.openUrl();
        cp.submitForm("Ujitha", "uji@gmail.com", "Need information regarding products");
    }
}

