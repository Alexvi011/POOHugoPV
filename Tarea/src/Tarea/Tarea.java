/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea;
import ico.fes.componentes.Escalera;
import ico.fes.componentes.Puerta;
import ico.fes.componentes.Ventana;
import ico.fes.casa.Casa;
/**
 *
 * @author alexv
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Casa casa1=new Casa();
        casa1.setVentanas(new Ventana("aluminio",50,50,"corrediza",5));
        casa1.setMaterial("Concreto");
        casa1.setMetrosCuadrados(25);
        casa1.setNumeroHabitaciones(5);
        casa1.setPuertas(new Puerta("madera",25,25,"corrediza"));
        casa1.setEscaleras(new Escalera(20,"acero", 50, "caracol"));
                
        System.out.println(casa1.toString());

    }
    
}
