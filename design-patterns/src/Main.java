import singleton.gof.SingletonEager;
import singleton.gof.SingletonLazy;
import singleton.gof.SingletonLazyHolder;

public class Main {
    public static void main(String[] args) {
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
    }
}