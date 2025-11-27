package come.mx.curso.Unidad3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("--- ACTIVIDAD 1: Validacion de datos ---");

            try {
                // Leer nombre (texto). Usamos nextLine() para permitir espacios.
                System.out.print("Ingrese nombre del producto: ");
                String nombreProducto = scanner.nextLine().trim();

                // Leer cantidad (entero). Puede lanzar InputMismatchException si no es número.
                System.out.print("Ingrese cantidad en stock: ");
                int cantidad = scanner.nextInt();

                // Leer precio (decimal). Puede lanzar InputMismatchException si no es número.
                System.out.print("Ingrese precio unitario: ");
                double precio = scanner.nextDouble();

                if (cantidad <= 0) {
                    // Error específico para cantidad inválida
                    System.out.println("Error: La cantidad debe ser un número entero mayor a 0.");
                } else {
                    if (precio <= 0) {
                        // Error específico para precio inválido
                        System.out.println("Error: El precio debe ser un número positivo mayor a 0.");
                    } else {
                        // Datos válidos: confirmación
                        System.out.println("Producto registrado con éxito:");
                        System.out.println("- Nombre: " + nombreProducto);
                        System.out.println("- Cantidad en stock: " + cantidad);
                        System.out.printf("- Precio unitario: %.2f\n", precio);
                    }
                }

            } catch (InputMismatchException ime) {
                // Capturamos entrada no numérica cuando se esperaba un número
                System.out.println("Error: Se esperaba un valor numérico para cantidad o precio.");
                System.out.println("Detalles: Entrada inválida. Asegúrese de introducir números sin comas.");
            } catch (Exception e) {
                // Manejo general por si ocurre otra excepción inesperada
                System.out.println("Error inesperado: " + e.getMessage());
            } finally {
                // Cerrar el scanner
                scanner.close();
            }
        }
    }

