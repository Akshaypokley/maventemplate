import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by akshay.pokley on 12/14/2017.
 */
public class Selenium {

    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://192.168.1.84:520/");

    }
}
