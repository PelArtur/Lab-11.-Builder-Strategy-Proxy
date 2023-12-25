package com.example.lab11.task2;

import java.util.ArrayList;
import java.util.List;

public class MailBox
{
    private List<MailInfo> infos = new ArrayList<>();
    private final MailSender mailSender = new MailSender();

    public void addMailInfo(MailInfo mailInfo)
    {
        infos.add(mailInfo);
    }

    public void sendAll()
    {
        for(MailInfo mailInfo : infos)
        {
            mailSender.sendMail(mailInfo);
        }
        infos = new ArrayList<>();
    }
}
