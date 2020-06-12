public class TestThread3 {
    //单例模式
    //懒汉模式
    static class Singleton {
        private Singleton () {
        }
        //保证变量 instance 内存可见性 防止编译器 优化 CPU 直接从寄存器中读
        //使用 volatile
        private volatile static Singleton instance = null;
        //new 操作线程不是原子性的 线程不安全
        //加锁 synchronized 使 判断 和 new 操作变成原子性
        public static Singleton getInstance() {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
            return instance;
        }
    }
}
