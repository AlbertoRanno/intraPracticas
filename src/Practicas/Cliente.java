package Practicas;

public class Cliente {

    //Atributos
    public String nombre;
    public String direccion;
    public String telefono;
    private String domicilio;

    //Constructores
    public Cliente() {
        System.out.println("Se ejecutó el constructor vacío");
    }

    public Cliente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        System.out.println("Se ejecutó el constructor con ");
    }

    /*IMPORTANTE: se pueden hacer varios constructores, pero no si tienen por parámetros la
    misma cantidad y tipos. Por ejemplo, si hacia 2 constructores (nombre y dirección uno, y el otro
    telefono y domicilio) ambos constructores recibían 2 strings, por lo que el sistema no sabría como
    diferenciar cuando llaman a uno u otro, por lo que daba error. */
    public Cliente( String domicilio) {
       
        this.domicilio = domicilio;
        System.out.println("Se ejecutó el constructor con domicilio");
    }

    //Metodos
    public String actualizarDireccion(String direccion) {
        return this.direccion = direccion;
    }

    public void mostrarInfo() {
        System.out.println("nombre: " + nombre + "\n telefono:" + telefono + "\n direccion: " + direccion
        /*+ "\ndomicilio (no debería mostrarlo dado que está como privado) : " + this.domicilio*/);
        /*Mentira! Lo muestra porque, aunque el atributo domicilio está declarado como privado,
        el método 'mostrarInfo()', de la misma clase, tiene acceso directo a ese atributo y puede imprimir 
        su valor. Dentro de la propia clase, los métodos pueden acceder a los atributos privados sin restricciones.
        La única forma sería no ponerlo ese atributo en este metodo*/

    }

    public void setDomicilio(String nuevoDomicilio) {
        this.domicilio = nuevoDomicilio;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

}
