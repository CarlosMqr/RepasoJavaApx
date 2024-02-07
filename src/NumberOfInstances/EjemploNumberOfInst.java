package NumberOfInstances;

public class EjemploNumberOfInst {

      static public class ClassC{
        public int num;
         protected ClassC(int num) {
            this.num = num;
        }
    }

      static public class ClassD extends ClassC{
        private ClassD(int num) {
            super(num);
        }
    }

    public static void main(String[] args) {
        ClassD classD= new ClassD(420);/* asi no compila porque las clases A y B están dentro de la clase
                                              EjemploNumberOfInst donde se declara el main y las clases A y B
                                              deben ser static
                                              */
        System.out.println(classD.num);
    }


}
