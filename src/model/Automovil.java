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
public class Automovil extends VehiculoDao {
    private String tipoEnergia; 
    private boolean aireAcondicionado;

    public Automovil(String patente, String marca, String modelo, int kilometraje,
                     String tipoEnergia, boolean aireAcondicionado) {
        super(patente, marca, modelo, kilometraje);
        this.tipoEnergia = tipoEnergia;
        this.aireAcondicionado = aireAcondicionado;
    }

    public String getTipoEnergia() {
        return tipoEnergia;
    }

    public void setTipoEnergia(String tipoEnergia) {
        this.tipoEnergia = tipoEnergia;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", km=" + kilometraje +
                ", energia='" + tipoEnergia + '\'' +
                ", aireAcondicionado=" + aireAcondicionado +
                '}';
    }
}

}
