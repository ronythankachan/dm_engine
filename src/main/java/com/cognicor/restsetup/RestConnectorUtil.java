package com.cognicor.restsetup;

import com.cognicor.exceptions.RestConnectorException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class RestConnectorUtil {

    @Autowired
    Map<String, String> connectorMap;

    @Autowired
    RestConnector restConnector;

    public String performPostForNLU(String requestBody, Map<String, String> headers, String url) throws RestConnectorException {
        return restConnector.post(requestBody, headers, url, 0);
    }
}
