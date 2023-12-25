package com.example.lab11.task1;

public class Main
{
    public static void main(String[] args)
    {
        User user1 = User
                .builder()
                .name("Artur")
                .age(18)
                .gender(Gender.MALE)
                .weight(187)
                .height(77)
                .hobby("Swimming")
                .build();

        User user2 = User.builder()
                .name("David")
                .age(18)
                .gender(Gender.MALE)
                .hobby("Valorant")
                .build();

        User user3 = User.builder()
                .name("Anastasia")
                .age(18)
                .gender(Gender.FEMALE)
                .build();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
