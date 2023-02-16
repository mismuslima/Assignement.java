import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLException;
public class DemoFaker {




        public static void main(String[] args) throws InterruptedException, SQLException {
            // String url = "https://www.google.com";
            // String script = "window.location = \'"+url+"\'";
            WebDriver driver = (WebDriver) new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", "C:/Users/abdul/Downloads/chromedriver_win32");



            driver.get("http://duotify.us-east-2.elasticbeanstalk.com/register.php");

            String expectedT="Welcome to Duotify!";
            String actualT=driver.getTitle();

            if(actualT.equals(expectedT)){
                System.out.println("Test Passed");
            }
            else{
                System.out.println("Test Failed");
            }



        }
    }

