package come.mx.curso.Unidad3.Practica2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CitasMedicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println ("Ingrese la hora de la cita médica (formato 24h, ej. 14 para 2pm): ");
            int horaCita = scanner.nextInt();
            scanner.nextLine();

            System.out.println(" Ingrese el dia de la semana: ");
            String dia = scanner.nextLine();
            //para validar la hora de que abre la clinica
            if (horaCita >= 9  && horaCita <=17) {
                //
                if (!dia.equalsIgnoreCase("sábado") || !dia.equalsIgnoreCase("domingo")) {
                    System.out.println("No se pueden agendar Citas los fines de semana owo.");
                } else {
                    System.out.println("Cita agendada con exito.");
                }
            }else {
                System.out.println("La clínica está cerrada. Horario de atención: 9 a 17 horas.");
            }
        }catch (InputMismatchException e) {
            System.out.println("Error: Entrada inválida. Por favor, ingrese un número entero para la hora.");
        }   
    }
}
