package com.jaewoo.mapstruct.stackabuse.mapper;

import com.jaewoo.mapstruct.stackabuse.dto.PatientDto;
import com.jaewoo.mapstruct.stackabuse.entity.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PatientMapper {
    PatientMapper INSTANCE = Mappers.getMapper(PatientMapper.class);

    PatientDto toDto(Patient patient);

    @Mapping(source = "dateOfBirth", target = "dateOfBirth", dateFormat = "dd/MM/yyyy")
    Patient toModel(PatientDto patientDto);
}