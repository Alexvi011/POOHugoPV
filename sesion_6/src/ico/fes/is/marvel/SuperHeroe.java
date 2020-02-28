/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.marvel;

import ico.fes.is.Persona;

/**
 *
 * @author usuario-43
 */
public class SuperHeroe extends Persona{
    private String alias; 
    private String superpoder;

    public SuperHeroe() {
    }

    public SuperHeroe(String alias, String superpoder) {
        this.alias = alias;
        this.superpoder = superpoder;
    }

    public SuperHeroe(String alias, String superpoder, String nombre, int edad) {
        super(nombre, edad);
        this.alias = alias;
        this.superpoder = superpoder;
    }
    
    
    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        String res=super.toString();
        res=res+"Nombre clave:"+this.alias;
        res=res+"\nPoder:"+this.superpoder;
        return res;
        
    }

    
   
    
    
}
