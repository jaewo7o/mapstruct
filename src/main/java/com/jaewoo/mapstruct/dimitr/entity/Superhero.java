package com.jaewoo.mapstruct.dimitr.entity;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Superhero {
    private Long id;
    private String firstName;
    private String lastName;
    private String name;
    private boolean good;
}