package com.cognicor.enums;

import lombok.Getter;

@Getter
public enum RestErrors {
    UNEXPECTED_ERROR("00", "Unexpected error occurred during processing of %s API, Exception message:%s"),
    CONNECTIVITY_ERROR("01", "Error connecting to %s API, Exception message: %s"),
    CO_TIMEOUT_ERROR("02", "Connection timeout while connecting to %s API"),
    SO_TIMEOUT_ERROR("03", "Socket timeout while connecting to %s API");

    private final String errorCode;
    private final String errorMessage;
    RestErrors(String errorCode, String errorMessage){
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

}
