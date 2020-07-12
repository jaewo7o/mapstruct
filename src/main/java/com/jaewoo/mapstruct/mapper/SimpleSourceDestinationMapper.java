package com.jaewoo.mapstruct.mapper;

import com.jaewoo.mapstruct.domain.SimpleDestination;
import com.jaewoo.mapstruct.domain.SimpleSource;
import org.mapstruct.Mapper;

@Mapper
public interface SimpleSourceDestinationMapper {
    SimpleDestination sourceToDestination(SimpleSource source);
    SimpleSource destinationToSource(SimpleDestination destination);
}
