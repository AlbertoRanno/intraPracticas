package Practicas;

public class PruebaRegistroUsuario {
    public static void main(String[] args) {
        //sin el main, no se puede ejecutar la prueba

        //creo el objeto -como definiría una variable
        RegistroUsuario usuario1; //el "tipo" sería el nombre de la clase
        usuario1 = new RegistroUsuario(); //llamo al constructor
        /*esto permite reservar memoria, ya que las variables se almacenan en una parte de la memoria,
        y los objetos, en otra. Una vez que se crea este objeto en memoria, entonces lo que sucede es 
        que regresa la referencia donde se ha creado este objeto en memoria; y esa referencia es la que,
        se le asigna a "usuario1". A diferencia de un espacio reservado en memoria para una variable, 
        esta no muere tras el método; y además conserva los atributos y metodos.
        Una vez que cuente con esta linea "usuario1 = new RegistroUsuario();" puedo acceder a los atributos
        y metodos creados en memoria. Para ello: usuario1.   - y vere los mismos. Puedo modificarlos mediante:*/
        
        usuario1.nombreUsuario = "Alberto Ranno";
        usuario1.rolUsuario = "Administador";
        
        usuario1.mostraInfo();
        
        RegistroUsuario usuario2 = new RegistroUsuario();
        usuario2.nombreUsuario = "Ana Hattaway";
        
        usuario2.mostraInfo(); //Rol = null (String) porque no lo definí... 
        
        // Seccion 8 (Clases) - Video 48 de 788
        
    }
}
