package NumberOfInstances;
 class ClassA1 {
    public int numberOfInstances;

    protected ClassA1(int numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
    }
}//fin de la clase A1

public class ClassB1 extends ClassA1{
        private ClassB1(int numberOfInstances) {
            super(numberOfInstances);
        }

        public static void main(String[] args) {
            ClassB1 c = new ClassB1(420);
            System.out.println(c.numberOfInstances);
        }//fin del método main

    }//fin de la clase B1


