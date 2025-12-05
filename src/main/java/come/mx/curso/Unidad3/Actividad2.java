package come.mx.curso.Unidad3;

public class Actividad2 {
    public static void main(String[] args) {
    System.out.println("Actividad 2: Reporte de inventario");
    int [] inventario = {50, 20, 15, 30, 0, 90, 5, 75, 60, 40};
    //ciclo for
    for (int i = 0; i < inventario.length; i++) {
        int cantidad = inventario[i];
        String estado = " ";
        int caso = 1;
        if (cantidad > 50) caso = 1;
        else if (cantidad >= 20) caso = 2;
        else if (cantidad >= 10) caso = 3;
        else caso = 0;

        //usamos switch para asignar los casos
        switch (caso) {
            case 1:
                estado = "Stock Alto";
                break;
            case 2:
                estado = "Stock Medio";
                break;
            case 3:
                estado = "Stock Bajo";
                break;
            case 0:
                estado = "Agotado";
                break;
        }
        System.out.println("Producto " + (i + 1) + ": " + cantidad + " unidades - " + estado);
    }
    }

}
