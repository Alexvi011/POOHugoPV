/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.casa;

import ico.fes.componentes.Escalera;
import ico.fes.componentes.Puerta;
import ico.fes.componentes.Ventana;

        

/**
 *
 * @author alexv
 */
public class Casa {
    private String material;
    private float metrosCuadrados;
    private int numeroHabitaciones;
    private Ventana ventanas;
    private Puerta puertas;
    private Escalera escaleras;

    public Casa() {
    }

    public Casa(String material, float metrosCuadrados, int numeroHabitaciones, Ventana ventanas, Puerta puertas, Escalera escaleras) {
        this.material = material;
        this.metrosCuadrados = metrosCuadrados;
        this.numeroHabitaciones = numeroHabitaciones;
        this.ventanas = ventanas;
        this.puertas = puertas;
        this.escaleras = escaleras;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(float metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public Ventana getVentanas() {
        return ventanas;
    }

    public void setVentanas(Ventana ventanas) {
        this.ventanas = ventanas;
    }

    public Puerta getPuertas() {
        return puertas;
    }

    public void setPuertas(Puerta puertas) {
        this.puertas = puertas;
    }

    public Escalera getEscaleras() {
        return escaleras;
    }

    public void setEscaleras(Escalera escaleras) {
        this.escaleras = escaleras;
    }
    public void habitarCasa(){
        System.out.println("Habitando casa con: "+metrosCuadrados+" metros cuadrados y "+numeroHabitaciones);
    }
    public void deshabitarCasa(){
        System.out.println("Deshabitando casa");
    }
    public String toString(){
        String data="Casa de: "+material+" ,con: "+metrosCuadrados+" metros cuadrados, tiene: "+numeroHabitaciones+" habitacones";
        data=data+"\nVentana de: "+ventanas.getMaterial();
       data=data+"\nCon altura de: "+ventanas.getAltura()+" cm";
       data=data+"\nCon anchura de: "+ventanas.getAnchura()+" cm";
       data=data+"\nLa ventana es: "+ventanas.getTipoVentana();
       data=data+"\nCon:"+ventanas.getNumeroCristales()+" cristales";
       data=data+"\nPuerta de: "+puertas.getMaterial();
       data=data+"\nCon anchura de: "+puertas.getAnchura()+"y altura de: "+puertas.getAltura();
       data=data+"\nLa puerta es: "+puertas.getTipoPuerta();
       data=data+"\nEscalera con: "+escaleras.getNumeroEscalones()+"escalones";
       data=data+"\nHecha de: "+escaleras.getMaterial();
       data=data+"\nCon altura de: "+escaleras.getAltura();
       data=data+"\nLa escalera es:"+escaleras.getTipoEscalera();
       
       return data;
    }
}
