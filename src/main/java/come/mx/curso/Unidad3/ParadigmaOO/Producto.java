package come.mx.curso.Unidad3.ParadigmaOO;

public class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    //metodo para mostrar info del producto
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + ",| Precio: $" + precio);
    }
    public static void main (String[] args) {

        //polimorfismo con productos
        Producto productos[] = new Producto[3];
        productos[0] = new Electronica("Laptop", 1500.00, 12);
        productos[1] = new Alimento("Leche", 800.00, "2024-12-31");
        productos[2] = new Electronica("Tablet", 400.00, 3);

        System.out.println("TICKET:");
        for (Producto p : productos) {
            p.mostrarInfo();
            System.out.println("-----");
        }
    }
}
class Electronica extends Producto {
    int garantiaMeses;

    public Electronica(String nombre, double precio, int garantiaMeses) {
        super(nombre, precio);
        this.garantiaMeses = garantiaMeses;
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Electronica: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Garantía: " + garantiaMeses + " meses");
    }
}
class Alimento extends Producto {
    String fechaCaducidad;

    public Alimento(String nombre, double precio, String fechaCaducidad) {
        super(nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Alimento: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
    }
}
