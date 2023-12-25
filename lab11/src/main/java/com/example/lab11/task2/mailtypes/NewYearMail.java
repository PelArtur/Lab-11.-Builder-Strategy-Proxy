package com.example.lab11.task2.mailtypes;

import lombok.Getter;

@Getter
public class NewYearMail implements MailCode
{
    private final String mailTopic = "New Year";
    private final String mail = "Happy New Year 2024!!!";
}
