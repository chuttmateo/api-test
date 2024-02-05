package com.solvd.carina.products;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@Endpoint(url = "${config.base_url}/products/${id}", methodType = HttpMethodType.PUT)
@ResponseTemplatePath(path = "api/products/_put/rs.json")
@RequestTemplatePath(path = "api/products/_put/rq.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PutProduct extends AbstractApiMethodV2 {
    public PutProduct() {
    }
    public void setId(int id){
        replaceUrlPlaceholder("id", String.valueOf(id));
    }
}

