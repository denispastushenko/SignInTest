package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;

import java.awt.*;
import java.awt.event.KeyEvent;

import static utils.ActionsUtils.*;


public class HomePage extends Page {


    @FindBy(xpath = "//button[@aria-controls='global-sign-in']")
    private static WebElement dropDowListSignIn;

    @FindBy(xpath = "//a[@data-component='MenuButton']")
    private static WebElement linkSignIn;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public SignInPage actionButtonSignIn() throws AWTException {
        Robot rb = new Robot();
        rb.keyPress(KeyEvent.VK_ESCAPE);
        WaitUtils.waitForElementForWebElem(dropDowListSignIn, 5);
        actionClick(dropDowListSignIn);
        WaitUtils.waitForElementForWebElem(linkSignIn, 5);
        actionClick(linkSignIn);
        return new SignInPage(driver.get());
    }
}


