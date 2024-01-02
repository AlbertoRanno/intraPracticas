package operaciones;

public class Operaciones {

    /*Sobrecarga de metodos:
    -incluso mismo nombre, cada uno maneja determinado tipo de datos, y devuelve en consecuencia
    -cuando llame a los metodos, el ide, de haberlo, verá que metodo es el mas apropiado,
    -por ejemplo, si paso un Long, el primer metodo queda descartado, sin embargo, el 2do tiene la capacidad
    -estos metodos, al ser estaticos, se pueden llamar directamente, sin la necesidad de crear un objeto*/
    public static int sumar(int a, int b) {
        System.out.println("sumar(int a, int b)");
        return a + b;
    }

    public static double sumar(double a, double b) {
        System.out.println("sumar(double a, double b)");
        return a + b;
    }
}
