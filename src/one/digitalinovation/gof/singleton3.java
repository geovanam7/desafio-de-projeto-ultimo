package one.digitalinovation.gof;

public class singleton3 {
    public static singleton3 getInstancia() {
        return null;
    }

    private static class Holder{
     private static singleton3 instancia = new singleton3();
 }

    private singleton3(){
        super();
    }

   public static singleton3 getInstance(){
     return Holder.instancia;
   }
}
