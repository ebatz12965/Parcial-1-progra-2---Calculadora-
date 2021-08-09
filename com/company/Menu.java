package com.company;

import java.util.Scanner;

public class Menu {
    //Objetos basica y avanzada para hacer el llamado de los métodos en el switch
    OperacionBasica basica = new OperacionBasica();
    OperacionAvanzada avanzada = new OperacionAvanzada();
    static int opcion;

    Scanner indice = new Scanner(System.in);
    //ObtencionDatos object = new ObtencionDatos();

/*generamos un menú con el uso de do/while y el switch para llamar a cada método los cuales están en las clases
OperacionAvanzada y OperacionBascia*/
public void menuDeOperaciones(){
    do{
        System.out.println(" ¡OPERACIONES BASICAS! ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir \n");
        System.out.println(" ¡OPERACIONES AVANZADAS! ");
        System.out.println("5. Raíz cuadrada");
        System.out.println("6. Potencias");
        System.out.println("7. Seno");
        System.out.println("8. Coseno");
        System.out.println("9. Tangente");
        System.out.println("10. Salir \n");

        System.out.println("Escribe una de las opciones\n");
        opcion = indice.nextInt();

        switch (opcion){
            case 1:
                basica.sumar();
                break;
            case 2:
                basica.restar();
                break;
            case 3:
                basica.multiplicar();
                break;
            case 4:
                basica.dividir();
                break;
            case 5:
                avanzada.raizCuadrada();
                break;
            case 6:
                avanzada.potenciar();
                break;
            case 7:
                avanzada.seno();
                break;
            case 8:
                avanzada.coseno();
                break;
            case 9:
                avanzada.tangente();
                break;
            default:
                System.out.println("Ingrese otra vez la opción");
        }

    }
        while(opcion != 10);
}
}
