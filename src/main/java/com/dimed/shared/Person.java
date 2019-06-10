package com.dimed.shared;

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

    public String name;
    public Sex gender;
    public String emailAddress;

}