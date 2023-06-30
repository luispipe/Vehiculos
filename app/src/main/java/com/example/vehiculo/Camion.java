package com.example.vehiculo;

public class Camion extends Vehiculo{
    int capacidadCarga;
    int cargaActual;

    public Camion(int capacidad, int pasajeros, boolean on, String color, String modelo, double velocidad, double gasolina, double tanqueGasolina, int capacidadCarga, int cargaActual) {
        super(capacidad, pasajeros, on, color, modelo, velocidad, gasolina, tanqueGasolina);
        this.capacidadCarga = capacidadCarga;
        this.cargaActual = cargaActual;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public void cargar(int carga){
        if(this.cargaActual<this.capacidadCarga){
            if(this.cargaActual+carga<=this.capacidadCarga){
                setCargaActual(this.cargaActual+carga);
            }else{
                setCargaActual(this.capacidadCarga);
                System.out.println("No se pudo cargar "+(this.cargaActual+carga-capacidadCarga)+" Kilos");
            }
        }else{
            System.out.println("El vehiculo esta lleno");
        }
    }


}
