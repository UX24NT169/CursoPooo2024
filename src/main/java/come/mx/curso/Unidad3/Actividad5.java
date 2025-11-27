package come.mx.curso.Unidad3;
import java.util.Scanner;
public class Actividad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Actividad 5: Autenticación de usuario");

        boolean accesoConcedido = false;
        //este ciclo es para 3 intentos
        for (int i = 1; i <= 3; i++) {
            System.out.print("Intento " + i + "de 3");
            System.out.print("Ingrese nombre de usuario: ");
            String usuario = scanner.nextLine().trim();
            System.out.print("Ingrese contraseña: ");
            String pass = scanner.nextLine().trim();

            //IF ANIDADOS para validar
            if (usuario.equals("admin")) {
                if (pass.equals("pass123")) {
                    System.out.println("Acceso concedido. Bienvenido. Bienvenido " + usuario);
                    accesoConcedido = true;
                    break;  //sale del ciclo si entro
                } else {
                    System.out.println("Contraseña incorrecta.");
                }
            } else {
                System.out.println("Usuario no encontrado.");
            }
        }


            if (!accesoConcedido) {
                System.out.println("Acceso denegado. Ha excedido el número de intentos.");
            }
        }
    }

