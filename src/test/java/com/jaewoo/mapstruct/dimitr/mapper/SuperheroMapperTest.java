package com.jaewoo.mapstruct.dimitr.mapper;

import com.jaewoo.mapstruct.dimitr.dto.SuperheroDTO;
import com.jaewoo.mapstruct.dimitr.entity.Superhero;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperheroMapperTest {

    @Test
    void toSuperheroDTO() {
        Superhero superhero = new Superhero();
        superhero.setId(1L);
        superhero.setName("Super Man");
        superhero.setFirstName("Super");
        superhero.setLastName("Man");
        superhero.setGood(true);

        SuperheroDTO superheroDTO = SuperheroMapper.INSTANCE.toSuperheroDTO(superhero);

        Assertions.assertThat(superheroDTO.getAlignment().name()).isEqualTo("GOOD");
        Assertions.assertThat(superheroDTO.getIdentity().getFirstName()).isEqualTo("Super");
    }
}