/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.ofa.cursojava.rrhh.web1.modelo;

import java.util.Date;
import java.util.List;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;


/**
 *
 * @author User
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType=DiscriminatorType.INTEGER, name="TIPO_EMPLEADO")
public abstract class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    protected String nombre;
    protected String correoElectronico;
    protected String cuil;
    protected Integer horasTrabajadas;
    protected Date fechaIngreso;
    
    @ManyToMany(mappedBy="empleados")
    protected List<Proyecto> proyectosAsignados;

    public Empleado() {
    }
    
    public abstract Double salario();
    public abstract Boolean esEfectivo();
    public abstract Boolean esContratado();

      
    public Integer getId() {
         return id;
    }
    public void setId(Integer id) {
         this.id = id;
    }
     
    public String getNombre() {
         return nombre;
    }
    public void setNombre(String nombre) {
         this.nombre = nombre;
    }
    
    public String getCorreoElectronico() {
         return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
         this.correoElectronico = correoElectronico;
    }

    public String getCuil() {
        return cuil;
    }
    public void setCuil(String cuil) {
         this.cuil = cuil;
    }    
    
    public Date getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(Date fechaIngreso) {
         this.fechaIngreso = fechaIngreso;
    } 
    
    public Integer getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(Integer horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }

     //---- Lista de Proyectos
    public void setProyectosAsignados(List<Proyecto> lisProy) {
        this.proyectosAsignados = (List<Proyecto>) lisProy;
    }

    public List<Proyecto> getProyectosAsignados() {
        return proyectosAsignados;
    }
}
