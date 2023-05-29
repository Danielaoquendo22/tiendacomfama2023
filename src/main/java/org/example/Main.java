package org.example;

import org.example.clases.Empleado;

public class Main {
    public static void main(String[] args) {
        // creando una variable ordinaria
        int edad=5;
        System.out.println(edad);
        //creando un objeto utilizando un constructor vacio
        Cliente objeto=new Cliente();
        // yo uso un objeto para acceder a los atributos y metodos de la clase por separado
        objeto.edad=28;
        System.out.println(objeto.edad);
        objeto.nombre= "Daniela";
        System.out.println(objeto.nombre);

        //Creando un objeto utilizando un constructor lleno
        Cliente objetoDos=new Cliente("Sara", 30, "4508080", "cl50", 10);
        System.out.println(objetoDos.edad);
        System.out.println(objetoDos.nombre);


        //CREANDO UN OBJETO DE A CLASE EMPLEADO
        Empleado objetoTres= new Empleado();
        System.out.println(objetoTres.nombre);

    }

}