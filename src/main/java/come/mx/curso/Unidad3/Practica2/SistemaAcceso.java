package come.mx.curso.Unidad3.Practica2;
import java.util.Scanner;   

public class SistemaAcceso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------SISTEMA DE ACCESO AL HOSPITAL---------");
        //permitir 3 intentos de acceso
        for (int i =1; i <=3; i ++) {
            System.out.println("Intento # " + i + " de 3 ");
            System.out.println("Usuario: ");
            String usuario = scanner.nextLine();
            System.out.println("Contraseña: ");
            String contrasena = scanner.nextLine();

            //validar credenciales
            if (usuario.equals("medico1") && contrasena.equals("doc123")) {
                System.out.println("Acceso concedido. Bienvenido " + "Doctor");
                break;
            }
            else if (usuario.equals("enfermera2") && contrasena.equals("enf456")) {
                System.out.println(">> ¡Acceso de Enfermera exitoso! Bienvenida.");
                break; // Rompe el ciclo porque ya entró.
            }
            else {
                System.out.println(">> Credenciales inválidas. Intente de nuevo.");
                if (i == 3) {
                    System.out.println(">> Ha excedido el número máximo de intentos. Acceso bloqueado.");
                } else {
                    continue;
                }
            }
        }
    }
}
