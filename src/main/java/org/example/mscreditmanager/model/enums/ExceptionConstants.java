package org.example.mscreditmanager.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionConstants {
    CUSTOMER_NOT_FOUND("CUSTOMER_NOT_FOUND","Card not found"),
    CLIENT_ERROR("CLIENT_EXCEPTION","Exception from client"),
    UNEXPECTED_EXCEPTION("UNEXPECTED_EXCEPTION","Unexpected exception occurred"),
    CREDIT_NOT_FOUND("CREDIT_NOT_FOUND","Credit not found");
    private String code;
    private String message;
}
