/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;
import ico.fes.habitaciones.Habitacion;
/**
 *
 * @author alexv
 */
public class Hotel {
    private String nombre;
    private String ubicaion;
    private float puntaje;
    private int precio;
    private Habitacion habitacion;

    public Hotel() {
    }

    public Hotel(String nombre, String ubicaion, float puntaje, int precio, Habitacion habitacion) {
        this.nombre = nombre;
        this.ubicaion = ubicaion;
        this.puntaje = puntaje;
        this.precio = precio;
        this.habitacion = habitacion;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicaion() {
        return ubicaion;
    }

    public void setUbicaion(String ubicaion) {
        this.ubicaion = ubicaion;
    }

    public float getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(float puntaje) {
        this.puntaje = puntaje;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void abrir(){
        System.out.println("Hotel abierto");
    }
    public void cerrar(){
        System.out.println("Hotel cerrado");
    }

    
    
}
