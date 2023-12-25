package com.example.lab11.task2;

import com.example.lab11.task2.mailtypes.*;

public class Main
{
    public static void main(String[] args)
    {
        Client client1 = new Client("Artur", 18, Gender.MALE);
        Client client2 = new Client("David", 18, Gender.MALE);
        Client client3 = new Client("Anastasia", 18, Gender.FEMALE);
        MailBox mailBox = new MailBox();

        MailInfo mailInfo1 = new MailInfo(client1, new BirthdayMail());
        MailInfo mailInfo2 = new MailInfo(client1, new GiftMail());
        MailInfo mailInfo3 = new MailInfo(client2, new GiftMail());
        MailInfo mailInfo4 = new MailInfo(client3, new GiftMail());
        MailInfo mailInfo5 = new MailInfo(client3, new BirthdayMail());
        MailInfo mailInfo6 = new MailInfo(client1, new NewYearMail());
        MailInfo mailInfo7 = new MailInfo(client2, new NewYearMail());
        MailInfo mailInfo8 = new MailInfo(client3, new NewYearMail());

        mailBox.addMailInfo(mailInfo1);
        mailBox.addMailInfo(mailInfo2);
        mailBox.addMailInfo(mailInfo3);
        mailBox.addMailInfo(mailInfo4);
        mailBox.addMailInfo(mailInfo5);
        mailBox.sendAll();

        System.out.println("-----------------------------------------------------------------------");

        mailBox.addMailInfo(mailInfo6);
        mailBox.addMailInfo(mailInfo7);
        mailBox.addMailInfo(mailInfo8);
        mailBox.sendAll();
    }
}
