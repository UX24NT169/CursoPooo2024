package come.mx.curso.unidad2.Ejercicio1.Excepciones1;
import  java.util.Scanner;

public class LongitudCadena {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String Palabra = " ";
        try {
            System.out.println("Escribe una palabra: ");
            Palabra = scanner.nextLine();

            if (Palabra.equals("null")) {
                Palabra = null;
            }
            System.out.println("La longitud de la palabra es: " + Palabra.length());
        } catch (NullPointerException e) {
            System.out.println("Error: La palabra es nula.");

        } finally {
            scanner.close();
        }
    }
}
