/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.ofa.cursojava.rrhh.web1.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author User
 */
@Entity
@DiscriminatorValue( value = "2")
public class Contratado extends Empleado{ 
    private Double costoHora;
    private Double salarioEmp;
    
    @Override
    public Double salario() {
         salarioEmp = costoHora * horasTrabajadas;
         
         return salarioEmp;
    }
    @Override
    public Boolean esEfectivo() {
        return false;
    }

    @Override
    public Boolean esContratado() {
        return true;
    }
    
    
    public double getCostoHora() {
        return costoHora;
    }

    public void setCostoHora(Double costoHora) {
        this.costoHora = costoHora;
    }
    
}
