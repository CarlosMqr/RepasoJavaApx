package constructor.herencia;

public class Y extends X{
    public Y() {
        System.out.println(3);
    }

    public Y(int numero){
        System.out.println("pasa por este constructor");
        System.out.println(4);
    }
}
