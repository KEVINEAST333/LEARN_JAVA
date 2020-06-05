/*class  Test extends Thread{
    //alt + insert;
    @Override
    public void run() {
        System.out.println("这是一个线程");
    }
}*/
/*class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("这是一个线程");
    }*/
//}
public class TestThread {
    public static void main(String[] args) {
        //1.继承写线程
      /*  Test test = new Test();
        test.start();*/
        //2.匿名内部类写线程
      /*Thread thread = new Thread() {
          @Override
          public void run() {
              System.out.println("这是一个线程");
          }
      };
      thread.start();
   */
        //3. 显式创建一个类, 实现 Runnable 接口, 然后把这个 Runnable 的实例关联到 Thread 实例上.
   /*    Thread t = new Thread(new MyRunnable());
        t.start();

    */
        //4.通过匿名runnable
        /*Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("这是一个线程");
            }
        };
        Thread t = new Thread(runnable);
        t.start();*/
        //5.通过lambda表达式写
       /* Thread thread = new Thread(() -> {
            System.out.println("这是一个线程");
        });
        thread.start();*/
    }
}
