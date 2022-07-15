/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.vista;

import com.sun.jdi.PathSearchingVirtualMachine;
import ec.edu.intsuperior.modelo.Persona;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author POINT
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        
        Persona acero= new Persona();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("29/04/2002");
        Date fec= new Date();
        fec.setYear(0);
        
        
        
       Persona ob1=new Persona("1753985728", "Miguel", "Angel", "Acero", "Isama", "Quito,legarda y occidental", fec , "miguelangelaceroisama@gmail.com");
        
           System.out.println(ob1.getFechaNacimiento().get+"fecha de nacimiento; ";
           
    }
}
