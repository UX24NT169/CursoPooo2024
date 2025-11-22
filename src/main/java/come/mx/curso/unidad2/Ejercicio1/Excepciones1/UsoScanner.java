package come.mx.curso.unidad2.Ejercicio1.Excepciones1;
import java.util.Scanner;

public class UsoScanner {
    public static void main(String[] args) {
        String text = " ";
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingresa un texto: ");
            text = scanner.nextLine();
            int numero = Integer.parseInt(text);
            System.out.println("numero "+ numero);
       
        } catch (NumberFormatException e) {
            System.out.println("El Formato no es valido, solo numeros." + "Entero valido");

        }
    }
}