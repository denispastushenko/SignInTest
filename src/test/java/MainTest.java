import anotation.Proxy;
import org.testng.annotations.Test;
import pages.Page;
import utils.ProxyServerUtils;

import java.awt.*;
import java.io.IOException;

public class MainTest extends BaseTest {

    @Test
    @Proxy
    public void signInToWebsite() throws IOException, AWTException {
        ProxyServerUtils.startServer();
        Page.getDriver().get(SITE);
        signInPage = homePage.actionButtonSignIn();
        findItemPage = signInPage.signInMethod("dpastushenko1996@gmail.com", "1996baba");
        findItemPage.checkTestForSignIn("dpastushenko1996@gmail.com");
        addToCartPage = findItemPage.printItemName("ball");
        viewCartPage = addToCartPage.addToCart();
        viewCartPage.viewCartPage();
        viewCartPage.checkForItemsInTheCart();
    }
}
