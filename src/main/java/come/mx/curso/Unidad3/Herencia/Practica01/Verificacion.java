package come.mx.curso.Unidad3.Herencia.Practica01;

public class Verificacion {
    public static void main(String[] args) {
        //el new es para instancias
        ProductoDigital producto1 = new ProductoDigital( "Ebook Java", 250.20, true);

        ProductoDigital producto2 = new ProductoDigital("Audio Libro", 210.20, false);

        System.out.println("Total de producto creados" +ProductoDigital.getContadorProductos());
    }
}
