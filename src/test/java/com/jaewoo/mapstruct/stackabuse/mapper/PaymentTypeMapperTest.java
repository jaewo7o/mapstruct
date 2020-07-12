package com.jaewoo.mapstruct.stackabuse.mapper;

import com.jaewoo.mapstruct.stackabuse.constant.PaymentType;
import com.jaewoo.mapstruct.stackabuse.constant.PaymentTypeView;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PaymentTypeMapperTest {

    @Test
    void paymentTypeMappingTest() {
        PaymentTypeView paymentTypeView = PaymentTypeMapper.INSTANCE.paymentTypeToPaymentTypeView(PaymentType.CARD_MASTER);
        Assertions.assertThat(paymentTypeView).isEqualTo(PaymentTypeView.CARD);
    }

}