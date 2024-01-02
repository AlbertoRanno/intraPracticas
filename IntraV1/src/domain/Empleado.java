package domain;

public class Empleado extends Persona {

    /*extends Persona, para que herede sus atributos y metodos. 
    Pero no a los constructores, los cuales no heredan;
    Pero si se pueden acceder a través de la palabra super,(*1), y nombrando cual de ellos se quiere utilizar
    (lo cual lo va a definir el numero, y tipo de argumentos que le pase)
    Este tipo de constructores, con los atributos del padre, me van a aparecer como opcion que el ide me da
    
    Atributos:*/
    private int idEmpleado; //ya no va a tener subclases
    private double sueldo;
    private static int contadorEmpleado; // variable estatica

    //Creo constructor (1), mediante ide, para inicializar atributos de la clase padre:
//    public Empleado(String nombre, char genero, int edad, String direccion) {
//        super(nombre, genero, edad, direccion); //(*1)
//    }
    //Creo constructor (2), mediante ide, para inicializar atributos propios:
//    public Empleado(int idEmpleado, double sueldo) {
//        this.idEmpleado = idEmpleado;
//        this.sueldo = sueldo;
//    }
    //Creo constructor (4), vacio, para inicializar siempre el ID, se llama al constructor que se llame!
    public Empleado() {
        //super(); llamada implicita a super...
        this.idEmpleado = ++Empleado.contadorEmpleado; //@1
    }

    //Creo constructor (3) Mix: nombre (padre), sueldo (propio)
    public Empleado(String nombre, double sueldo) {
        //Para inicializar el atributo de la clase padre, necesito de su constructor:
        //super(nombre); //@2
        this();
        /*@2 - En lugar de super, llamo al constructor vacio. Y para inicializar los atributos
        de la clase padre, llamo directamente a los atributos, para tal fin, los declare como protected: */
        this.nombre = nombre;
        /* escribo, super, ctrl + espacio, y veo las opciones de constructores
        Al crear un objeto de esta clase Empleado, estaré recibiendo por argumento el nombre,
        y este lo derivo al constructor correspondiente. Incluso di doy ctrl + click en super
        me lleva a dicho constructor, donde esta definido
        //@1 this.idEmpleado = ++Empleado.contadorEmpleado; //REcordad que es lo recomendado para variables estaticas
        Notar, que al agregar los metodos get y set, el set, de idEmpleado, no lo voy a querer, dado que
        no quiero que alguien cambie los IDs generados automaticamente
        Y que también podría obtener los de los atributos de la clase padre, pero por ahora no
        
        Posteriormente comenté el this.idEmpleado = ++Empleado.contadorEmpleado;, porque lo pasé al constructor
         vacío, como parte de las modificaciones necesarias para que el ID se inicialice, indistintamente
         del constructor que llame. (@1) 
        La 2da modificación, es que si bien dije que lo que primero se llama dentro de un constructor, es "super"
        de manera explicita o implicita, esto cambia, si necesito usar "This", para llamar al constructor vacio
        en todos los casos @2*/
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

//    public void setIdEmpleado(int idEmpleado) {
//        this.idEmpleado = idEmpleado;
//    } No quiero que se cambien los IDS! Lo dejo en manos del constructor
    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /* Genero con el ide, el metodo toString, tildando que use el StringBuilder, el cual,
    hace más eficiente las concatenaciones de cadenas. Concatena con el metodo "append", en lugar del "+",
    Dado que el "+", por cada cosa genera un nuevo objeto del tipo string, y los objetos strings,
    una vez creados, no se pueden modificar, son inmutables.  */
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Empleado{");
//        sb.append("idEmpleado=").append(idEmpleado);
//        sb.append(", sueldo=").append(sueldo);
//        sb.append('}');
//        return sb.toString(); //esto pasa el tipo StringBuilder al tipo String
//    }
//        Modifico el default para que muestres más datos:
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Empleado{");
//        sb.append("idEmpleado=").append(this.idEmpleado);
//        sb.append(", sueldo=").append(this.sueldo);
//        sb.append(", nombre=").append(this.nombre);
////      sb.append(", nombre=").append(this.getNombre()); // Podría ser una opcion, pero lo correcto, es lo otro.
//        sb.append('}');
//        return sb.toString();
//    }
//    Pero lo más optimo, en lugar de modificar atributo por atributo, es concatenar los valores del obj Persona 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString()); //Importante: super llama a metodos de la ClasePadre
        sb.append('}');
        return sb.toString();
    }

}
