/**
 * Created by Krzysztof on 2016-11-30.
 */
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxBinary;
import java.io.File;
import java.util.concurrent.TimeUnit;


public class Banktest extends Util{


   static WebDriver driver; // Selenium control driver
   private static String baseUrl; // baseUrl of Website Guru99


    public static void setUp() throws Exception {

        String firefox = Util.firefox;
        String geckodriver = Util.geckodriver;
        System.setProperty(geckodriver,firefox);

        //File pathToBinary = new File(Util.FIREFOX_PATH);
       // FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);

        FirefoxProfile firefoxProfile = new FirefoxProfile();
        driver = new FirefoxDriver(firefoxProfile);

        baseUrl = Util.baseUrl;
        //driver.manage().timeouts().implicitlyWait(Util.WaitTime, TimeUnit.SECONDS);
        //driver.get(baseUrl);
        //String baseUrl = new String(Util.baseUrl);


        driver.manage().timeouts().implicitlyWait(Util.WaitTime, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }
    public static void main(String[] args) throws Exception {

        String  actualTitle;
        setUp();

      //  System.setProperty(gecodriver,firefox);
       // WebDriver driver = new FirefoxDriver();
       // String baseUrl = Util.baseUrl;

        //driver.get(baseUrl);

        driver.findElement(By.name("uid")).clear();
        driver.findElement(By.name("uid")).sendKeys(Util.User);

        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(Util.Password);

        driver.findElement(By.name("btnLogin")).click();

        actualTitle = driver.getTitle();
        if (actualTitle.contains(Util.ExpectTitle)){

                System.out.println("Test case: Passed");
        }
        else {
            System.out.println("Test case: Failed");
        }

        driver.close();

    }

}