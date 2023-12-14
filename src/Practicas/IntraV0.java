package Practicas;

import java.util.Scanner;

public class IntraV0 {

    public static void main(String[] args) {
        /*PascalCase - NombresClases
        camelCase - nombresVariables*/
        String nombrePractica = "Repaso 1";
        System.out.println("nombrePractica = \n\t\t" + nombrePractica);
        /*soutv + tab
        Ctrl + espacio = listado variables
        Ctrl + click sobre nombre variable = me lleva a la definicion*/
        System.out.println("Ingresar usuario. Presiona Enter para terminar");
        Scanner consola = new Scanner(System.in);
        /*Ingresar y desde acá importar*/
        var user = consola.nextLine();
        /*leera toda la siguiente linea de consola, hasta que el usuario pulse Enter*/
        System.out.println("usuario = " + user);

        /*hasta aca, resumen hasta Seccion 3 (Fundamentos y Variables) - Video 14 de 788
        
         usar tipo int, dado que el tipo byte, que ocupa 8 bytes, no garantiza que utilicemos solamente 8 bytes,
        ya que posiblemente,estos 8 bytes se van a almacenar en los 32 bytes, 
        que componen una palabra de una arquitectura de 32 bytes */
        System.out.println("limites Integer = " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
        // Clases con Mayus...
        var numero = (float) 10;
        System.out.println("numero = " + numero);
        //por utilizar anotación del tipo exponencial, los float pueden ocupar lo mismo, pero guardar nros más grandes
        //byte short int long / float double / char / boolean / 

        /* ***********IMPORTANTE*********** DEBUG - Hacer click en el número de
         * línea que quiera (debe poder ser ejecutada - Ejemplo donde declaro la
         * variable) click derecho - debug file en el menu window, debugging,
         * puedo configurar lo que veo en la consola al debuguear, por ejemplo,
         * las variables. presionar F8, o step over, para avanzar un paso */
        char unicode = '\u00F3';
        System.out.println("unicode = " + unicode);
        System.out.println("Ingrese cantidad de horas trabajadas en la jordana");
        int horas = Integer.parseInt(consola.nextLine()); //String a Integer
        System.out.println("horas = " + horas);
        //int a String:
        var horasTexto = String.valueOf(horas);
        System.out.println("horasTexto = " + horasTexto);
        //caracter dado su indice:
        var primerLetra = consola.nextLine().charAt(0);
        System.out.println("primerLetra = " + primerLetra);

        //Seccion 4 (Tipos de datos) - Video 23 de 788
        //comparar Strings:
        String cadena1 = "Maria", cadena2 = "maria";
        boolean iguales = cadena1.equals(cadena2);
        System.out.println("iguales = " + iguales);
        var ternario = 3 < 2 ? "Verdadero" : "falso";
        System.out.println("ternario = " + ternario);

        //Seccion 5 (Operadores) - Video 33 de 788
        var nro = 5;
        var numeroTexto = "Numero desconocido";

        if (nro == 1) {
            numeroTexto = "Numero uno";
        } else if (nro == 2) { //"sino, si es = a 2"
            numeroTexto = "Numero dos";
        } else if (nro == 3) {
            numeroTexto = "Numero tres";
        } else if (nro == 4) {
            numeroTexto = "Numero cuatro";
        } else {
            //numeroTexto = "Numero no encontrado"; //al comentar esta linea, toma relevancia el "Numero desconocido"
        }

        System.out.println("numeroTexto = " + numeroTexto);

        //Si hiciera IF IF IF .. hago al programa evaluar todos los casos, Menos eficiente.
        System.out.println("Proporcionanos un valor entre 0 y 10");
        var calificacion = Integer.parseInt(consola.nextLine());

        switch (calificacion) {
            case 10:
                System.out.println("A");
                break;
            case 9:
            case 8:
                System.out.println("B");
                break;
            case 7:
            case 6:
                System.out.println("C");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("F");
                break;
            default:
                System.out.println("Valor desconocido");
                break;

        }

        /* La declaración switch en Java no admite la comparación de rangos con valores decimales (double). 
        Solo puede comparar valores discretos específicos.
         Para comparar intervalos de valores decimales, 
        necesito utilizar una estructura de control como if-else. */
        
        //Seccion 6 (Sentencias de Control) - Video 39 de 788
        
        var contadorWhile = 0;
        var contadorDo = 0;

        while (contadorWhile < 3) {
            System.out.println("contadorWhile = " + contadorWhile);
            contadorWhile++;
        }

        do {
            System.out.println("contadorDo = " + contadorDo);
            contadorDo++;
        } while (contadorDo < 3);

        for (int i = 1; i < 4; i++) {
            System.out.println("i = " + i);
             if (i % 2 == 0) {                
                break; //una vez que encuentra el primer numero par, sale del ciclo
            }
        }

        //Seccion 7 (Ciclos) - Video 44 de 788
    }
}
