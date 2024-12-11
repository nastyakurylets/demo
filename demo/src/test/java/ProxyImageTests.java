import org.junit.jupiter.api.Test;

import ua.ucu.edu.task3.ProxyImage;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProxyImageTests {

    @Test
    public void testLazyLoading() {
        ProxyImage proxyImage = new ProxyImage("test.jpg");

        assertNull(proxyImage.getRealImage());

        proxyImage.display();

        assertNotNull(proxyImage.getRealImage());
    }
}