import anotation.Proxy;
import org.testng.annotations.Test;
import pages.Page;
import utils.ProxyServerUtils;

import java.io.IOException;

public class ProxyTest extends  BaseTest {
    @Test
    @Proxy
    public void mobProxyServerTest() throws InterruptedException, IOException {
        ProxyServerUtils.startServer();
        Page.getDriver().get(SITE);
        Thread.sleep(3000);
    }
}
