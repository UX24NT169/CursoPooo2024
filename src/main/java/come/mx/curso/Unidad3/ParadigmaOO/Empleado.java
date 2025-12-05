package come.mx.curso.Unidad3.ParadigmaOO;
 // clase interna Empleado PRIVADOS
public class Empleado {

    private int id;
    private double salario; //double para el saliario en decimales

    public Empleado(int id, double salario) {
        this.id = id;
        this.salario = salario;
    }
    
    public void aumentarSalario(double porcentaje) {
        double aumento = salario * (porcentaje / 100);
        salario = salario + aumento;

    }
    public double getSalario() { //getter para ver de forma segura el salario desde fuera
        return salario;
    }
    public static void main (String [] args) { //creamos una clase para probrar el todos los public
        Empleado emp = new Empleado(1, 3000.0);
        System.out.println("Salario inicial: " + emp.getSalario());
        emp.aumentarSalario(10); //aumenta el salario en un 10%
        System.out.println("Salario después del aumento: " + emp.getSalario());
    }
}
