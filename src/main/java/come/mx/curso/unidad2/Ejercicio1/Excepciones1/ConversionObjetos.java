package come.mx.curso.unidad2.Ejercicio1.Excepciones1;

public class ConversionObjetos {
    public static void main(String[] args) {
        Object obj = "Ux";
        try {
            Integer numero = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("No es posible convertir un tipo" +
                    "de objeto en otro tipo de objeto" + e.getMessage());//ES UN OBJETO DE EXEPCION
        }
    }
}
