package gof;

import gof.singleton.SingletonEager;
import gof.singleton.SingletonLazy;
import gof.singleton.SingletonLazyHolder;
import gof.strategy.*;

public class Main {
    public static void main(String[] args) {
//        Testes relacionados ao Singleton
        SingletonLazy singletonLazy = SingletonLazy.getInstancia();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstancia();
        System.out.println(singletonLazy);
        System.out.println(singletonLazy2);

        SingletonEager singletonEager = SingletonEager.getInstancia();
        SingletonEager singletonEager2 = SingletonEager.getInstancia();
        System.out.println(singletonEager);
        System.out.println(singletonEager2);

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstancia();
        SingletonLazyHolder singletonLazyHolder2 = SingletonLazyHolder.getInstancia();
        System.out.println(singletonLazyHolder);
        System.out.println(singletonLazyHolder2);

//        Testes relacionados ao Strategy
        Comportamento comportamentoNormal = new ComportamentoNormal();
        Comportamento comportamentoDefensivo = new ComportamentoDefensivo();
        Comportamento comportamentoAgressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(comportamentoNormal);
        robo.mover();
        robo.mover();

        robo.setStrategy(comportamentoDefensivo);
        robo.mover();

        robo.setStrategy(comportamentoAgressivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }
}