package server.model;


import model.Ciudad;
import model.Result;

import java.util.List;

public interface ICityService {

    List<Ciudad> getAll();
    Result<Ciudad> get(String nombre);
    boolean update(Ciudad nombre);
    boolean delete(String dni);
    Result<Ciudad> add(Ciudad ciudad);

}
