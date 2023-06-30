package com.example.vehiculo;

public class Vehiculo {

    int capacidad;
    int pasajeros;

    boolean on;
    String color;
    String modelo;
    double velocidad;
    double gasolina;
    double tanqueGasolina;

    public Vehiculo(int capacidad, int pasajeros, boolean on, String color, String modelo, double velocidad, double gasolina, double tanqueGasolina) {
        this.capacidad = capacidad;
        this.pasajeros = pasajeros;
        this.on = on;
        this.color = color;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.gasolina = gasolina;
        this.tanqueGasolina = tanqueGasolina;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getGasolina() {
        return gasolina;
    }

    public double getTanqueGasolina() {
        return tanqueGasolina;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    public double distanciaRecorrida(int horas){
        return this.velocidad*horas;
    }

    public double consumoGasolina(int tiempo){
        return distanciaRecorrida(tiempo)/(7*1);
    }

    public void encender(){
        setOn(true);
    }
    public void apagar(){
        setOn(false);
    }

    public String alertaTanqueVacio(){
        if(getGasolina()<5){
            return "Se esta agotando la gasolina";
        }else{
            return "Aún se dispone de "+getGasolina()+" listros de gasolina";
        }
    }

    public void subirVehiculo(){
        if(getPasajeros()<getCapacidad()){
            setPasajeros(getPasajeros()+1);
        }else{
            System.out.println("El vehiculo esta lleno");
        }
    }

    public void bajarVehiculo(){
        if(getPasajeros()>0){
            setPasajeros(getPasajeros()-1);
        }else{
            System.out.println("El vehiculo esta vacio");
        }
    }




}
