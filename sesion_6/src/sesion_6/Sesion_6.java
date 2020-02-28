/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_6;
import ico.fes.is.marvel.SuperHeroe;

/**
 *
 * @author usuario-43
 */
public class Sesion_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SuperHeroe spiderMan=new SuperHeroe();
        spiderMan.setNombre("Peter Parker");
        spiderMan.setEdad(15);
        spiderMan.setAlias("Spider-Man!!!");
        spiderMan.setSuperpoder("Trepar paredes,super fuerza, sentido aracnido...");
        System.out.println(spiderMan);
    }
    
}
