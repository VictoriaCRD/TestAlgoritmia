import java.util.Scanner;

public class Ejercicio3 {

   /*  Desarrolle un algoritmo para el cálculo del salario de un trabajador. El importe
liquidado (sueldo) depende de una tarifa o precio por hora establecida y de un
condicionante sobre las horas trabajadas: si la cantidad de horas trabajadas es mayor a
40 horas, la tarifa se incrementa en un 50% para las horas extras. Calcular el sueldo
recibido por el trabajador en base las horas trabajadas y la tarifa. Utilice las
instrucciones LEER HORASTRABAJADAS y LEER TARIFA al inicio del programa para
cargar los valores en las variables HORASTRABAJADAS y TARIFA.*/

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Leer horas trabajadas y tarifa por hora
    System.out.print("LEER HORASTRABAJADAS: ");
    int horasTrabajadas = scanner.nextInt();
    
    System.out.print("LEER TARIFA: "); //Introducir 6,5 no 6.5
    double tarifa = scanner.nextDouble();
    
    // Calcular el salario
    double salario;
    int horasExtras;
    
    if (horasTrabajadas > 40) {
        horasExtras = horasTrabajadas - 40;
        horasTrabajadas = 40;
        tarifa *= 1.5; // Incremento del 50% para horas extras
    } else {
        horasExtras = 0;
    }
    
    salario = horasTrabajadas * tarifa + horasExtras * tarifa;
    
    // Imprimir el salario
    System.out.println("El sueldo del trabajador es: " + salario);
    
    scanner.close();
}


}
