package org.example.clases;

public class Empleado {

    //ATRIBUTOS
    private Integer salario;
   private String nombre;

    //METODOS ESPECIALES
    //1. CONSTRUCTOR VACIOS

    public Empleado() {
    }


    //2. CONSTRUCTOR LLENO

    public Empleado(Integer salario, String nombre) {
        this.salario = salario;
        this.nombre = nombre;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        if(salario<0){
            System.out.println("no es valido");
        }else {
            this.salario = salario;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //METODOS ORDINARIOS
    //LOS METODOS ORDINARIOS SERAN FUNCIONES QUE EL DLLOR PROGRAMA PARA EJECUTAR LA LOGICA DE NEGOCIO

    //CALCULAR EL SALARIO MENSUAL DE UN EMPLEADO
    public Double clauclarSalario(Integer salarioBase, Integer dadeccines){

        final Double  descuentoSalud= 0.04;
        final Double descuentoPensio=0.04;

        Double descuentosSeguridadSocial= (salarioBase*descuentoSalud*descuentoPensio);
        Double salario=salarioBase-dadeccines-descuentosSeguridadSocial;

        return salario;
    }
}

