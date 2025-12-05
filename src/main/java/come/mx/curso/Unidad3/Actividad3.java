package come.mx.curso.Unidad3;
import java.util.Scanner;

public class Actividad3 {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Actividad 3: Trazabilidad");

        String estado = "";

        while (!estado.equalsIgnoreCase("Entregado")) {
            System.out.print("Ingrese el estado del envío (En preparación, En camino, Entregado): ");
            estado = scanner.nextLine().trim();

            if (estado.equalsIgnoreCase("En camino")) {
                System.out.println("--- El pedido sigue en transito ---");
                continue; //continua al siguiente ciclo
            }
            if (estado.equalsIgnoreCase("Error")) {
                System.out.println("--- Alerta se detuvo el proceso por error en el envio---");
                break; //termina el ciclo

            }
            System.out.println("Estado registrado: " + estado);
        }
        if (estado.equalsIgnoreCase("Entregado")) {
            System.out.println("El pedido ha sido entregado con éxito.");
        }
    }
}