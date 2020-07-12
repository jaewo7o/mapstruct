package com.jaewoo.mapstruct.dimitr.mapper;

import com.jaewoo.mapstruct.dimitr.dto.SuperheroAlignmentDTO;

public class SuperheroAlignmentMapper {
    public SuperheroAlignmentDTO toAlignment(boolean good) {
        if (good) {
            return SuperheroAlignmentDTO.GOOD;
        } else {
            return SuperheroAlignmentDTO.EVIL;
        }
    }
}
