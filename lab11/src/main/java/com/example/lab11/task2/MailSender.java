package com.example.lab11.task2;

public class MailSender
{
    public void sendMail(MailInfo mailInfo)
    {
        System.out.println("User with id " + mailInfo.getClient().getId() +
                " was successfully sent a message with a topic: '" +
                mailInfo.getMailCode().getMailTopic() + "'");
    }
}
