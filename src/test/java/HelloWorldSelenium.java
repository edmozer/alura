import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldSelenium {
@Test
    public void hello(){
    System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
    WebDriver browser = new ChromeDriver();
    browser.navigate().to("http://localhost:8080/leiloes");
    browser.quit();
}

}
