package constructor.herencia2;

public class EjemploMain2 {
    public static void main(String[] args) {

        ClassA A = new ClassA();
        ClassB B = new ClassB();
        ClassC C = new ClassC();

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

    }

    static class ClassA{
        public ClassA() {
            System.out.println("ClassA");
        }
    }

    static class ClassB extends ClassA{
        public ClassB() {
            System.out.println("ClassB");
        }
    }

    static class ClassC extends ClassB{
        public ClassC() {
            System.out.println("ClassC");
        }
    }







}
