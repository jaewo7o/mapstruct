package com.jaewoo.mapstruct.stackabuse.mapper;

import com.jaewoo.mapstruct.stackabuse.dto.DoctorDto;
import com.jaewoo.mapstruct.stackabuse.dto.DoctorSaveDto;
import com.jaewoo.mapstruct.stackabuse.dto.EducationSaveDto;
import com.jaewoo.mapstruct.stackabuse.entity.Doctor;
import com.jaewoo.mapstruct.stackabuse.entity.DoctorPatientSummary;
import com.jaewoo.mapstruct.stackabuse.entity.Education;
import com.jaewoo.mapstruct.stackabuse.entity.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.stream.Collectors;

@Mapper( uses = {PatientMapper.class})
public interface DoctorMapper {
    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

    @Mapping(target = "id", defaultValue = "-1")
    @Mapping(source = "doctor.specialty", target = "specialization")
    @Mapping(source = "doctor.patientList", target = "patientDtoList")
    @Mapping(source = "education.degreeName", target = "degree")
    DoctorDto toDto(Doctor doctor, Education education);

    void updateModel(DoctorSaveDto doctorDto, @MappingTarget Doctor doctor);

    default DoctorPatientSummary toDoctorPatientSummary(Doctor doctor, Education education) {
        return DoctorPatientSummary.builder()
                .doctorId(doctor.getId())
                .doctorName(doctor.getName())
                .patientCount(doctor.getPatientList().size())
                .patientIds(doctor.getPatientList()
                                .stream()
                                .map(Patient::getId)
                                .collect(Collectors.toList()))
                .institute(education.getInstitute())
                .specialization(education.getDegreeName())
                .build();
    }
}