package com.jaewoo.mapstruct.stackabuse.mapper;

import com.jaewoo.mapstruct.stackabuse.dto.PatientDto;
import com.jaewoo.mapstruct.stackabuse.entity.Patient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatientMapperTest {

    @Test
    void toDto() {
        Patient patient = new Patient();
        patient.setId(1);
        patient.setName("정재우");

        PatientDto dto = PatientMapper.INSTANCE.toDto(patient);

        System.out.println(dto.toString());
    }
}