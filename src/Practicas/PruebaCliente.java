package Practicas;

public class PruebaCliente {
    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        System.out.println("cliente1 = " + cliente1);
        cliente1.actualizarDireccion("Marcos Seguí 2345");
        cliente1.mostrarInfo();
        System.out.println("cliente1 = " + cliente1);
        cliente1.actualizarDireccion("California 4444");
        cliente1.mostrarInfo();
        cliente1.telefono = "4924-6136";
        cliente1.mostrarInfo();
        // Esto daría un error porque domicilio es privado en Cliente:
        // System.out.println("Domicilio: " + cliente1.domicilio);
        /* No es accesible directamente desde fuera de la clase Cliente. 
        La única forma de acceder a domicilio desde fuera de la clase es a través 
        de sus métodos públicos, como getDomicilio() que proporciona acceso controlado al valor.*/
        cliente1.setDomicilio("Pablo Correa 1212 1º B");
        System.out.println("Domicilio Privado: " + cliente1.getDomicilio());
        //Creo distintos objetos, a los cuales les inicializo distintos atributos:
        Cliente cliente2 = new Cliente("Calle Falsa 123");
        Cliente cliente3 = new Cliente("Roberto", "Almodobar 234", "4369-6699");
        System.out.println("cliente2 = " + cliente2);
        System.out.println("cliente3 = " + cliente3);
        
    }
    
}
