package org.example.mscreditmanager.mapper;

import org.example.mscreditmanager.dao.entity.CustomerEntity;
import org.example.mscreditmanager.model.request.CustomerRequest;
import org.example.mscreditmanager.model.response.CustomerResponse;

public enum CustomerMapper {
    CUSTOMER_MAPPER;

    public CustomerEntity buildCustomerEntity(CustomerRequest customerRequest) {
        return CustomerEntity.builder()
                .pin(customerRequest.getPin())
                .fullName(customerRequest.getFullName())
                .phoneNumber(customerRequest.getPhoneNumber())
                .createdAt(customerRequest.getCreatedAt())
                .updatedAt(customerRequest.getUpdatedAt())
                .build();
    }

    public CustomerResponse buildCustomerResponse(CustomerEntity customerEntity) {
       return CustomerResponse.builder()
                .id(customerEntity.getId())
                .pin(customerEntity.getPin())
                .fullName(customerEntity.getFullName())
                .phoneNumber(customerEntity.getPhoneNumber())
                .createdAt(customerEntity.getCreatedAt())
                .updatedAt(customerEntity.getUpdatedAt())
                .build();
    }
}
