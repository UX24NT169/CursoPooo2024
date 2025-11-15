package come.mx.curso.unidad1.Herencia;

public class Main {
    static void main(String[] args) {
        Persona persona = new Persona ();
        persona.setNombre("Artemio");
        System.out.println("Nombre:" + persona.getNombre());
//class car
        Car car = new Car();
        car.setNumberOftire(4);
        car.setTypeLighths("LED");

        System.out.println(car.getNumberOftire());
        System.out.println(car.getTypeLighths());

    }
}
