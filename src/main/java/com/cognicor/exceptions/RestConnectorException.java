package com.cognicor.exceptions;

import com.cognicor.enums.RestErrors;
import lombok.Getter;

@Getter
public class RestConnectorException extends Exception{
    private final int statusCode;
    private final String result;
    private final boolean isHttpCode;
    private final RestErrors restErrors;
    public RestConnectorException(int statusCode, String result, boolean isHttpCode, RestErrors restErrors){
        super("Status Code: " +  statusCode + " message: " + result);
        this.statusCode = statusCode;
        this.result = result;
        this.isHttpCode = isHttpCode;
        this.restErrors = restErrors;
    }

}
