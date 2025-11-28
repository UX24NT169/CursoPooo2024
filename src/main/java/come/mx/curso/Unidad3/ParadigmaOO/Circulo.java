package come.mx.curso.Unidad3.ParadigmaOO;

public class Circulo {
    //atributo privado
    private double radio;
    //constructor recibie el radio
    public Circulo(double radio) {
        this.radio = radio;
    }
    public double calcularArea() {
        return Math.PI * (radio * radio);
    }
    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }
    //clase principal para probar
    public static void main (String[] args) {
        Circulo c = new Circulo(5); //radio 5

        double area = c.calcularArea();
        double circunferencia = c.calcularCircunferencia();
        System.out.println("Resultados (radio = 5):");
        System.out.println("Área del círculo: " + area);
        System.out.println("Circunferencia del círculo: " + circunferencia);

    }
}
