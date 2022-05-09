package server;

import server.controllers.CiudadController;
import server.model.JsonTransformer;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        get(API.Routes.ALL_PERSON, CiudadController::getCities, new JsonTransformer<>());
        get(API.Routes.PERSON, CiudadController::getCity,new JsonTransformer<>());
        post(API.Routes.PERSON, CiudadController::addCity, new JsonTransformer<>());

        // Oracle
       // post(API.Routes.AUTHENTICATE, EmpleadoController::authenticate, new JsonTransformer<>());
    }
}


