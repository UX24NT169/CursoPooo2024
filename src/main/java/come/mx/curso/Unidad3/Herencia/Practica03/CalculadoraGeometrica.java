package come.mx.curso.Unidad3.Herencia.Practica03;

public class CalculadoraGeometrica {
    private String nombreFigura;
    public static double PI =Math.PI;

    public CalculadoraGeometrica (){
        this.nombreFigura = "Desconocido";
    }
    public CalculadoraGeometrica (String nombreFigura){
        this.nombreFigura = nombreFigura;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }
    public double calcularArea (double radio){
        return PI * radio * radio;
    }
    public double calcularArea (double ancho, double alto) {
        return ancho * alto;
    }
    public double calcularArea (double base, int altura) {
        return (base * altura) / 2;
    }
    public static void main(String[] args) {
        CalculadoraGeometrica cal1 = new CalculadoraGeometrica("principal");

        System.out.println("Area del circulo: "+ cal1.calcularArea(5));
        System.out.println("Area del rectangulo: "+ cal1.calcularArea(5, 15.00));
        System.out.println("Area del triangulo: "+ cal1.calcularArea(4,10));
        System.out.println("-----------------------");

        CalculadoraGeometrica cal2 = new CalculadoraGeometrica("Instancia2");

        System.out.println("Area del circulo: "+ cal1.calcularArea(9));
        System.out.println("Area del rectangulo: "+ cal1.calcularArea(8, 15.00));
        System.out.println("Area del triangulo: "+ cal1.calcularArea(10,11));
        System.out.println("-----------------------");
    }

}
