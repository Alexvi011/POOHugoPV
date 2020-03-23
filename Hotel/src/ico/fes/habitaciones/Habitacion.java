/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.habitaciones;

/**
 *
 * @author alexv
 */
public class Habitacion {
    private String tipoHabitacion;
    private int costo;
    private int numeroNoches;

    public Habitacion() {
    }

    public Habitacion(String tipoHabitacion, int costo, int numeroNoches) {
        this.tipoHabitacion = tipoHabitacion;
        this.costo = costo;
        this.numeroNoches = numeroNoches;
    }

    public int getNumeroNoches() {
        return numeroNoches;
    }

    public void setNumeroNoches(int numeroNoches) {
        this.numeroNoches = numeroNoches;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    public void reservar(){
        
        System.out.println();
    }
    public String toString(){
        String data="Habitacion: "+tipoHabitacion+", Numero de noches: "
                +numeroNoches+", Total a pagar: "+costo;
        return data;
    }
   
    
}
