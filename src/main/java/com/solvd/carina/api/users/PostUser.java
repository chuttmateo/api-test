package com.solvd.carina.api.users;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@Endpoint(url = "${config.base_url}/auth/login", methodType = HttpMethodType.POST)
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
@RequestTemplatePath(path = "api/users/_post/rq.json")
public class PostUser extends AbstractApiMethodV2 {
    public PostUser() {
    }

}
