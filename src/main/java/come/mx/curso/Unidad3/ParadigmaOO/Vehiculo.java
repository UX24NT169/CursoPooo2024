package come.mx.curso.Unidad3.ParadigmaOO;

public class Vehiculo {
    int velocidad = 0;
    int numLlantas;

    public void acelerar () {
        velocidad = velocidad + 1;
        System.out.println("El Vehiculo acelera. Velocidad actual: " + velocidad + " km/h");
    }


//el extends indica que Bicicleta hereda de Vehiculo
static class Bicileta extends Vehiculo {
    public Bicileta() {
        numLlantas = 2;
    }
}
static class Automovil extends Vehiculo {
    public Automovil() {
        numLlantas = 4;
    }
    @Override
    public void acelerar() {
        velocidad = velocidad + 5; //el auto acelera mas rapido
        System.out.println("El auto acelera. Velocidad actual: " + velocidad + " km/h");
    }
}
//clase principal para probar la herencia
    public static void main (String[] args) {
        System.out.println("Probando Bicicleta: ");
        Bicileta bici = new Bicileta();
        bici.acelerar(); //llama al metodo acelerar de Vehiculo

        System.out.println("Probando Automovil: ");
        Automovil auto = new Automovil();
        auto.acelerar(); //llama al metodo acelerar de Automovil
    }
  }

