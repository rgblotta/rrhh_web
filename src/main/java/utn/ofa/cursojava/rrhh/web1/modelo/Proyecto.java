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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author User
 */
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nombre;
    private String descripcion;
    private Double presupuestoMaximo;
    
    @ManyToMany
    @JoinTable(name="PROYECTO_EMPLEADO",
            joinColumns=@JoinColumn(name="ID_PROYECTO"),
            inverseJoinColumns=@JoinColumn(name="ID_EMPLEADO"))
    private List<Empleado> empleados;
    
    @ManyToOne
    //@JoinColumn(name="ID_CLIENTE")
    @JoinColumn(name="id_cliente")
    private Cliente cliente;
    
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
       public String getDescripcion() {
         return descripcion;
    }
    public void setDescripcion(String descripcion) {
         this.descripcion = descripcion;
    }
    
     public double getPresupuestoMaximo() {
        return presupuestoMaximo;
    }
    public void setPresupuestoMaximo(Double presupuestoMaximo) {
        this.presupuestoMaximo = presupuestoMaximo;
    }
    
    public String toString(){
        String texto_proy = "Proyecto - "+ "Id; "+ id + ", Nombre; "+ nombre
                                         + ", Desc.: "+ descripcion +", Presup.Max: "+ presupuestoMaximo;
        return texto_proy;
    }
    
    public boolean equals(Object obj) {
        Proyecto p = (Proyecto)obj;
 
        return p.getNombre().equals(this.getNombre());
    }

    public void setCliente(Cliente cli1) {
        this.cliente = cli1;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    //---- Lista de Empleados
    public void setEmpleados(List<Empleado> lisEmp) {
        this.empleados = (List<Empleado>) lisEmp;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}
    