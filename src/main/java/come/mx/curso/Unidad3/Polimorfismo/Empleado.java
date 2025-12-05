package come.mx.curso.Unidad3.Polimorfismo;

public abstract class Empleado {
    public void trabajar() {
        System.out.println("El empleado está trabajando.");
    }   
    public abstract double calcularSalario();

}
