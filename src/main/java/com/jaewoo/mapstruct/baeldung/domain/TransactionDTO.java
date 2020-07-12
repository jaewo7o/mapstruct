package com.jaewoo.mapstruct.baeldung.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TransactionDTO {
    private String uuid;
    private Long totalInCents;
}
