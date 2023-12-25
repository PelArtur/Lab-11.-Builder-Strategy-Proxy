package com.example.lab11.task1;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@ToString
public class User
{
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;

    @Singular("hobby")
    private List<String> hobby;
}