/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author alexv
 */
public class Ventana {
    private String material;
    private float altura;
    private float anchura;
    private String tipoVentana;
    private int numeroCristales;

    public Ventana() {
    }

    public Ventana(String material, float altura, float anchura, String tipoVentana, int numeroCristales) {
        this.material = material;
        this.altura = altura;
        this.anchura = anchura;
        this.tipoVentana = tipoVentana;
        this.numeroCristales = numeroCristales;
    }
          
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAnchura() {
        return anchura;
    }

    public void setAnchura(float anchura) {
        this.anchura = anchura;
    }

    public String getTipoVentana() {
        return tipoVentana;
    }

    public void setTipoVentana(String tipoVentana) {
        this.tipoVentana = tipoVentana;
    }

    public int getNumeroCristales() {
        return numeroCristales;
    }

    public void setNumeroCristales(int numeroCristales) {
        this.numeroCristales = numeroCristales;
    }
    public void abrir(){
        System.out.println("Abrir ventana:"+tipoVentana);
    }
    public void cerrar(){
        System.out.println("Cerar ventana:"+tipoVentana);
    }
}
