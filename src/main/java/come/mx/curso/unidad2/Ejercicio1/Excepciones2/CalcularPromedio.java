package come.mx.curso.unidad2.Ejercicio1.Excepciones2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CalcularPromedio {
    public static void main(String[] args) {
        double nota1 = 0;
        double nota2 = 0;
        Scanner scanner = new Scanner(System.in);
        try { //esto me sirve para la interfaz de ingreso de datos
            System.out.print("Ingrese la primera nota: ");
            nota1 = scanner.nextDouble();

            System.out.print("Ingrese la segunda nota: ");
            nota2 = scanner.nextDouble();

            double promedio = (nota1 + nota2) / 2;
            System.out.println("El promedio es: " + promedio);
            //este catch me sirve para capturar el error
        } catch (InputMismatchException e) {
            System.out.println("Error:  Por favor, ingrese números válidos para las notas.");
            }finally {
            //esto sirve para cerrar los promedios
            System.out.println("Cerrando el programa.");
            scanner.close();
        }
    }
}
