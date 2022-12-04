package one.digitalinovation.gof;

public class Singleton {

    private static Singleton instancia;
    private Singleton(){
        super ();
    }

    public static void getInstance(){
       if (instancia == null)
           instancia = new Singleton();
    }
      return instancia;

    public static class singleton {
    }
}