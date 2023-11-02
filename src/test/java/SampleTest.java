import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
//from selenium.webdriver.chrome.service import Service;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class SampleTest {
    public static WebDriver driver;

     

    public static void main(String[] args) {

//        from selenium import webdriver
//        from selenium.webdriver.chrome.service import Service service = Service()
//        webdriver driver;
//        options = webdriver.ChromeOptions()
//        driver = webdriver.Chrome(service=service, options=options)
////# ... Automate something here
//        driver.quit()

//        service = Service();
        try {
        ChromeOptions options = new ChromeOptions();
        options.setBrowserVersion("118");
        driver =new ChromeDriver(options);
        driver.get("https://lims-val.ghdna.io/ghlims/logon.jsp?sso=n");
        WebElement username = driver.findElement(By.xpath("//*[@id='databaseusername']"));
        username.sendKeys("AutoUser_BSM_C");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//*[@id='databasepassword'][@type='password']"));
        password.sendKeys("abcd1234");
        driver.findElement(By.xpath("//*[@id='submitlogin']")).click();
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Logged in successfully");
        driver.quit();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
