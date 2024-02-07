package constructor.herencia.boxer;

public class Boxer1 {
    Integer i; // debe apuntar a un valor o hacerlo int pra que no cause un NullPointerException
    int x;
    public Boxer1(int y){
        x = i+y;// error aquí
        System.out.println(x);
    }
}
