package come.mx.curso.Unidad3.ActividadDeRefuerzo;

//Clase Padre (HERENCIA)
class ProductoElectronico {
    // Atrivutos privados (ENCAPSULAMIENTO)
    private String nombre;
    private double precio;

    public ProductoElectronico(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // --- ENCAPSULAMIENTO: Getters para acceder a los datos ---
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Método que será sobrescrito (Polimorfismo)
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }
}

// 2. Clase Hija (HERENCIA)
// 'extends' indica que Telefono hereda de ProductoElectronico
class Telefono extends ProductoElectronico {
    private String operador;

    public Telefono(String nombre, double precio, String operador) {
        super(nombre, precio); // Llama al constructor del padre
        this.operador = operador;
    }

    //POLIMORFISMO: Sobrescribimos el método mostrarInfo
    @Override
    public void mostrarInfo() {
        System.out.println("[Teléfono] Modelo: " + getNombre() +
                " | Precio: $" + getPrecio() +
                " | Operador: " + operador);
    }
}

// 3. Otra Clase Hija (HERENCIA)
class Laptop extends ProductoElectronico {
    private int ramGB;

    public Laptop(String nombre, double precio, int ramGB) {
        super(nombre, precio);
        this.ramGB = ramGB;
    }

    //POLIMORFISMO: Comportamiento diferente para Laptop 
    @Override
    public void mostrarInfo() {
        System.out.println("[Laptop] Modelo: " + getNombre() +
                " | Precio: $" + getPrecio() +
                " | RAM: " + ramGB + "GB");
    }
}

// 4. Clase Principal (Simulación)
 class TiendaApp {
    public static void main(String[] args) {
        System.out.println("--- BIENVENIDO A LA TIENDA DE ELECTRÓNICA ---\n");

        // Creación de objetos
        ProductoElectronico productoGenerico = new ProductoElectronico("Cable USB", 5.0);
        Telefono miCelular = new Telefono("iPhone 15", 15000, "Pillofon");
        Laptop miLaptop = new Laptop("Lenovo Legion5", 20000, 16);

        // Demostración de Polimorfismo:
        // Aunque todos son productos, cada uno muestra su info de forma distinta
        productoGenerico.mostrarInfo();
        miCelular.mostrarInfo();
        miLaptop.mostrarInfo();
    }
}
