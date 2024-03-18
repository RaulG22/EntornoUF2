package practica1;

import java.util.Scanner;

/**
 * La clase 'notas' permite ingresar, verificar, calcular y mostrar notas de un
 * estudiante que iremos ingresando paso a paso, comprobando si ha aprobado o
 * suspendido.
 *
 * @author Raul
 * @since 2024-03-13
 * @version 1.0
 */
public class notas {
    // Declaracion de variables
    double unidad_Formativa1, unidad_Formativa2, unidad_Formativa3; // Notas de las tres unidades formativas
    double acumulado1, acumulado2, acumulado3, def; // Acumulados y nota definitiva

    // Objeto Scanner para entrada de datos desde el teclado
    Scanner entrada = new Scanner(System.in);

    /**
     * Metodo para ingresar las notas del estudiante. No recibe parametros
     * explicitos.
     */
    public void IngresoNotas() {
        System.out.println("Ingrese las notas del estudiante:");

        System.out.print("Ingrese nota 1: ");
        unidad_Formativa1 = entrada.nextDouble();

        System.out.print("Ingrese nota 2: ");
        unidad_Formativa2 = entrada.nextDouble();

        System.out.print("Ingrese nota 3: ");
        unidad_Formativa3 = entrada.nextDouble();
    }

    /**
     * Metodo que comprueba mediante condiciones si la nota introducida es correcta
     * o no. No recibe parametros explicitos.
     */
    public void comprobarcion() {
        // Verificacion de la nota 1
        if (unidad_Formativa1 > 10) {
            System.out.println("Nota 1 mal introducida");
        } else {
            System.out.println("Nota 1 correcta");
        }

        // Verificacion de la nota 2
        if (unidad_Formativa2 > 10) {
            System.out.println("Nota 2 mal introducida");
        } else {
            System.out.println("Nota 2 correcta");
        }

        // Verificacion de la nota 3
        if (unidad_Formativa3 > 10) {
            System.out.println("Nota 3 mal introducida");
        } else {
            System.out.println("Nota 3 correcta");
        }
    }

    /**
     * Metodo para calcular la nota definitiva del estudiante haciendo el acumulado
     * de cada uno. No recibe parametros explicitos.
     */
    public void Calculonotas() {
        acumulado1 = unidad_Formativa1 * 0.35;
        acumulado2 = unidad_Formativa2 * 0.35;
        acumulado3 = unidad_Formativa3 * 0.30;

        def = acumulado1 + acumulado2 + acumulado3;
    }

    /**
     * Metodo para mostrar las notas ingresadas, los acumulados y la nota
     * definitiva. No recibe parametros explicitos.
     */
    public void MostrarNotazas() {
        System.out.println("Notas introducidas:");
        System.out.println("Nota 1 = " + unidad_Formativa1);
        System.out.println("Nota 2 = " + unidad_Formativa2);
        System.out.println("Nota 3 = " + unidad_Formativa3);

        System.out.println("Acumulado 1 = " + acumulado1);
        System.out.println("Acumulado 2 = " + acumulado2);
        System.out.println("Acumulado 3 = " + acumulado3);

        System.out.println("Nota definitiva = " + def);
    }

    /**
     * Metodo que comprueba si el estudiante ha aprobado o suspendido. No recibe
     * parametros explicitos.
     */
    public void aprobado() {
        if (def < 5 && def >= 0) {
            System.out.println("Suspendio");
        } else {
            if (def >= 5 && def <= 10) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Error en las notas");
            }
        }
    }

    /**
     * Metodo principal que instancia la clase 'notas' y llama a los metodos para
     * ingresar, verificar, calcular, mostrar y determinar la aprobacion.
     *
     * @param args Los argumentos de la linea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        notas fc = new notas(); // Instancia de la clase 'notas'

        fc.IngresoNotas(); // Llamada al metodo para ingresar notas
        fc.comprobarcion(); // Llamada al metodo para verificar notas
        fc.Calculonotas(); // Llamada al metodo para calcular la nota definitiva
        fc.MostrarNotazas(); // Llamada al metodo para mostrar resultados
        fc.aprobado(); // Llamada al metodo para determinar aprobacion
    }
}
//comentario de prueba
//Segundo comentario de prueba
