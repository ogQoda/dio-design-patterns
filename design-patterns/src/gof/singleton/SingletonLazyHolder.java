package gof.singleton;

/**
 * Singleton menor consumo de memória (Lazy Holder)
 *
 * @see <a href="https://stackoverflow.com/a/24018148>Referencia Singleton Lazy Holder</>
 *
 * @author ogqoda
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }

}
