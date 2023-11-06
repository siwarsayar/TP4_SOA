package service;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

// Cette annotation indique que cette classe est un service web.
@WebService
public class CalculatriceWS
{

    // Cette méthode est exposée en tant que service web et prend deux paramètres.
    // Elle effectue la somme de ces deux paramètres et renvoie le résultat.
    @WebMethod(operationName = "somme")
    public double somme(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a + b;
    }
}
