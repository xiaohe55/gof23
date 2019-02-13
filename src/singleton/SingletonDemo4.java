package singleton;

/**
 * 静态内部类实现单例模式
 * 这种方式：线程安全，调用效率高，并且实现了延时加载
 */
public class SingletonDemo4 {
    //类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的线程安全！
    private static class SingletonDemoClassInstance {
        private static final SingletonDemo4 instance = new SingletonDemo4();

    }

    private SingletonDemo4() {

    }

    public static SingletonDemo4 getInstance() {
        return SingletonDemoClassInstance.instance;
    }
}
