package server.model;

import model.AuthenticateData;
import model.Ciudad;
import model.Result;

public interface IEmpleadoService {

    Result<Ciudad> authenticate(AuthenticateData authenticateData);

}
