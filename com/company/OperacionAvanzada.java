package com.company;

public class OperacionAvanzada {
//objeto avanzada, para hacer uso de los métodos de la clase ObtencionDatos
    ObtencionDatos avanzada = new ObtencionDatos();

    //Métodos de operaciones avanzadas
    public void raizCuadrada (){
        avanzada.obtenerDato();
        avanzada.resultado = Math.sqrt(avanzada.numero1);
        System.out.println("El resultado es: " + avanzada.resultado);

    }

    public void potenciar() {
        avanzada.obtenerDatosPotencia();
        avanzada.resultado = Math.pow(avanzada.numero1, avanzada.numero2);
        System.out.println("El resultado es: " + avanzada.resultado);
    }


    public void seno() {
        avanzada.obtenerDato();
        avanzada.numero1 = Math.toRadians(avanzada.numero1);
        avanzada.resultado = Math.sin(avanzada.numero1);
        System.out.println("El resultado es: " + String.format("%.4f", avanzada.resultado));
    }

    public void coseno() {
        avanzada.obtenerDato();
        avanzada.numero1 = Math.toRadians(avanzada.numero1);
        avanzada.resultado = Math.cos(avanzada.numero1);
        System.out.println("El resultado es: " + String.format("%.4f", avanzada.resultado));
    }

    public void tangente() {
        avanzada.obtenerDato();
        avanzada.numero1 = Math.toRadians(avanzada.numero1);
        avanzada.resultado = Math.tan(avanzada.numero1);
        System.out.println("El resultado es: " + String.format("%.4f", avanzada.resultado));
    }
}
