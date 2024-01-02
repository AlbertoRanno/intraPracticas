package domain;

/* Herencia 
    Los abuelos heredan ciertas caracteristicas a los padres, y estos, a su vez, a los hijos*/
public class Persona {  //Cuando no se especifica que una clase hereda de otra, Java asume: extends Object
    //que es la ClasePadre de todas

    //Obs! en Java, a diferencia de Python, solo hay herencia SIMPLE, es decir, hereda de una sola clase

    /* Atributos:
     private String nombre;
    -private, no se hereda. Si quiero que se herede, cambio de private a protected
    -protected, tiene la ventaja, que las clases hijas, que están en otro paquete, pueden seguir accediendo.
    -default, o package, sería si no le pusiera nada. Y solo podrían acceder a estos atributos,
    las clases que estén en el mismo paquete.
    -public, no es una buena práctica, porque puede acceder cualquier clase externa. */
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    //Constructor vacio
    public Persona() {
        System.out.println("Se ejecutó el constructor vacío de Persona");
    }

    //Constructor con un argumento
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //Constructor completo
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    //OBS! Al generar con el IDE los getters and setters, cambia los protected a private, volver a modificarlos
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

//    @Override
//    public String toString() {
//        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
//    }
//    Para ver el espacio que ocupa en memoria:
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", ").append(super.toString());
        /*En este caso, como la clase padre de Persona es Object, este "super" hace referencia a la ClaseObject 
        por lo tanto, esto va a imprimir la direccion en memoria de los objetos*/
        sb.append('}');
        return sb.toString();
    }

}
