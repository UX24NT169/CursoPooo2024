package come.mx.curso.unidad2.Ejercicio1.Bifurcaciones;

public class SistemaCalificaciones {
    static void main(String[] args) {
        int notaExamen = 10;
        if (notaExamen < 0 || notaExamen > 100) {
            System.out.println("Error: La nota no es valida debe estar entre 0 y 100 ");
        } else {
            if (notaExamen >= 60) {
                System.out.println("Felicidades, has aprobado je");
                if (notaExamen >= 90) {
                    System.out.println("Excelente trabajo pai");
                }
            }else {
                System.out.println("Lo sentimos, reprobaste");
            }
           char letra;
            switch (notaExamen /10){
                case 10:
                case 9:
                    letra = 'A';
                    break;
                case 8:
                    letra = 'B';
                    break;
                case 7:
                    letra = 'C';
                    break;
                case 6:
                    letra = 'D';
                    break;
                default:
                    letra = 'F';
                    break;

            }
            System.out.println("Tu calificacion es: "+ letra);
        }
    }
}