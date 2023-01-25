package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {
    WebDriver driver;
    WebDriverWait wait;


    By avatarIcon = By.cssSelector("img.avatar");
    By song = By.xpath("//article[@data-test='song-card']");
    By playlist = By.xpath("//section[@id='playlists']//li[5]");
    By userAvatarIcon;

    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public WebElement getUserAvatar() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(userAvatarIcon));
    }


}
