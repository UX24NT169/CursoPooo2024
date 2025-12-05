package come.mx.curso.unidad2.Ejercicio1.Excepciones1;
import java.util.Scanner;
public class ConversionNumerico {
    public static void main(String[]s) {
        String texto = " ";
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingresa un texto: ");
            texto = scanner.nextLine();
            int numero = Integer.parseInt(texto);
            System.out.println("numero " + numero);
        } catch (NumberFormatException e) {
            System.out.println("El Formato no es valido, solo numeros." + " Entero valido");
        }
    }

}
