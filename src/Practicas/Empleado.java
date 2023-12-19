package Practicas;

import java.time.LocalDate; //Del paquete "Java.time", la clase LocalDate para manejar las fechas
//import java.time.format.DateTimeFormatter; //Para formatear la fecha... 
import java.util.ArrayList; //Quiero trabajar con una lista de arrays para el reporte general
import java.util.List;      //Luego lo maneje de forma mas abarcativa

public class Empleado {

    //Atributos
    public String nombre;
    public int sueldo;
    public LocalDate fechaIngreso; //importe una clase para manejar las fechas
    public int cantidadHsTrabajadas; //Debí haberlo llamado Hs Extras, porque asi lo usare mas adelante...
    public LocalDate ultimoDiaTrabajado;
    private String mail;

    /*Al ser privado, controlo acceso. Encapsulo la implementacion interna de una clase,
    y evito que los usuarios de la clase accedan directamente a los atributos.
    Los Getters son métodos que sirven para acceder a atributos privados
    Tienen la sintaxis "getNombreAtributo();"
    Los Setters son métodos que sirven para modificar los valores de los atributos privados
    TIenen la sintaxis "setNombreAtributo(Tipo nuevoValor);"
    
    Ventajas:
    Encapsulamiento: Permite controlar el acceso y modificación de los atributos.
    Validación: Puedes incluir lógica de validación en los setters para garantizar que los valores sean correctos.
    Flexibilidad: Si en el futuro necesitas cambiar cómo se almacenan o acceden a los atributos, solo necesitas 
    actualizar los getters y setters, manteniendo el resto del código sin cambios.
     */

    //Constructores
    public Empleado() {
        System.out.println("Se ejecutó el constructor Vacío");
        this.ultimoDiaTrabajado = LocalDate.now(); //(*)
    }

    public Empleado(String nombre, int sueldo, LocalDate fechaIngreso, int cantidadHsTrabajadas) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fechaIngreso = fechaIngreso;
        this.cantidadHsTrabajadas = cantidadHsTrabajadas;
        this.ultimoDiaTrabajado = LocalDate.now(); //(*) Lo aclaro en ambos para inicializarlo de manera automatica
        System.out.println("Se ejecutó el constructor con Argumentos");
    }

    //Metodos
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
        System.out.println("Cantidad de horas trabajadas:  = " + cantidadHsTrabajadas);
        System.out.println("ultimoDiaTrabajado: " + ultimoDiaTrabajado);
    }

    public int registrarHorasTrabajadas(int cantidadHsTrabajadas) {
        return this.cantidadHsTrabajadas = cantidadHsTrabajadas;
    }

    public String reporteEmpleado() {
        return "Nombre: " + this.nombre + "\nSueldo: " + this.sueldo + "\nFecha de ingreso: "
                + this.fechaIngreso + "\nCantidad de horas trabajadas: " + this.cantidadHsTrabajadas
                + "\nEl último día que trabajó fue el: " + this.ultimoDiaTrabajado + "\nEmail: (no debería verse)"
                + this.mail;
    }

    //Reporte, recibiendo una lista como parámetro:
    public static void reporteEmpleadoLista(List<Empleado> empleados) {
        System.out.println("Método reporte Empleado Lista");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.reporteEmpleado());
        }
    }

    public float calculoHsExtrasEnNegro(float porcentajeExtra) {
        var valorHora = this.sueldo / 160;
        return (100 + porcentajeExtra) * valorHora / 100;
    }

    public void registrarHorasAcumuladas(int cantidadHsTrabajadas, LocalDate diaTrabajado) {
        this.cantidadHsTrabajadas += cantidadHsTrabajadas;
        this.ultimoDiaTrabajado = diaTrabajado;
    }

    //Setter para mail
    public String setMail(String nuevoMail) {
        this.mail = (nuevoMail != null ? nuevoMail : "El campo no puede quedar vacío");
        return mail;
    }

    //Getter para mail
    public String getMail() {
        return mail;
    }

}
