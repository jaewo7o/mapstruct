package com.jaewoo.mapstruct.stackabuse.mapper;

import com.jaewoo.mapstruct.stackabuse.constant.PaymentType;
import com.jaewoo.mapstruct.stackabuse.constant.PaymentTypeView;
import org.mapstruct.Mapper;
import org.mapstruct.ValueMapping;
import org.mapstruct.ValueMappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PaymentTypeMapper {
    PaymentTypeMapper INSTANCE = Mappers.getMapper(PaymentTypeMapper.class);

    @ValueMappings({
        @ValueMapping(source = "CARD_VISA", target = "CARD"),
        @ValueMapping(source = "CARD_MASTER", target = "CARD"),
        @ValueMapping(source = "CARD_CREDIT", target = "CARD")
    })
    PaymentTypeView paymentTypeToPaymentTypeView(PaymentType paymentType);
}
