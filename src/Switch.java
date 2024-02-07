import java.util.Date;

public class Switch {
    public static void main(String[] args) {
        final long i = 12;//no acepta long primitivo
        Long ia =12l;// no acepta Long Wrapper
        short k = 10;
        char ll = 'B';
        String saludo = "Hola Mundo";
        int suma = 20;
        Integer resta = 80;
        double p = 120;//no acepta double primitivo
        Double m = 150d;//no acepta double Wrapper

        switch (suma){
           // case 'C'-> System.out.println("C");
           // case 'B'-> System.out.println("B");
           // case  i -> System.out.println("i = 12");
           // case ia-> System.out.println("Long Wrapper ia = 12");
           // case 10-> System.out.println("Acepta short en el switch");
           // case "Hola Mundo"-> System.out.println(saludo + " acepta Strings");
            case 20 -> System.out.println("Acepta enteros primitivos");
            case 80-> System.out.println("Acepta enteros Wrapper");
            case 120-> System.out.println("Acepta double primitivo");
            case 150-> System.out.println("Double Wrapper");
        }



    }
}
