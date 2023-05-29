package org.example;

public class Cliente {
    //ATRIBUTOS ( VARIABLES QUE ALMACENAN DATOS DE LA CLASE)
    private String nombre;
    public int edad; //DATO PRIMITIVO
    public String telefono; //DATOS EN ENVOLTURA
    public String direccion;
    public Integer comprasAlMes;


    //METODOS ESPECIALES
    // 1. constructor vacio
    public Cliente() {
    }

    //2. constructor lleno

    public Cliente(String nombre, int edad, String telefono, String direccion, Integer comprasAlMes) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.comprasAlMes = comprasAlMes;
    }


    //METODOS ORDINARIOS
}
