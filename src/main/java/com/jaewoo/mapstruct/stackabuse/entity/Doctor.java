package com.jaewoo.mapstruct.stackabuse.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Setter
@Getter
public class Doctor {
    private int id;
    private String name;
    private String specialty;

    private List<Patient> patientList;
}
