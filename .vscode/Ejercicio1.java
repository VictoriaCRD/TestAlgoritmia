import java.util.Scanner;

public class Ejercicio1 {

    /*Escriba un algoritmo que lea un número entero y determine si es par o impar. Si es par,
que escriba todos los pares de manera descendiente desde sí mismo y hasta el cero. Si
es impar, que escriba todos los impares de manera descendiente desde si sí mismo
hasta el uno. Utilice la instrucción LEER NUMERO al inicio del programa para cargar un
número en la variable NUMERO.*/ 

  
public static void main(String[] args) {
    Scanner LEERNUMERO = new Scanner (System.in);
    System.out.print("Introduzca un número entero: ");
    int numero = LEERNUMERO.nextInt();
        
        // Verificar si es par o impar y realizar la acción correspondiente
        if (numero % 2 == 0) {
            System.out.println("El número introducido es par.");
            System.out.println("Los números pares descendentes desde " + numero + " hasta 0 son:");
            for (int i = numero; i >= 0; i -= 2) {
                System.out.println(i);
            }
        } else {
            System.out.println("El número introducido es impar.");
            System.out.println("Los números impares descendentes desde " + numero + " hasta 1 son:");
            for (int i = numero; i >= 1; i -= 2) {
                System.out.println(i);
            }
        }
        
        LEERNUMERO.close();   
}
}
