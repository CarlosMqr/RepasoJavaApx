public class ImprimeDos {
    public static void main(String[] args) {
        String[] letras = {"aa","bb","cc","dd"};
        System.out.println("Tamaño del arreglo " + letras.length);// 4


        int count=0;

        for (String l: letras) {
            while (count< letras.length){
                System.out.println("contador " + count);
                System.out.println(l);
                count++;

                break;
            }
        }


        System.out.println("Version Examen");

        String[] table = {"aa","bb","cc"};
        System.out.println(table.length);
        int ii =0;
        for (String ss : table) {
            while (ii < table.length){
                System.out.println(ii);
                ii++;
                break;
            }
        }








    }
}
