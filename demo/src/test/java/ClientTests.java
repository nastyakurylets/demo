import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.ucu.edu.task2.Client;

public class ClientTests {

    @Test
    public void testClient() {
        Client client = Client.builder()
                               .name("Jo")
                               .age(22)
                               .sex("Female")
                               .email("jomarchisthebest@truth.com")
                               .build();

        assertEquals("Jo", client.getName());
        assertEquals(22, client.getAge());
        assertEquals("Female", client.getSex());
        assertEquals("jomarchisthebest@truth.com", client.getEmail());
    }
}