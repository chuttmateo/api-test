package com.solvd.carina.api.products;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@Endpoint(url = "${config.base_url}/products/${id}", methodType = HttpMethodType.DELETE)
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
@ResponseTemplatePath(path = "api/products/_delete/rs.json")
public class DeleteProductById extends AbstractApiMethodV2 {
    public DeleteProductById() {
    }
    public void setId(int id){
        replaceUrlPlaceholder("id", String.valueOf(id));
    }
}
