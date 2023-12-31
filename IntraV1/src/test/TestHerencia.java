package test;

import domain.Cliente;
import domain.Empleado;
import domain.Persona;
import java.util.Date;

public class TestHerencia {

    public static void main(String[] args) {
        //Sin el main, no puedo crear objetos
//        Empleado empleado1 = new Empleado();
//        System.out.println("empleado1 = " + empleado1);
        /* Puedo ver, que incluso antes de escribir código en la clase Empleado, el objeto empleado1,
        ya cuenta con los atributos de la clase Persona, en sus valores por default, gracias al constructor vacio

        Al completar el codigo de Empleado, lo anterior da error dado que ya tiene constructor propio,
        y requiere parametros, por lo que se los paso*/

        Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println("empleado1 = " + empleado1);
        //empleado1 = Empleado{idEmpleado=1, sueldo=5000.0, Persona{nombre=Juan, genero= , edad=0, direccion=null}}
        //Los no inicializados, notar que "genero= ", porque el default es el caracter vacio
        //edad=0 (int ok), direccion=null (String ok)

        Cliente cliente1 = new Cliente("Horacio", 'm', 32, "Perdriel 34", new Date(), true);
        Cliente cliente2 = new Cliente("Marcos", 'm', 19, "Venezuela 44", new Date(), true);
        //Importante recordar que los caracteres van entre comillas simples!!
        System.out.println("cliente1 = " + cliente1);
        System.out.println("cliente2 = " + cliente2);
        /*
        empleado1 = Empleado{idEmpleado=1, sueldo=5000.0, Persona{nombre=Juan, genero= , edad=0, direccion=null, domain.Empleado@5305068a}}
cliente1 = Cliente{idCliente=1, fechaRegistro=Thu Dec 28 16:43:36 ART 2023, vip=true, Persona{nombre=Horacio, genero=m, edad=32, direccion=Perdriel 34, domain.Cliente@13221655}}
cliente2 = Cliente{idCliente=2, fechaRegistro=Thu Dec 28 16:43:36 ART 2023, vip=true, Persona{nombre=Marcos, genero=m, edad=19, direccion=Venezuela 44, domain.Cliente@2f2c9b19}}
       
        En resumen:
        voy a tener UN UNICO OBJETO en memoria, que se encuentra en esa direccion, el cual:
        -de manera interna va a tener la info de la clase Object (la direccion en memoria por ejemplo).
        más el metodo toString
        Hacia afuera, le sigue la informacion de la clase Persona, más su metodo toString
        hacia afuera, la info de la clase Cliente, más su metodo toString
        
        Cada metodo toSring más externo, va sobreescribiendo, a su antecesor, por eso es que usa "super"
        (acceder a los metodos del padre) 
        
        IMportante. Al ejecutar, notar que primero se va inicializando las cuestiones más internas,
        Object-espacio en memoria, la clase padre y sus atributos, luego la clase en si y sus atributos
        Por ultimo se muestran aca
        ----------------------------
        Sobrecarga de constructores:
        
        Persona persona1 = new Persona(); 
        
        con ctrl + espacio, veo los diferentes contructores que puedo utilizar
         */
    }

}
