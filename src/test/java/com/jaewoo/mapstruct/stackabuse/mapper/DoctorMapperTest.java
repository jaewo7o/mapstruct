package com.jaewoo.mapstruct.stackabuse.mapper;

import com.jaewoo.mapstruct.stackabuse.dto.DoctorDto;
import com.jaewoo.mapstruct.stackabuse.dto.DoctorSaveDto;
import com.jaewoo.mapstruct.stackabuse.dto.EducationSaveDto;
import com.jaewoo.mapstruct.stackabuse.entity.Doctor;
import com.jaewoo.mapstruct.stackabuse.entity.Education;
import com.jaewoo.mapstruct.stackabuse.entity.Patient;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DoctorMapperTest {

    @Test
    void toDto() {
        Doctor doctor = getDoctor();

        Education education = new Education();
        education.setDegreeName("학사");
        education.setInstitute("건국대학교");
        education.setYearOfPassing(4);

        DoctorDto doctorDto = DoctorMapper.INSTANCE.toDto(doctor, education);

        Assertions.assertThat(doctorDto.getSpecialization()).isEqualTo(doctor.getSpecialty());
        //Assertions.assertThat(doctorDto.getDegree()).isEqualTo(education.getDegreeName());
        Assertions.assertThat(doctorDto.getPatientDtoList().size()).isEqualTo(doctor.getPatientList().size());
    }

    @Test
    void updateModel() {
        Doctor doctor = getDoctor();

        DoctorSaveDto dto = new DoctorSaveDto();
        dto.setId(doctor.getId());
        dto.setName("테스트 이름");
        dto.setDegree("석사");

        DoctorMapper.INSTANCE.updateModel(dto, doctor);

        Assertions.assertThat(dto.getName()).isEqualTo(doctor.getName());
    }

    Doctor getDoctor() {
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setName("Jaewoo Jung");
        doctor.setSpecialty("Surgery");

        Patient patient1 = new Patient();
        patient1.setId(1);
        patient1.setName("Patient 1");

        Patient patient2 = new Patient();
        patient2.setId(2);
        patient2.setName("Patient 2");

        doctor.setPatientList(Arrays.asList(patient1, patient2));

        return doctor;
    }
}