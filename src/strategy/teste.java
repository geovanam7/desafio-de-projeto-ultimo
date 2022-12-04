package strategy;

import one.digitalinovation.gof.singleton2;
import one.digitalinovation.gof.singleton3;

public class teste {
    public static void main (String[]args){
    singleton3 lazy = singleton3.getInstancia();
   System.out.println (lazy);
   lazy = singleton3.getInstancia();
   System.out.println (lazy);

        singleton2 eager = singleton2.getInstancia();
        System.out.println (eager);
        eager = singleton2.getInstancia();
        System.out.println (eager);


        singleton3 lazyHolder = singleton3.getInstancia();
        System.out.println (lazyHolder);
        lazyHolder = singleton3.getInstancia();
        System.out.println (lazyHolder);

        // strategy
     comportamento defensivo = new comportamentoDefensivo();
     comportamento normal = new comportamentoNormal();
     comportamento agressivo = new comportamentoAgressivo();

     robo robo = new robo();
     robo.setComportamento(normal);
     robo.mover();
     robo.mover();
     robo.setComportamento(defensivo);
     robo.mover();
     robo.mover();
     robo.setComportamento(agressivo);
     robo.mover();
     robo.mover();
     robo.mover();
     robo.mover();




    }
}
