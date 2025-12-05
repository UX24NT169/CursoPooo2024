package come.mx.curso.unidad2.Ejercicio1.Excepciones1;
import java.util.Scanner;

public class ValidadorEdad {
    public static void main(String[] args) {
        int edad = 17;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingrese su edad: ");
            edad = Integer.parseInt(scanner.nextLine());
            ValidadorEdad(edad);
            System.out.println("Edad valida.");
        } catch (IllegalArgumentException e) {
            System.out.println("La edad no es valida" + e.getMessage());
        } 
    }
    public static void ValidadorEdad(int edad) throws IllegalArgumentException {
        if (edad < 0 || edad > 120) {
            throw new IllegalArgumentException(" Edad no valia." + edad);
        }
    }
}
