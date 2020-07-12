package com.jaewoo.mapstruct.baeldung.mapper;

import com.jaewoo.mapstruct.baeldung.domain.SimpleDestination;
import com.jaewoo.mapstruct.baeldung.domain.SimpleSource;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.assertj.core.api.Assertions.assertThat;

class SimpleSourceDestinationMapperTest {
    private SimpleSourceDestinationMapper mapper = Mappers.getMapper(SimpleSourceDestinationMapper.class);

    @Test
    void sourceToDestination() {
        SimpleSource source = new SimpleSource();
        source.setName("Name Test");
        source.setDescription("Description");

        SimpleDestination destination = mapper.sourceToDestination(source);
        assertThat(destination.getName()).isEqualTo(source.getName());
        assertThat(destination.getDescription()).isEqualTo(source.getDescription());
    }
}