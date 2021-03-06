package com.jaewoo.mapstruct.baeldung.mapper;

import com.jaewoo.mapstruct.baeldung.domain.Person;
import com.jaewoo.mapstruct.baeldung.domain.PersonDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonMapperTest {
    @Test
    public void givenPersonEntitytoPersonWithExpression_whenMaps_thenCorrect() {
        Person entity = new Person();
        entity.setName("Micheal");
        PersonDTO personDto = PersonMapper.INSTANCE.personToPersonDTO(entity);

        Assertions.assertThat( entity.getId() ).isNull();
        Assertions.assertThat( personDto.getId() ).isNotNull();
        Assertions.assertThat( personDto.getName() ).isEqualTo( entity.getName() );
    }
}