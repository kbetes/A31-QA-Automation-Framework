import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Homework19c extends BaseTest {
@Test
public void deletePlaylist () {

    login("kbetestack@gmail.com", "te$t$tudent");
    WebElement getPlaylist = driver.findElement(By.cssSelector("a[href*='22380']"));
    getPlaylist.click();
    WebElement delPlaylist = driver.findElement(By.cssSelector(".btn-delete-playlist"));
    delPlaylist.click();

    }

}