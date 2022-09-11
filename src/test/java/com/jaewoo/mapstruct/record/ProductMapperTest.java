package com.jaewoo.mapstruct.record;

import static org.junit.jupiter.api.Assertions.*;

import com.jaewoo.mapstruct.baeldung.mapper.EmployeeMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

class ProductMapperTest {

    private ProductMapper mapper = Mappers.getMapper(ProductMapper.class);

    @Test
    void toEntity() {
        // given
        ProductDto dto = new ProductDto("TEST", 234.11);

        // when
        Product product = mapper.dtoToEntity(dto);

        // then
        Assertions.assertThat(product.getProductName()).isEqualTo(dto.productName());
        Assertions.assertThat(product.getPrice()).isEqualTo(dto.price());
    }

    @Test
    void entityToDto() {
        // given
        Product product = new Product("TEST", 234.11);

        // when
        ProductDto dto = mapper.entityToDto(product);

        // then
        Assertions.assertThat(dto.productName()).isEqualTo(product.getProductName());
        Assertions.assertThat(dto.price()).isEqualTo(product.getPrice());
    }
}