package com.jaewoo.mapstruct.stackabuse.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class DoctorSaveDto {
    private int id;
    private String name;
    private String degree;
}