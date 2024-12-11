import org.junit.jupiter.api.Test;

import ua.ucu.edu.task2.BirthdayMailCode;
import ua.ucu.edu.task2.Client;
import ua.ucu.edu.task2.MailBox;
import ua.ucu.edu.task2.MailInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MailBoxTests {

    @Test
    public void testAddMailInfo() {
        MailBox mailBox = new MailBox();

        Client client = Client.builder()
                               .name("Jo")
                               .age(22)
                               .sex("Female")
                               .email("jomarchisthebest@truth.com")
                               .build();

        MailInfo mailInfo = new MailInfo(client, new BirthdayMailCode());

        mailBox.addMailInfo(mailInfo);

        assertEquals(1, mailBox.getInfos().size());
    }

    @Test
    public void testSendAll() {
        MailBox mailBox = new MailBox();

        Client firstClient = Client.builder()
                               .name("Jo")
                               .age(22)
                               .sex("Female")
                               .email("jomarchisthebest@truth.com")
                               .build();
        Client secondClient = Client.builder()
                                .name("Beth")
                                .age(20)
                                .sex("Female")
                                .email("bethmarchisthebest@truth.com")
                                .build();

        MailInfo mailInfo1 = new MailInfo(firstClient, new BirthdayMailCode());
        MailInfo mailInfo2 = new MailInfo(secondClient, new BirthdayMailCode());

        mailBox.addMailInfo(mailInfo1);
        mailBox.addMailInfo(mailInfo2);

        mailBox.sendAll();

        assertEquals(2, mailBox.getInfos().size());
    }
}