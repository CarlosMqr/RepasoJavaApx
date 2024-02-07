public class Varags {

    //public void suma(int...g,int []q){}no compila porque los varargs debe ir al final de la lista de parametros

    //public void div(int[], ...int r){}no compila porque los varargs van después del tipo de dato

   /* public int suma(int..d,float...o){
        return d+o;
    }no compila porque no sabe que es la variable d de los parametros si se desea agregar varargs deben ser tres puntos*/

   // public void t (int...h, double...t){}//no compila porque solo se permite una vez usar varargs
    public void ad(int b,double s, String...a){}// si funciona

    /*
    debe de tener minimo 3 puntos y no importa la separacion a la derecha o izqierda
    debe de ir al final de los parametros
    si los dos parametros tiene varags ya no compila
     */
}
