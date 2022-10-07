package com.example.springsecurity.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Developer {
    private Long Id;
    private String firstName;
    private String lastName;
}
