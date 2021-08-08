package com.company;

public class OperacionBasica {
    //objeto basica, para hacer uso de los métodos de la clase ObtencionDatos
    ObtencionDatos basica = new ObtencionDatos();

    //Métodos de operaciones básicas
    public void sumar (){
        basica.obtenerDatos();
        this.basica.resultado = this.basica.numero1 + this.basica.numero2;
        System.out.println("El resultado es: " + this.basica.resultado);
    }


    public void restar (){
        basica.obtenerDatos();
        this.basica.resultado = this.basica.numero1 - this.basica.numero2;
        System.out.println("El resultado es: " + basica.resultado);

    }
    public void multiplicar (){
        basica.obtenerDatos();
        this.basica.resultado = this.basica.numero1 * this.basica.numero2;
        System.out.println("El resultado es: " + basica.resultado);

    }
    public void dividir (){
        basica.obtenerDatos();
        this.basica.resultado = this.basica.numero1 / this.basica.numero2;
        System.out.println("El resultado es: " + basica .resultado);

    }
}
