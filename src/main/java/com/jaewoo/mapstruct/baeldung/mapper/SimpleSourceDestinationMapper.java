package com.jaewoo.mapstruct.baeldung.mapper;

import com.jaewoo.mapstruct.baeldung.domain.SimpleDestination;
import com.jaewoo.mapstruct.baeldung.domain.SimpleSource;
import org.mapstruct.Mapper;

@Mapper
public interface SimpleSourceDestinationMapper {
    SimpleDestination sourceToDestination(SimpleSource source);
    SimpleSource destinationToSource(SimpleDestination destination);
}
