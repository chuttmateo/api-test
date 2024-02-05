package com.solvd.carina.products;

import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class ProductTest {

    @Test
    @MethodOwner(owner = "mchutt")
    public void getProductByIdTest(){
        GetProductById api = new GetProductById();
        api.setId(1);
        api.callAPIExpectSuccess();
        api.validateResponseAgainstSchema("api/products/_get/rs.schema");
    }

    @Test
    @MethodOwner(owner = "mchutt")
    public void postProductTest(){
        PostProduct api = new PostProduct();
        api.callAPIExpectSuccess();
        api.validateResponse();
        api.validateResponseAgainstSchema("api/products/_post/rs.schema");
    }

    @Test
    @MethodOwner(owner = "mchutt")
    public void putProductTest(){
        PutProduct api = new PutProduct();
        api.setId(1);
        api.callAPIExpectSuccess();
        api.validateResponse(JSONCompareMode.STRICT_ORDER);
        api.validateResponseAgainstSchema("api/products/_put/rs.schema");
    }

    @Test
    @MethodOwner(owner = "mchutt")
    public void deleteProductTest(){
        DeleteProductById api = new DeleteProductById();
        api.setId(1);
        api.callAPIExpectSuccess();
        api.validateResponse(JSONCompareMode.STRICT_ORDER);
    }

}
