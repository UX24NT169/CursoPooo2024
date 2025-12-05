package come.mx.curso.Unidad3.ParadigmaOO;

public class Calculadora {
    //metodo: sumar dos numeros enteros
    public int sumar (int a, int b) {
        System.out.println("Sumando enteros: " + a + " + " + b);
        return a + b;
    }
    //metodo: sumar tres numeros enteros
    public int sumar (int a, int b, int c) {
        System.out.println("Sumando tres enteros: " + a + " + " + b + " + " + c);
        return a + b + c;
    }
    //metodo: sumar dos numeros decimales
    public double sumar (double a, double b) {
        System.out.println("Sumando decimales: " + a + " + " + b);
        return a + b;
    }
    //clase principal para probar la sobrecarga
    public static void main (String[] args) {
        Calculadora calc = new Calculadora();
        int resultado1 = calc.sumar(5, 10);
        System.out.println("Resultado 1: " + resultado1);

        int resultado2 = calc.sumar(3, 6, 9);
        System.out.println("Resultado 2: " + resultado2);

        double resultado3 = calc.sumar(4.5, 7.3);
        System.out.println("Resultado 3: " + resultado3);
    }
}
