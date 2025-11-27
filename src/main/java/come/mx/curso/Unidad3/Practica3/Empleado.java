package come.mx.curso.Unidad3.Practica3;
import java.util.ArrayList;
import java.util.List;

    abstract class Empleado {
        //metodo concreto trabajar
        public void trabajar() {
            System.out.println("El empleado está trabajando.");
        }
        //metodo abstracto saludar
        public void saludar() {
            System.out.println("Hola, soy un empleado.");
        }
    }
    class Cocinero extends Empleado {
        @Override
        public void saludar() {
            System.out.println("Hola, soy un cocinero.");
        }
    }
    class Mesero extends Empleado {
        @Override
        public void saludar() {
            System.out.println("Hola, soy un mesero.");
        }
    }
     class SistemaRestaurante {
        public static void main (String[] args) {
            List<Empleado> listaEmpleados = new ArrayList<>();
            listaEmpleados.add(new Cocinero());
            //instancias de las sub clases
            listaEmpleados.add(new Cocinero());
            listaEmpleados.add(new Mesero());
            listaEmpleados.add(new Mesero());
            System.out.println("...Iniciando jornada laboral...");

            for (Empleado e : listaEmpleados) {
                e.saludar();
                e.trabajar();
            }

  
        }
    }

