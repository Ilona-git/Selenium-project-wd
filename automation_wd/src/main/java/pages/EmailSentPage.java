package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
    private WebDriver driver;

    private By errorMessage = By.linkText("Internal Server Error");

    public EmailSentPage (WebDriver driver){
        this.driver =driver;
    }

    public String getErrorText(){
    return driver.findElement(errorMessage).getText();
    }
}
