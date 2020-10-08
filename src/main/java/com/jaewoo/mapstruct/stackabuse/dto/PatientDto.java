package com.jaewoo.mapstruct.stackabuse.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
public class PatientDto {
    private int id;
    private String name2;
    private LocalDate dateOfBirth;
}