public class Employeed {

    public static class Persona{
        String name = "No name";

        public Persona(String nm) {
            this.name = nm;
        }
    }

   /*public static class Emp extends Persona{
        String empId = "0000";

       /*public Emp( String Id) {
           Id;
        }*/

        // no compila, como extiende de persona por la herencia falta agregar
        // el tributo de persona en el constructor de EMP y hacer referencia con el súper
        //forma correcta

        /* public Emp(String nm, String Id) {
            super(nm);
            this.empId = Id;
        }*//*
    }*/


    public static void main(String[] args) {
       // Emp e = new Emp("4321");
       // System.out.println(e.empId);


    }
}
