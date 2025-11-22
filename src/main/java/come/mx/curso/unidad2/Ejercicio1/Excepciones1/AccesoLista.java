package come.mx.curso.unidad2.Ejercicio1.Excepciones1;

import java.util.Scanner;

public class AccesoLista {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3,};
        Scanner scanner = new Scanner(System.in);
        int dato = 0;
        try {
            System.out.println("Ingrese la posicion: ");
            dato = scanner.nextInt();
            System.out.println (lista[dato]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("La posicion no existe en la lista.");
        }finally {
            scanner.close();
        }

    }
}
