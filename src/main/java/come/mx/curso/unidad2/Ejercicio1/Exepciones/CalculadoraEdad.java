package come.mx.curso.unidad2.Ejercicio1.Exepciones;

import java.awt.image.ImagingOpException;
import java.util.Scanner;

public class CalculadoraEdad {
    static void main(String[] args) {
        int anioactual = 2025;
        Scanner scanner = new Scanner(System.in);

        try {
            int anioNacimiento = scanner.nextInt();
            int edad = anioactual - anioNacimiento;
            System.out.println("Tu edad es:" + edad);
        } catch (ImagingOpException e) {
            System.out.println("Error: Debees ingresar" + "un numero valido para el anio de nacimiento");

        }
        scanner.close();
    }
}
