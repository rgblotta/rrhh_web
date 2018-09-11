/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.ofa.cursojava.rrhh.web1.modelo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author User
 */
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cliente;
    private String nombre;
    private String correo;
    private String cuil;

    @OneToMany(mappedBy = "cliente")
    private List<Proyecto> proyectos;
    
    public Integer getId() {
         return id_cliente;
    }
    public void setId(Integer id_cliente) {
         this.id_cliente = id_cliente;
    }    
    
    public String getNombre() {
         return nombre;
    }
    public void setNombre(String nombre) {
         this.nombre = nombre;    
    }
    
    public String getCorreo() {
         return correo;
    }
    public void setCorreo(String correo) {
         this.correo = correo;
    }
    
    public String getCuil() {
         return cuil;
    }
    public void setCuil(String cuil) {
         this.cuil = cuil;
    }        
}
