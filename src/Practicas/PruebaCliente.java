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
    }
    
}
