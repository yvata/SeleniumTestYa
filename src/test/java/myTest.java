import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myTest {

    WebDriver webDriver;

    public class yaPage {
        WebDriver webDriver;

    }

    @Before
    public void starttt() {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get("https://market.yandex.ru/?clid=703");
    }
    @After
    public void stopp(){
        if (webDriver !=null){
            webDriver.quit();
        }
    }

@Test
public void yaMarketLook() throws InterruptedException {
        WebElement Look =webDriver.findElement(By.id("header-search"));
    Look.sendKeys("microsoft xbox one s");
    webDriver.findElement(By.className("button2")).click();
//    webDriver.findElement(By.partialLinkText("Игровая консоль Microsoft Xbox One S 1TB два геймпада")).click();
    webDriver.findElement(By.className("n-snippet-card2__main-price-wrapper")).click();
    Thread.sleep(1000);
    webDriver.findElement(By.partialLinkText("Отложить")).click();
    webDriver.findElement(By.className("popup-informer__controls")).click();

    Thread.sleep(10000);
}
//@Test
//public void yaMarketPostpone(){
//    WebElement Postpone =webDriver.findElement(By.id("1"));
//    Postpone.sendKeys("Игровая консоль Microsoft Xbox One S 1TB два геймпада");
//}

//    @Test       //чек товара
//    public void yaMarketCheak()   {
//        Assert.assertEquals(webDriver.getTitle(), "Игровая консоль Microsoft Xbox One S 1TB два геймпада");
//
//
//    }


}