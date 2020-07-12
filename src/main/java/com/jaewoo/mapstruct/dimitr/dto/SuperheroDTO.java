package com.jaewoo.mapstruct.dimitr.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SuperheroDTO {
    private Long id;
    private String name;
    private SuperheroIdentityDTO identity;
    private SuperheroAlignmentDTO alignment;
}
