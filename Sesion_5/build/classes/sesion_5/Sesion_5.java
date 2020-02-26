/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_5;

import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.equipo.Computadora;


/**
 *
 * @author usurio-23
 */
public class Sesion_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escribir la composicion de la clase casa, al tres clases
        //Leer  y resumen de herencia
        Computadora compu1=new Computadora();
        compu1.setCpu(new Procesador("I9", 6.3f));
        System.out.println(compu1.toString());
    }
    
}
