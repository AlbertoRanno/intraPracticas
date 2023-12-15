package Practicas;

public class Cliente {

    //Atributos
    public String nombre;
    public String direccion;
    public String telefono;

    //Metodos
    public String actualizarDireccion(String direccion) {
        return this.direccion = direccion;
    }

    public void mostrarInfo() {
        System.out.println("nombre: " + nombre + "\n telefono:" + telefono + "\n direccion: " + direccion);

    }

}
