package come.mx.curso.Unidad3.ParadigmaOO;
import java.util.ArrayList;
//clase Estudiante
 public class Estudiante {
    String nombre;
    int ID;

    public Estudiante(String nombre, int id) {
        this.nombre = nombre;
        this.ID = id;
    }
 
    public static void main (String[] args) {
        Curso cursoJava = new Curso("Programación en Java");
        Estudiante est1 = new Estudiante("Juan Perez", 101);
        Estudiante est2 = new Estudiante("Juan Pablo", 102);
        cursoJava.agregarEstudiante(est1);
        cursoJava.agregarEstudiante(est2);
        //mostrar los estudiantes del curso
        cursoJava.mostrarEstudiantes();
    }
}
class Curso {
    String nombreCurso;
    ArrayList<Estudiante> estudiantes;

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante NuevoEstudiante) {
        estudiantes.add(NuevoEstudiante);
    }

    public void mostrarEstudiantes() {
        System.out.println("Estudiantes en el curso " + nombreCurso + ":");
        for (Estudiante e : estudiantes) {
            System.out.println("ID: " + e.ID + ", Nombre: " + e.nombre);
        }
    }
}
