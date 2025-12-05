package come.mx.curso.unidad2.Ejercicio1.Excepciones1;

public class DivisionSegura {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 9;
        int resultado = 0;

        try {
            resultado = numero2 / numero1;
            System.out.println("El resultado de la division es: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("Error: Division entre cero no es permitida.");
        }

    }
}

