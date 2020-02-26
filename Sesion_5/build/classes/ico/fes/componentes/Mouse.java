/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes; 
/**
 *
 * @author usurio-23
 */
public class Mouse {
    private String marca;
    private int numeroBotones;

    public Mouse() {
    }

    public Mouse(String marca, int numeroBotones) {
        this.marca = marca;
        this.numeroBotones = numeroBotones;
    }

    public int getNumeroBotones() {
        return numeroBotones;
    }

    public void setNumeroBotones(int numeroBotones) {
        this.numeroBotones = numeroBotones;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void seleccionar(int x, int y){
        System.out.println("Click en:"+ x +","+  y);
    }
    
}
