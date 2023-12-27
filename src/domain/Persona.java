package domain;

public class Persona {

    /*  Cuando se crea la clase: contexto Estático
        Cuando ya se pueden crear objetos con esa clase, contexto Dinánico
        El dinámico accede al estático, pero no al revés. Ya que se necesita que las clases esten
        creadas para crear objetos
        Los objetos y metodos con la palabra "static" se van a asociar con la clase, y no con los objetos, 
        por lo que pueden ser accedidos por cualquier objeto.
        Los que no tengan dicha palabra, con los objetos. Y la información de los metodos y objetos, no estáticos,
        no se comparte entre ellos.
        
        Para acceder a los atributos estáticos:  NombreClase.atributoEstatico; (*1)        
     */
    //Atributos
    private int idPersona; //unico por persona, aumenta al ir creando objetos
    private String nombre;
    //Atributo estático
    private static int contadorPersonas; //ligado a la clase, va a recordar todos los objetos que se crean
    // con esta clase, por ser estatico

    //Constructor, con un solo argumento, dado que los otros se asignaran de forma automatica
    public Persona(String nombre) {
        this.nombre = nombre;
        Persona.contadorPersonas++; //(*1) - SIempre que se use el constructor, aumentará, y guardará en la clase.
        //En este caso, recordar, que por ser estatica, se llama con el NombreClase. , y NO con THIS
        this.idPersona = Persona.contadorPersonas; // si no lo asociara a algo estático, cambiaría, y empezaria
        //en el int default, 0, en cada nuevo objeto Persona creado

        /*Para crear los setters and getters, y metodo toString, me puedo valer directamente del IDE
        -click derecho - insert code - getter and setter - seleccionar de cuales atributos (incluyo los estaticos)
        - tildar encapsulamiento (para que utilice el operador This) -generate
        Esto dejará los metodos estaticos al comienzo, los paso al final
        - de nuevo, click derecho, insert code, toString, y lo crea...  pero no crea la parte estatica, que bien se 
        le podria hardcodear. Esto agrega un @Overrride - una anotación, que indica algo de herencia, luego ver...
         */
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;  
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
}
