package services;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GeneralService {
    public static RequestSpecification request;
    public static Response response;

    public static void setRequest(String URL, String cookies, String bearerToken, String host) {
        return;
    }
}