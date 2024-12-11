package ua.ucu.edu.task2;

public class BirthdayMailCode implements MailCode{

    @Override
    public String generate(Client client) {
        return String.format("Hello %s! Happy %d Birthday!", client.getName(), client.getAge());
    }
    
}
