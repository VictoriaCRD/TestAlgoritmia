import java.util.Scanner;

public class Ejercicio2 {

    /*Escriba un algoritmo que visualice una clasificación de 50 personas según edad y sexo.
Deberá mostrar los siguientes resultados:
a. Cantidad de personas mayores de edad (18 años o más).
b. Cantidad de personas menores de edad.
c. Cantidad de personas masculinas mayores de edad.
d. Cantidad de personas femeninas menores de edad.
e. Porcentaje que representan las personas mayores de edad respecto al total de
personas.
f. Porcentaje que representan las mujeres respecto al total de personas.
Utilice la instrucción LEER PERSONAS al inicio del programa para cargar los datos de las
50 personas en un variable, PERSONAS, que actúa como un vector de 50 posiciones.
Cada elemento de PERSONAS es de un tipo estructurado que dispone dos campos:
SEXO y EDAD.*/ 


public static void main(String[] args) {
    Scanner LEERPERSONAS = new Scanner(System.in);
    
    // Definir el vector de personas
    Persona[] PERSONAS = new Persona[50];
    
    // Leer datos de las 50 personas
    for (int i = 0; i < PERSONAS.length; i++) {
        System.out.println("Ingrese los datos de la persona " + (i + 1) + ":");
        System.out.print("Sexo (M/F): ");
        char sexo = LEERPERSONAS.next().charAt(0);
        System.out.print("Edad: ");
        int edad = LEERPERSONAS.nextInt();
        PERSONAS[i] = new Persona(sexo, edad);
    }
    
    // Inicializar contadores
    int mayoresEdad = 0;
    int menoresEdad = 0;
    int hombresMayores = 0;
    int mujeresMenores = 0;
    int totalPersonas = PERSONAS.length;
    
    // Calcular estadísticas
    for (Persona persona : PERSONAS) {
        if (persona.getEdad() >= 18) {
            mayoresEdad++;
            if (persona.getSexo() == 'M') {
                hombresMayores++;
            }
        } else {
            menoresEdad++;
            if (persona.getSexo() == 'F') {
                mujeresMenores++;
            }
        }
    }
    
    // Calcular porcentajes
    double porcentajeMayoresEdad = (mayoresEdad * 100.0) / totalPersonas;
    double porcentajeMujeres = ((hombresMayores + mujeresMenores) * 100.0) / totalPersonas;
    
    // Mostrar resultados
    System.out.println("\nResultados:");
    System.out.println("a. Cantidad de personas mayores de edad: " + mayoresEdad);
    System.out.println("b. Cantidad de personas menores de edad: " + menoresEdad);
    System.out.println("c. Cantidad de personas masculinas mayores de edad: " + hombresMayores);
    System.out.println("d. Cantidad de personas femeninas menores de edad: " + mujeresMenores);
    System.out.printf("e. Porcentaje de personas mayores de edad respecto al total de personas: %.2f%%\n", porcentajeMayoresEdad);
    System.out.printf("f. Porcentaje de mujeres respecto al total de personas: %.2f%%\n", porcentajeMujeres);
    
    LEERPERSONAS.close();
}


}
