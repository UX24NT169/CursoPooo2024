package come.mx.curso.Unidad3.ParadigmaOO;

public class Forma {
    //metodo para calcular area
    public double calcularArea() {
        return 0;
    }
    //clases hijas
    //clase circulo
    static class Circulo extends Forma {
        double radio;

        public Circulo(double radio) {
            this.radio = radio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * (radio * radio);
        }
    }
    //clase rectangulo
    static class Rectangulo extends Forma {
        double base;
        double altura;

        public Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return base * altura;
        }
    }
    //clase principal para probar
    public static void main (String[] args) {
        //se crea el arreglo
        Forma [] misFormas = new Forma[2];
        // guarda los objetos
        misFormas[0] = new Circulo(5); //radio 5
        misFormas[1] = new Rectangulo(4, 6); //base 4, altura 6
        for (Forma f : misFormas) {
            System.out.println("Área: " + f.calcularArea());
        }
    }
}
