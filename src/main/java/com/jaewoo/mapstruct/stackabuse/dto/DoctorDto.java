package com.jaewoo.mapstruct.stackabuse.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Setter
@Getter
public class DoctorDto {
    private int id;
    private String name;
    private String degree;
    private String specialization;

    private List<PatientDto> patientDtoList;
}