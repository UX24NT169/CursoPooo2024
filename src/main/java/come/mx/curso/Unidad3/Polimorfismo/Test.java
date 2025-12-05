package come.mx.curso.Unidad3.Polimorfismo;
import java.util.List;
public class Test {
    public static void main(String[] args) {
        List<Empleado>empleados = List.of(new Cocinero(),new Mesero(), new LavaPlatos());
        for (Empleado e : empleados) {
            System.out.println("Salario Empleados: " + e.calcularSalario());
        }

    }
}
