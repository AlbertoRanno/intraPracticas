package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var resultado1 = Operaciones.sumar(5,3);
        System.out.println("resultado1 = " + resultado1);
        var resultado2 = Operaciones.sumar(5.0, 3);
        System.out.println("resultado2 = " + resultado2);
        var resultado3 = Operaciones.sumar(5, 3L);
        System.out.println("resultado3 = " + resultado3);
        var resultado4 = Operaciones.sumar(resultado3, resultado1);
        System.out.println("resultado4 = " + resultado4);
        
        /*Por el peso de inferencia de tipos, si pasara 2 enteros, podria utilizar un metodo u el otro, pero 
        por eficiencia, utilizaria el de los integer. Ahora, si llamo un Long, el double tiene capacidad para
        el Long, mientras que el Integer no.
        Notar que cree una variable var para cada caso, porque el tipo de dato del resultado, podria cambiar
        */
    }
}
