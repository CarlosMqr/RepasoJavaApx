public class ComparacionString {
    public static void main(String[] args) {

        String message1 = "Wham bam!";
        String message2 = new String("Wham bam!"); // como se está usando el new queda fuera del pool de String
                                                            // y es un nuevo objeto


        boolean r = message1 == message2;
        System.out.println(r);

        boolean r2 = message1.equals(message2);
        System.out.println(r2);


        if (message1 == message2) { // compara por referencia
            System.out.println("They match");
        }
        if (message1.equals(message2)) { // compara por valor
            System.out.println("They really match");
        }




    }
}
