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
public class Escalera {
    private int numeroEscalones;
    private String material;
    private float altura;
    private String tipoEscalera;

    public Escalera() {
    }

    public Escalera(int numeroEscalones, String material, float altura, String tipoEscalera) {
        this.numeroEscalones = numeroEscalones;
        this.material = material;
        this.altura = altura;
        this.tipoEscalera = tipoEscalera;
    }

    public String getTipoEscalera() {
        return tipoEscalera;
    }

    public void setTipoEscalera(String tipoEscalera) {
        this.tipoEscalera = tipoEscalera;
    }

    public int getNumeroEscalones() {
        return numeroEscalones;
    }

    public void setNumeroEscalones(int numeroEscalones) {
        this.numeroEscalones = numeroEscalones;
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
    
    
}
