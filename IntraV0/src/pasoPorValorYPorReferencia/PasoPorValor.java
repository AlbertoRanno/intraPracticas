package pasoPorValorYPorReferencia;

public class PasoPorValor {

    public static void main(String[] args) {
        int cantidadUsuarios = 10;

        // El paso por valor significa que
        // se pasa una copia del valor original de la cantidad de usuarios.
        // La variable original no se modifica directamente desde otro método.
        actualizarCantidadUsuarios(cantidadUsuarios);

        // La cantidad de usuarios sigue siendo la original.
        System.out.println("Cantidad de usuarios original: " + cantidadUsuarios);       
    }

    public static void actualizarCantidadUsuarios(int cantidad) {
        // Se recibe una copia del valor original de la cantidad de usuarios.
        // Los cambios realizados aquí no afectan a la variable original.
        cantidad = cantidad * 2;
        System.out.println("Nueva cantidad de usuarios dentro del método: " + cantidad);
    }

}
