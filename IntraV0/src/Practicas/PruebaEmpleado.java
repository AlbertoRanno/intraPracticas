package Practicas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class PruebaEmpleado {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
//        System.out.println("empleado1 = " + empleado1);
//        empleado1.mostrarInfo();

        Empleado empleado2 = new Empleado("Carlos", 500000, LocalDate.of(2023, 6, 1), 64);

//        System.out.println("empleado2 = " + empleado2);
//        empleado2.mostrarInfo();
        empleado2.registrarHorasTrabajadas(40);
//        empleado2.mostrarInfo();

        Empleado empleado3 = new Empleado("Joaquín", 350000, LocalDate.of(2022, 10, 15), 55);
        empleado1.registrarHorasTrabajadas(38);
//        empleado1.mostrarInfo();
        empleado1.nombre = "Ernesto";
        empleado1.fechaIngreso = LocalDate.of(2019, 5, 25);
        empleado1.cantidadHsTrabajadas = 42;
//        empleado1.mostrarInfo();
//        empleado3.mostrarInfo();
//        System.out.println(empleado3.reporteEmpleado());

        //Lista Empleados - utilizando el metodo Main presente en esta clase Prueba
        List<Empleado> listaEmpleados = new ArrayList<>(); //Poner List a izquierda es buena practica porque simplifica vs cosas

        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);

//        System.out.println("Lista Empleados:");
//
//        for (Empleado empleado : listaEmpleados){
//            System.out.println(empleado.reporteEmpleado());
//        }
        /*Cuestion Importante:
        Revisando como se utilizan las listas, vi que las utilizan dentro de un metodo main, por eso el caso anterior.
        Pero es posible tener un método en la clase Empleado que haga el reporte de empleados. 
        Este método podría recibir una lista de empleados como parámetro y mostrar la información de cada uno.
        Creé dicho método, lo llamo utilizando lista ya creada: */
        Empleado.reporteEmpleadoLista(listaEmpleados);

        System.out.println("Efvo por Hs Extras: $" + empleado2.calculoHsExtrasEnNegro(10));

        empleado3.registrarHorasAcumuladas(2, LocalDate.of(2022, 7, 29));
        empleado3.registrarHorasAcumuladas(2, LocalDate.of(2022, 7, 30));
        empleado3.registrarHorasAcumuladas(3, LocalDate.of(2022, 8, 1));
        empleado3.registrarHorasAcumuladas(3, LocalDate.of(2022, 8, 3));
        empleado3.mostrarInfo();
        empleado3.setMail("aranno@cdt.com");
        System.out.println("Mail: " + empleado3.getMail());

    }
}
