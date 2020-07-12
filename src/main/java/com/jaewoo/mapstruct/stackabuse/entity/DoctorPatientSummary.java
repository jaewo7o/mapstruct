package com.jaewoo.mapstruct.stackabuse.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Setter
@Getter
@Builder
public class DoctorPatientSummary {
    private int doctorId;
    private int patientCount;
    private String doctorName;
    private String specialization;
    private String institute;
    private List<Integer> patientIds;
}
