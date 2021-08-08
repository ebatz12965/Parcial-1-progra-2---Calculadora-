package com.company;

import java.util.Scanner;

public class ObtencionDatos {

    Scanner dato = new Scanner(System.in);
    double numero1;
    double numero2;
    double resultado;

    public ObtencionDatos() {
        numero1 = 0;
        numero2 = 0;
        resultado = 0;
    }

    public void obtenerDatos(){

        System.out.println("Ingrese dato 1:");
        this.numero1 = dato.nextDouble();
        System.out.println("Ingrese dato 2:");
        this.numero2 = dato.nextDouble();
    }

    public void obtenerDato(){

        System.out.println("Ingrese dato a calcular:");
        this.numero1 = dato.nextDouble();
    }

    public void obtenerDatosPotencia(){

        System.out.println("Ingrese dato 1:");
        this.numero1 = dato.nextDouble();
        System.out.println("Ingrese dato exponente:");
        this.numero2 = dato.nextDouble();
    }


}
