package come.mx.curso.Unidad3.Herencia.Practica4;

public class Articulo {
    private String Codigo;
    private int cantidadStock;
    private double precioUnitario;

    public Articulo(String codigo) {
        Codigo = codigo;
    }
    public Articulo() {
        cantidadStock = 0;
        precioUnitario = 1;
    }

    public Articulo(String codigo, int cantidadStock, double precioUnitario) {
        Codigo = codigo;
        this.cantidadStock = cantidadStock;
        this.precioUnitario = precioUnitario;
    }

    public String getCodigo() {
        return Codigo;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int nuevaCantidadStock) {
        this.cantidadStock = nuevaCantidadStock;
    }

}
