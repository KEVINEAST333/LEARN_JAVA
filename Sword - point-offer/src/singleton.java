public class singleton {
    //懒汉模式
    private static singleton instance = new singleton();
    public static singleton getInstance() {
        return  instance;
    }
    //饿汉模式
    private static singleton instance2 = null;
    public  static singleton getInstance2() {
        if (instance2 == null) {
            synchronized (singleton.class) {
                if (instance2 == null) {
                    instance2 = new singleton();
                }

            }
        }
        return instance2;

    }

}
