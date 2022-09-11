package com.jaewoo.mapstruct.record;

import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {
    Product dtoToEntity(ProductDto dto);
    ProductDto entityToDto(Product product);
}
