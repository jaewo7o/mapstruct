package com.jaewoo.mapstruct.baeldung.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Employee {
    private int id;
    private String name;
    private Division division;
    private Date startDt;
}
