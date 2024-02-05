package com.solvd.carina.api.users;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@Endpoint(url = "${config.base_url}/auth/me", methodType = HttpMethodType.GET)
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetUserByToken extends AbstractApiMethodV2 {

    public GetUserByToken() {
    }
    public void setToken(String token){
        setHeader("Authorization", "Bearer " + token);
    }
}
