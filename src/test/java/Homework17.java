import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class Homework17 extends BaseTest {

    HomePage homepage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @Test
   public void addSongToPlaylist()  {
        loginPage.provideEmail("demo@class.com");
        loginPage.providePassword("te$t$tudent");
        loginPage.clickSubmitBtn();
    }


//        login("demo@class.com", "te$t$tudent");
//        Thread.sleep(2000);
//        grabASong();
//
//    }
//
public void grabASong(){
        WebElement song = driver.findElement(By.xpath("//article[@data-test='song-card']"));
        WebElement playlist = driver.findElement(By.xpath("//section[@id='playlists']//li[5]"));

        Actions acts = new Actions(driver);
        acts.clickAndHold(song)
                .release(playlist)
                .build()
                .perform();

        playlist.click();
////        acts.dragAndDrop(song, playlist).build().perform();

    }
}
