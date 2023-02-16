
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.Duration;
 class DuotifyTest {


        static DriverManager BrowserFactory;

        public static void main(String[] args) throws InterruptedException, SQLException {

            // String browser = "chrome";

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            System.setProperty("webdriver.chrome.driver", "C:/Users/abdul/Downloads/chromedriver_win32");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("http://duotify.us-east-2.elasticbeanstalk.com/browse.php");

            String firstName = "Muslima";
            String lastName = "Akhrorova";
            String userName = "MuslimaAkhrorova";

            driver.findElement(By.name("firstName")).sendKeys(firstName);
            driver.findElement(By.name("lastName")).sendKeys(lastName);
            driver.findElement(By.name("username")).sendKeys(userName);

            String email = "";
            String password = "";

            driver.findElement(By.name("email")).sendKeys(email);
            driver.findElement(By.name("password")).sendKeys(password);

            driver.findElement(By.name("password2")).sendKeys(password);

            driver.findElement(By.name("registerButton")).click();
            Thread.sleep(2000);

            String expectedMessage = "Your username must be between 5 and 25 characters";
            String actualMessage = driver.findElement(By.id("usernameError")).getText();

         Assert. assertEquals(expectedMessage, actualMessage);



            driver.quit();



        }
    }
