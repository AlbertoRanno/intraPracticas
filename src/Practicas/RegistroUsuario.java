package Practicas;

    //1-Nombre de la clase
public class RegistroUsuario {
    //SIN el psvm (No se ejecutará)

    //2-Atributos:
    public String nombreUsuario;
    public String rolUsuario;

    /*3-Metodos:
    -codigo que voy a reutilizar
    -pueden recibir valores (argumentos),
    -pueden devolver valores (valores de retorno)
    -public - para saber que lo puedo utilizar desde fuera de esta clase
    -void - para indicar que no regresa ningun tipo de informacion
    -() - para indicar que puede recibir o no info (argumentos)
    -{} - cuerpo del metodo */
    public void mostraInfo() {
        System.out.println("Nombre del usuario = " + nombreUsuario);
        System.out.println("Rol del usuario = " + rolUsuario);
    }
    /*Por ser atributos de la clase, y no solo una simple variable,
    es que puedo acceder a ellos sin que esten definidos dentro de este metodo.

    En navigator muestra lo que tiene la clase (los metodos, atributos, y un "constructor")
    EL constructor permitira crear el objeto - click podre ver que es publico,
    se llama igual a la clase y no recibe argumentos.
       
    Una clase es un nuevo tipo, por lo que no solo puedo usarlas dentro del proyecto,
    sino que podre compartir esta clase a otros proyectos.
    Si bien podria crear un metodo main aca, para crear los objetos, es preferible crear otra clase, 
    y que sea la que tenga las pruebas donde voy a crearlos*/

}
