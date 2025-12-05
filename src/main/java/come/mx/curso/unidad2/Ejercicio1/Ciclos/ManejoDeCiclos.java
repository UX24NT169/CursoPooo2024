package come.mx.curso.unidad2.Ejercicio1.Ciclos;

public class ManejoDeCiclos {
    public static void main(String[] args) {
        int i=0;
        while(i<=5){
            System.out.println("El valor de i en while: " + i);
            i++;
        }
        System.out.println("***********************");

        int j=10;
        while(j>=8){
            System.out.println("El valor de j en while: " + j);
            j--;
        }
        System.out.println("***********************");
        for (int k=1; k<=10; k++){
            System.out.println("La tabla del numero 7 es: " + (7*k) );

        }


    }
}
