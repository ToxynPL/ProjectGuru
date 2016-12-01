/**
 * Created by Krzysztof on 2016-11-30.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.*;

public class Banktest extends Util{

  /**  public class setBaseURL() {
        WebDriver driver = new FirefoxDriver();
        String baseUrl = new String(Util.baseUrl);
        driver.get(baseUrl);

    }**/


    public static void main(String[] args) {


        /*
       Util User = new Util();
       Util Password = new Util();
       */

        String baseUrl = new String(Util.baseUrl);
        String firefox = new String (Util.firefox);
        String gecodriver = new String (Util.gecodriver);
      /*
       String User = "mngr55722";
       String Password = "udadajA";
       String expectedTitle = "Login successful";
       String alertMessage = "";
       */


        System.setProperty(gecodriver,firefox);
        WebDriver driver = new FirefoxDriver();
       // String alertMessage = "";
        driver.get(baseUrl);
        driver.findElement(By.name("uid")).sendKeys(Util.User);
        driver.findElement(By.name("password")).sendKeys(Util.Password);
        driver.findElement(By.name("btnLogin")).click();


        //driver.switchTo().alert().getText();

       // driver.switchTo().alert().accept();



       // System.out.println(alertMessage);
        driver.close();
    }

}