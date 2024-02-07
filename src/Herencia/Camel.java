package Herencia;

public class Camel implements Rideable {
    int weigth =2;
    @Override
     public String getGait() {
        return "mph , lope";
    }

    void go(int speed){
        ++speed;
        weigth++;

        int walkrate = speed * weigth;
        System.out.println(walkrate + getGait());
    }
}
