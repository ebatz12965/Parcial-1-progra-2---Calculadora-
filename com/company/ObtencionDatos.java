package com.company;

import java.util.Scanner;

//La clase ObtencionDatos es para capturar los datos que se van a utilizar en las diferentes operaciones
public class ObtencionDatos {

    Scanner dato = new Scanner(System.in);
    double numero1;
    double numero2;
    double resultado;

    //Constructor
    public ObtencionDatos() {
        numero1 = 0;
        numero2 = 0;
        resultado = 0;
    }

    //Sirve para suma, resta, division, multiplicacion,
    public void obtenerDatos(){

        System.out.println("Ingrese dato 1:");
        this.numero1 = dato.nextDouble();
        System.out.println("Ingrese dato 2:");
        this.numero2 = dato.nextDouble();
    }

    //Sirve para raiz cuadrada, sin, cos, tan
    public void obtenerDato(){

        System.out.println("Ingrese dato a calcular:");
        this.numero1 = dato.nextDouble();
    }

    //Sirve para potencias
    public void obtenerDatosPotencia(){

        System.out.println("Ingrese dato 1:");
        this.numero1 = dato.nextDouble();
        System.out.println("Ingrese dato exponente:");
        this.numero2 = dato.nextDouble();
    }


}
