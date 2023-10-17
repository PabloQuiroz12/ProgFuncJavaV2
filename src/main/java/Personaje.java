public class Personaje<T> {
    public void atacar(T personaje){
        Tropa t = personaje instanceof Tropa ? ((Tropa) personaje) : null;
        t.puntosVida = t.puntosVida - 5;
        System.out.println("Atacando a: " + personaje);
    }
}
