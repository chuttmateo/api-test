package com.solvd.carina.api.products;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@Endpoint(url = "${config.base_url}/products/add", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/products/_post/rq.json")
@ResponseTemplatePath(path = "api/products/_post/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PostProduct extends AbstractApiMethodV2 {
    public PostProduct() {
    }

}
