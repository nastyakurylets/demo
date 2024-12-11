package ua.ucu.edu.task2;

public class Main {
    public static void main(String[] args) {
        
        Client client = Client.builder()
        .name("Client Name")
        .age(100)
        .email("client@test.email")
        .build();

        MailInfo mailInfo = new MailInfo(client, client_s -> "Hello random mail" + client_s.getEmail());
        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfo);
    }   
}