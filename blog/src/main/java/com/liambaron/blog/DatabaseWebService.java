package com.liambaron.blog;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Liam Baron
 */
@WebService(serviceName = "DatabaseWebService")
public class DatabaseWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "createAcc")
    public String createAcc(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "delAcc")
    public String delAcc(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}