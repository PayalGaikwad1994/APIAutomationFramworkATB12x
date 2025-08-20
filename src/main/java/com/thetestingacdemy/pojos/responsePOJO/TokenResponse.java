package com.thetestingacdemy.pojos.responsePOJO;

import java.util.LinkedHashMap;
import java.util.Map;


public class TokenResponse {

    private String token;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


}


