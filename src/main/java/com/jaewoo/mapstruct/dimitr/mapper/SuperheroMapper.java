package com.jaewoo.mapstruct.dimitr.mapper;

import com.jaewoo.mapstruct.dimitr.dto.SuperheroDTO;
import com.jaewoo.mapstruct.dimitr.entity.Superhero;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.*;

@Mapper(uses = { SuperheroAlignmentMapper.class })
public interface SuperheroMapper {

    SuperheroMapper INSTANCE = Mappers.getMapper(SuperheroMapper.class);

    @Mappings({
        @Mapping(source = "good", target = "alignment"),
        @Mapping(target = "identity", expression = "java(new com.jaewoo.mapstruct.dimitr.dto.SuperheroIdentityDTO(superhero.getFirstName(), superhero.getLastName()))")
    })
    SuperheroDTO toSuperheroDTO(Superhero superhero);

    List<SuperheroDTO> toSuperheroDTOs(List<Superhero> superheroes);
}
