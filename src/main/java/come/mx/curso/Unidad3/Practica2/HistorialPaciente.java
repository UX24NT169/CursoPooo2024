package come.mx.curso.Unidad3.Practica2;
import java.util.Scanner;

public class HistorialPaciente {
    public static boolean validarIDPaciente (int id) {
        if (id >=10000 && id <=99999) {
            return true;
        } else {
            return false;
        }
    }
    //metodo principal
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idPaciente;
        System.out.println("Acceso al Historial del Paciente");
        //pedir ID hasta que sea valido
        do {
            System.out.println("Ingrese su ID de paciente (5 dígitos): ");
            idPaciente = scanner.nextInt();
            if (!validarIDPaciente(idPaciente)) {
                System.out.println("ID inválido" + idPaciente + ". Debe tener 5 dígitos. Intente de nuevo.");
            }
        }while (!validarIDPaciente(idPaciente));
        System.out.println("Acceso concedido al historial del paciente con ID: " + idPaciente);
    }

}

