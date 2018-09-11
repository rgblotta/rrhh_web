/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.ofa.cursojava.rrhh.web1.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import utn.ofa.cursojava.rrhh.web1.modelo.Cliente;

/**
 *
 * @author User
 */
@Stateless
public class ClienteService {
    @PersistenceContext(unitName= "RRHH_WEB_PU")
    private EntityManager em;
    
    public Cliente guardar(Cliente c){
        if(c.getId()==null) em.persist(c);
        else c = em.merge(c);
        
        em.flush();
        em.refresh(c);
        return c;
    }
    
    public List<Cliente> todos(){
        return this.em.createQuery("SELECT c FROM Cliente c").getResultList();
    }
   
}
