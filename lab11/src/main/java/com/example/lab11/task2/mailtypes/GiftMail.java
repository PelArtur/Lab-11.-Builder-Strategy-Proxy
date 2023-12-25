package com.example.lab11.task2.mailtypes;

import lombok.Getter;

@Getter
public class GiftMail implements MailCode
{
    private final String mailTopic = "Gift";
    private final String mail = "These gifts are for you:\uD83C\uDF81\uD83C\uDF81\uD83C\uDF81";
}
