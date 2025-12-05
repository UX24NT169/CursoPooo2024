package come.mx.curso.unidad2.Ejercicio1.Excepciones1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraEdad {
    public static void main(String[] args) {
        int anioActual = 2025;
        Scanner scanner = new Scanner(System.in);
        int anioNacimiento = 0;
    try {
        System.out.println("Ingrese su año de nacimiento: ");
        anioNacimiento = scanner.nextInt();

        int edad = anioActual - anioNacimiento;
        System.out.println("Su edad es: " + edad + " años .");    
    } catch (InputMismatchException e) {
        System.out.println("Error: Por favor, ingrese un número entero .");
        System.out.println("Porfavor, reinicie el programa owo.");
    } finally {
        scanner.close();
    }
}
}
