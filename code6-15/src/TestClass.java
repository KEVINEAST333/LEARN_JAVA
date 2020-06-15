import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class TestClass {
    //线程池--已经包含的了一些线程让我们直接去使用避免频繁的创建销毁线程
/*    线程池核心操作:
            1. execute:把一个任务加到线程池中.
            2. shutdown:销毁线程池中的所有线程.
            线程池的组成部分: (需要管理两个内容:要执行的任务,执行任务的线程们)
            1.还得有一个类,来描述具体线程要做的工作是啥. (借助Runnable就可以表示)
            2.还需要有一个数据结构来组织若干个任务, BlockingQueue
            3.先有-个类,表示工作线程.
            4.还需要有一一个数据结构,来组织若干个线程.*/

        //使用一个类来描述工作线程
         static class Worker extends Thread {
             private int id = 0;
             //每个worker都需要从任务队列来获取到实例
             //从阻塞队列中拿到
             private BlockingQueue<Runnable> queue = null;
             //构造方法
             public Worker( int id, BlockingQueue<Runnable> queue) {
                 this.id = id;
                 this.queue = queue;
             }
            @Override
            public void run() {
                    try {//当线程没被打断执行run方法
                        while (!Thread.currentThread().isInterrupted()) {
                            Runnable command = queue.take();
                            System.out.println("线程 " + id + "运行");
                            command.run();
                        }
                    } catch (InterruptedException e) {
                        System.out.println("线程终止");
                    }
                }
            }
            //线程池类
         static class MyThreadPool {
             //存任务的阻塞队列
             private BlockingQueue<Runnable> queue = new LinkedBlockingDeque<>();
             //存线程的list
             private List<Worker> list = new ArrayList<>();
             private static final int Threads = 10;
             //线程池execute方法
             public void execute(Runnable command) {
                 if(list.size() < Threads) {
                     Worker worker = new Worker(list.size(),queue);
                     worker.start();
                     list.add(worker);
                 }
                 queue.add(command);
             }
                // 当 shutdown 结束之后, 意味着所有的线程一定都结束了
             public void shutdown() throws InterruptedException {
                 for (Worker worker: list) {
                     worker.interrupt();
                 }
             for (Worker worker: list) {
                 worker.join();
                 }
             }

        }
        static class Command extends Thread {
             private int id;
            @Override
            public void run() {
                System.out.println("正在执行任务" + id);
            }

            public Command(int id) {
                this.id = id;
            }
        }
    public static void main(String[] args) throws InterruptedException {
             MyThreadPool myThreadPool = new MyThreadPool();
             for (int i = 0; i < 1000;i++) {
                 myThreadPool.execute(new Command(i));
             }
             Thread.sleep(2000);
             myThreadPool.shutdown();
        System.out.println("线程池被销毁");
         }


         }

