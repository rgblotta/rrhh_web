/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.ofa.cursojava.rrhh.web1.resources;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import utn.ofa.cursojava.rrhh.web1.modelo.Cliente;

/**
 *
 * @author User
 */
@Stateless
@Path("/cliente")
public class ClienteResource {

    @GET
    public Response listarCliente(){
       return Response.ok("GET").build();
    }
    
    @POST
    public Response crearCliente(Cliente cli){
       System.out.println("CLIENTE RECIBIDO: "+cli);
       return Response.ok("POST "+cli.getNombre()).build();
    }
}
