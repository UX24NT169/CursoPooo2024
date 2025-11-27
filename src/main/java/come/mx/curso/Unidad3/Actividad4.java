package come.mx.curso.Unidad3;

import java.util.Scanner;

public class Actividad4 {

    public static boolean validarEmail(String email) {
        return email.contains("@"); // Lógica simple
    }

    public static void Actividad4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n-- Actividad 4: Notificación por correo electrónico --");

        String email;
        boolean esValido;
        //ciclo do while
        do {
            System.out.print("Ingrese su correo electrónico para notificar: ");
            email = scanner.nextLine().trim();
            esValido = validarEmail(email);
            if (!esValido) {
                System.out.println("Error: El correo electrónico debe contener el símbolo '@'. Intente de nuevo.");
            }
        } while (!esValido);// esto es es para que repita mientras NO se valido

        System.out.println("Correo electrónico válido: " + email);
    }

    public static void main(String[] args) {
        Actividad4();
    }
}








