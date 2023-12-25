package com.example.lab11.task2;

import lombok.Getter;

@Getter
public class Client
{
    private static int lastID = 0;
    private final int id;
    private final String name;
    private final int age;
    private final Gender sex;

    public Client(String name, int age, Gender sex)
    {
        this.id = lastID++;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
