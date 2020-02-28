/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.computadora;

/**
 *
 * @author alexv
 */
public class Computadora {
    private String marca;
    private String procesador;
    private String sistemaOperativo;
    private int numeroDeVentiladores;
    private int memoriaRam;
    private String numeroDeSerie;
    private int puertosDeEntrada;
    private boolean portatil;

    public Computadora() {
    }

    public Computadora(String marca, String procesador, String sistemaOperativo, int numeroDeVentiladores, int memoriaRam, String numeroDeSerie, int puertosDeEntrada, boolean portatil) {
        this.marca = marca;
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
        this.numeroDeVentiladores = numeroDeVentiladores;
        this.memoriaRam = memoriaRam;
        this.numeroDeSerie = numeroDeSerie;
        this.puertosDeEntrada = puertosDeEntrada;
        this.portatil = portatil;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getNumeroDeVentiladores() {
        return numeroDeVentiladores;
    }

    public void setNumeroDeVentiladores(int numeroDeVentiladores) {
        this.numeroDeVentiladores = numeroDeVentiladores;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public int getPuertosDeEntrada() {
        return puertosDeEntrada;
    }

    public void setPuertosDeEntrada(int puertosDeEntrada) {
        this.puertosDeEntrada = puertosDeEntrada;
    }

    public boolean isPortatil() {
        return portatil;
    }

    public void setPortatil(boolean portatil) {
        this.portatil = portatil;
    }
    
    public void procesarInformacion(){
        System.out.println("Procesando Informacion");
    }
    public void actualizarSistema(){
        System.out.println("Actualizando Sistema"+sistemaOperativo);
    }
    public void mostrarResultados(){
        System.out.println("Mostrando Resultados");
    }
    public void apagarPc(){ 
        System.out.println("Apagando PC"+marca);
    }        
    public void encenderPc(){
        System.out.println("Encendiendo PC"+marca);
    }
    
}
