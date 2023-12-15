package Practicas;

import java.time.LocalDate; //Del paquete "Java.time", la clase LocalDate para manejar las fechas
//import java.time.format.DateTimeFormatter; //Para formatear la fecha... 

public class Empleado {

    //Atributos
    public String nombre;
    public int sueldo;
    public LocalDate fechaIngreso; //importe una clase para manejar las fechas
    public int cantidadHsTrabajadas;

    //Constructores
    public Empleado() {
        System.out.println("Se ejecutó el constructor Vacío");
    }

    public Empleado(String nombre, int sueldo, LocalDate fechaIngreso, int cantidadHsTrabajadas) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fechaIngreso = fechaIngreso;
        this.cantidadHsTrabajadas = cantidadHsTrabajadas;
        System.out.println("Se ejecutó el constructor con Argumentos");
    }

    //Metodos
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
        System.out.println("Cantidad de horas trabajadas:  = " + cantidadHsTrabajadas);
    }

    public int registrarHorasTrabajadas(int cantidadHsTrabajadas) {
        return this.cantidadHsTrabajadas = cantidadHsTrabajadas;
    }
    
    public String reporteHoras(){
    return //continuar....
    } 

}
