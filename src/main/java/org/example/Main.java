package org.example;

import org.example.clases.Empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //CREAR UN OBJETO ESPECIAL DE JAVA PARA RECIBIR DATOS POR TECLADO
        Scanner entradaPorTeclado= new Scanner(System.in);



       //CREAR UN OBJETO DE LA CLASE CLIENTE

        Cliente cliente=new Cliente();

       //pidiendo el nombre al usuario
        System.out.print("Digita tu edad: ");
        cliente.setEdad(entradaPorTeclado.nextInt());
        System.out.println( "su edad es : " + cliente.getEdad());


    }

}