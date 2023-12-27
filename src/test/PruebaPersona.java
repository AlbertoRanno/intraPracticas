package test;

import domain.Persona;

public class PruebaPersona {
    //Ej (*2) Atributo No estatico:
    private int contador;

    public static void main(String[] args) {
        /*Este metodo tambien es estatico, porque el compilador no va a crear un objeto de esta clase
        para llevar a cabo la prueba. Sino que utiliza el nombre de la clase (PruebaPersona), y directamente
        llama al metodo main. Es decir, similar a: NombreClase.metodo() */
        Persona persona1 = new Persona("Roberto Carlos");
//        System.out.println("persona1 = " + persona1); //toString
        //idPersona=1, porque ya se incrementó al llamar al constructor
        Persona persona2 = new Persona("Xuxa");
//        System.out.println("persona2 = " + persona2);
        Persona persona3 = new Persona("Sergio Dalma");
//        System.out.println("persona3 = " + persona3);
        /*Obs! si el atributo contadorPersonas, no fuera static, se reiniciaría en cada objeto, 
        y todos tendrían id = 1... (suponiendo que cambio en la clase Persona:
        Persona.contadorPersonas++; por this.contadorPersonas++
        siempre estaría pasando de 0 a 1 en cada objeto que se cree.
        COnclusion: siempre NombreClase.atributoEstatico y this.atributoNoEstatico
       
        En el modo Debug, hay un apartado estatico, pero Ojo, que no me interesa el apartado estatico
        de la clasePruebaPersona, sino el de la clasePersona. Para eso entrar dentro del metodo con el 
        step into
        
        Dado que estoy en un metodo estatico (main), si quiero utilizar otros metodos aqui, tambien
        deberan ser estaticos. Si el metodo imprimir, NO fuera estatico, no puedo hacer lo siguiente:       
        imprimir(persona1);
        Recordar que el contexto dinamico puede acceder al estatico, pero no al reves.
         */
        imprimir(persona1);
        imprimir(persona2);
        imprimir(persona3);
        
        /*this.imprimir(persona1); también da error, dado que no se puede usar this dentro de un contexto estatico
        lo mismo, si a esta clase, le asignara un atributo No estatico, no podria llamarlo desde el main (*2) 
        this.contador = 10;
        contador = 10;
        para esto, hay que definir otro metodo, No estatico, por ejemplo getCOntador*/
        
        
    }

    public static void imprimir(Persona persona) { //Luego le agregué el static para que pueda ser consumido
        //el orden de los modificadores (static public) No importa. 
        System.out.println("persona = " + persona);
        //Recordar, igual que JS, no es lo mismo imprimir info en consola, que retornar informacion

        
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}
