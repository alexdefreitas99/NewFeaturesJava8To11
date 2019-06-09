package com.dimed.java8;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    Sex gender;
    String emailAddress;

}