package com.cognicor.restsetup;

import com.cognicor.exceptions.RestConnectorException;
import org.springframework.stereotype.Component;

import java.net.http.HttpClient;
import java.util.Map;

@Component
public class RestConnector {

    public String post(String requestBody, Map<String, String> headers, String relativeURL,int retryCount) throws RestConnectorException{
        return null;
    }
    public String get(){
        return null;
    }

}
