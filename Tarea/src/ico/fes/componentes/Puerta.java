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
public class Puerta {
    private String material;
    private float altura;
    private float anchura;
    private String tipoPuerta;

    public Puerta() {
    }

    public Puerta(String material, float altura, float anchura, String tipoPuerta) {
        this.material = material;
        this.altura = altura;
        this.anchura = anchura;
        this.tipoPuerta = tipoPuerta;
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

    public String getTipoPuerta() {
        return tipoPuerta;
    }

    public void setTipoPuerta(String tipoPuerta) {
        this.tipoPuerta = tipoPuerta;
    }
    public void abrir(){
        System.out.println("Abrir puerta:"+tipoPuerta);
    }
    public void cerrar(){
        System.out.println("Cerrar puerta:"+tipoPuerta);
    }

}