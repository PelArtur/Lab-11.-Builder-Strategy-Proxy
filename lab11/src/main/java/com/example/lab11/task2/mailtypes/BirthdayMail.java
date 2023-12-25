package com.example.lab11.task2.mailtypes;

import lombok.Getter;

@Getter
public class BirthdayMail implements MailCode
{
    private final String mailTopic = "Birthday";
    private final String mail = "\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89Happy Birthday!\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89";
}
