/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.modelo;

import java.util.Date;

/**
 *
 * @author POINT
 */
public class Persona {
    String cedula;
    String nombre1;
    String nombre2;
    String apellido1;
    String apellido2;
    String direccion;
    Date fechaNacimiento;
    String correo;
    
    public Persona(){
    
    }

    public Persona(String cedula, String nombre1, String nombre2, String apellido1, String apellido2, String direccion, Date fechaNacimiento, String correo) {
        this.cedula = cedula;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
    }
    
    
}
