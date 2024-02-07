public class ClassExcepcion {
    public static void main(String[] args) {
        try {
            System.out.println("Try");
        }catch (Exception e){
            System.out.println("catch");
            System.exit(0);
        }finally {
            System.out.println("finally");
        }







    }
}
