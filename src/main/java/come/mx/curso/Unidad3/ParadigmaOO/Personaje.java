package come.mx.curso.Unidad3.ParadigmaOO;

public  abstract class Personaje { //debe ser abstracta

    public abstract void atacar(); //metodo abstracto

    public static void main (String[] args) {  
        //creamos los personajes
        Guerrero Meliodas = new Guerrero();
        Mago Merlin = new Mago();

        Meliodas.atacar();
        Merlin.atacar();
    
    }
}
class Guerrero extends Personaje {
    @Override
    public void atacar() {
        System.out.println("El guerrero ataca con su espada.");
    }
}
class Mago extends Personaje {
    @Override
    public void atacar() {
        System.out.println("El mago lanza un hechizo.");
    }
}
