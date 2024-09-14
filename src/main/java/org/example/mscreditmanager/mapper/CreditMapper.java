package org.example.mscreditmanager.mapper;

import org.example.mscreditmanager.dao.entity.CreditEntity;
import org.example.mscreditmanager.model.client.ConveyorRequest;
import org.example.mscreditmanager.model.response.CreditResponse;

public enum CreditMapper {
    CREDIT_MAPPER;
    public CreditResponse buildCreditResponse(CreditEntity creditEntity) {
        return CreditResponse.builder()
                .id(creditEntity.getId())
                .term(creditEntity.getTerm())
                .interest(creditEntity.getInterest())
                .monthlyPayment(creditEntity.getMonthlyPayment())
                .amount(creditEntity.getAmount())
                .requestedAmount(creditEntity.getRequestedAmount())
                .status(creditEntity.getStatus())
                .createdAt(creditEntity.getCreatedAt())
                .updatedAt(creditEntity.getUpdatedAt())
                .build();
    }
    public ConveyorRequest buildConveyorRequest(CreditEntity creditEntity) {
        return ConveyorRequest.builder()
                .amount(creditEntity.getAmount())
                .monthlyPayment(creditEntity.getMonthlyPayment())
                .interest(creditEntity.getInterest())
                .term(creditEntity.getTerm())
                .build();
    }
}
