package come.mx.curso.Unidad3.ParadigmaOO;

 public class Restaurante { // clase interna Restaurante
     String nombre = "La Chinita";
     String tipoDeComida;
     int calificacion;

     public void abrir() {
         System.out.println("El restaurante " + nombre + " está abierto. " + calificacion + " estrellas.");

     }

// clase principal Main

         public static void main(String[] args) {
             /* Crear una instancia de Restaurante 1 */
             Restaurante restaurante1 = new Restaurante();
             restaurante1.nombre = "La Chinita";
             restaurante1.tipoDeComida = "Mexicana";
             restaurante1.calificacion = 5;

             Restaurante restaurante2 = new Restaurante();
             restaurante2.nombre = "Sushito";
             restaurante2.tipoDeComida = "Japonesa";
             restaurante2.calificacion = 4;
             // Abrir los restaurantes para ver el mensaje
             restaurante1.abrir();
             restaurante2.abrir();
         }
     }

