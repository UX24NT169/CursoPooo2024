package come.mx.curso.Unidad3.Practica2;

public class ReportePacientes {
    public static void main(String[] args) {
        String[] codigos = {"C", "P", "N", "X","A", "P", "A","X", "Z"};

    System.out.println("Reporte de Asignacion de Areas:");

    for (int i = 0; i <codigos.length; i++){
        String codigo = codigos[i];
        String area = " ";
        switch (codigo) {
            case "C":
                area = "Cardiología";
                break;
            case "P":
                area = "Pediatría";
                break;
            case "N":
                area = "Neurología";
                break;
            case "A":
                area = "Pediatría";
                break;
            case "X":
                area = "Cardiología";
                break;
            default:
                area = "General";
                break;
        }
        System.out.println("Paciente con codigo " + codigo + "-->" + area);
    }
    }
}
