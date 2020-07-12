package com.jaewoo.mapstruct.stackabuse.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class PatientDto {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
}