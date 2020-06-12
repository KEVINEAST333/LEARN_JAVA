public class TestThread1 {
    //单例模式 - 只允许类被实例化一次
    //饿汉模式
    static class Singleton {
        private Singleton () {
        }
        private static Singleton instance = new Singleton();
        public static  Singleton getInstance() {
            return instance;
        }
    }
}
