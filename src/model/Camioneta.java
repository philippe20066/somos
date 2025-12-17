/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.VehiculoDao;

/**
 *
 * @author CETECOM
 */
public class Camioneta extends VehiculoDao {
    private int capacidadCarga; 
    private String aireAcondicionado;
    
    public Camioneta(String patente, String marca, String modelo, int kilometraje, int capacidadCarga,String aireAcondicionado) {
        super(patente, marca, modelo, kilometraje);
        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(String aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
    
    @Override
    public String toString() {
        return "Camioneta{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", km=" + kilometraje +
                ", carga=" + capacidadCarga + "kg" +
                ", Aire Acondicionado=" + aireAcondicionado + '\'' +
                '}';
    }
}


