/**
 * Created by Krzysztof on 2016-11-30.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Banktest extends Util{


    public static WebDriver driver; // Selenium control driver
    private static String baseUrl; // baseUrl of Website Guru99

    public static void setUp() {


        //String baseUrl = new String(Util.baseUrl);
        String firefox = new String(Util.firefox);
        String gecodriver = new String(Util.gecodriver);
        System.setProperty(gecodriver,firefox);

    }
    public static void main(String[] args) throws Exception {

        String  actualTitle;
        setUp();

      //  System.setProperty(gecodriver,firefox);
        WebDriver driver = new FirefoxDriver();
        String baseUrl = new String(Util.baseUrl);

        driver.get(baseUrl);

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