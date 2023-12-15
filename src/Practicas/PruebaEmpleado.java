package Practicas;

import java.time.LocalDate;

class PruebaEmpleado {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        System.out.println("empleado1 = " + empleado1);
        empleado1.mostrarInfo();

        Empleado empleado2 = new Empleado("Carlos", 500000, LocalDate.of(2023, 6, 1), 64);
        
        System.out.println("empleado2 = " + empleado2);
        empleado2.mostrarInfo();
        
        empleado2.registrarHorasTrabajadas(40);
        empleado2.mostrarInfo();
        
        Empleado empleado3 = new Empleado("Joaquín", 350000, LocalDate.of(2022, 10, 15), 55);
        empleado1.registrarHorasTrabajadas(38);
    }
}
