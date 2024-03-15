/*
 * Cierta universidad para liquidar el pago de matrícula de un estudiante le exige los siguientes datos: 
• Número de inscripción • Nombres • Patrimonio. • Estrato social. La universidad cobra un valor constante para cada estudiante 
de $50.000. Si el patrimonio es mayor que $2´000.000 y el estrato superior a 3, se le incrementa un porcentaje del 3% sobre 
el patrimonio. Hacer un algoritmo que muestre: • Número de inscripción. • Nombres. • Pago de matrícula. Análisis 
Datos de entrada • Número de inscripción. • Nombres. • Patrimonio. • Estrato social. Datos de salida • Número de inscripción. 
• Nombres. • Pago por matrícula. Proceso Inicialmente se asume que el valor a pagar es el valor constante $50.000; se hace 
la comparación del patrimonio con 2´000.000 y del estrato con tres; en caso de ser cierta la condición al valor constante 
se le incrementa el 3% sobre el patrimonio. Este valor adicional se obtiene multiplicando el patrimonio por 3 y dividiéndolo 
sobre 100 ó, lo que sería lo mismo, multiplicar 0,03 por el patrimonio. 
Definición de variables NI: Número de inscripción. NOM: Nombres. PAT: Patrimonio. EST: Estrato social. PAGMAT: Pago por matrícula.
 */
package javaejercicio10;

import java.util.Scanner;

public class JavaEjercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Ingrese el número de inscripción:");
        String NI = scanner.nextLine();

        System.out.println("Ingrese los nombre del estudiante:");
        String NOM = scanner.nextLine();

        System.out.println("Ingrese el patrimonio:");
        double PAT = scanner.nextDouble();

        System.out.println("Ingrese el estrato social:");
        int EST = scanner.nextInt();

        // Cálculo del pago de matrícula
        double PAGMAT = 50000; // Valor constante

        if (PAGMAT > 2000000 && EST > 3) {
            PAGMAT = PAGMAT + (0.03 * PAT);
        }

        // Mostrar resultados
        System.out.println("\nEL ESTUDIANTE CON NUMERO DE INSCRIPCION " + NI +
                " Y NOMBRE " + NOM + " DEBE PAGAR: $" + PAGMAT);
    }
    
}
