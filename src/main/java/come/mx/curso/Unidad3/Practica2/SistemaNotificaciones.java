package come.mx.curso.Unidad3.Practica2;
import java.util.Scanner;
public class SistemaNotificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String estado = " ";
        System.out.println("Sistema de Notificaciones de Laboratorio: ");

        while (true) {
            System.out.println("Ingrese estado (En proceso / Error en muestra / Listo para revision");
            //Si sigue en proceso, volver a pedir estado
            estado = scanner.nextLine();
            if (estado.equalsIgnoreCase("En proceso")) {
                System.out.println("Notificación: Su muestra está en proceso. Le informaremos cuando esté lista.");
                continue;
            }
            //caso 2 si hay un error rompemos el ciclo
            if (estado.equalsIgnoreCase("Error en muestra")) {
                System.out.println("Notificación: Hubo un error con su muestra. Por favor, contacte al laboratorio.");
                break;
            }
            //caso 3 si ya esta lista
            if (estado.equalsIgnoreCase("Listo para revision")) {
                System.out.println("Notificación: Su muestra está lista para revisión. Puede pasar a recogerla.");
                break;
            }
            //si no es ninguno de los casos
            System.out.println("Estado no reconocido. Por favor, ingrese un estado válido.");

        }
        System.out.println("Fin del sistema de notificaciones.");
    }
}