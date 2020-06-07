public class TestThread2 {
    //线程的状态
    public static void main(String[] args) {
        for(Thread.State state : Thread.State.values()) {
            System.out.println(state);
        }
    }
  /*  NEW        Thread对象有了任务布置了但没开始执行
      RUNNABLE    就绪状态线程准备随时上CPU
      BLOCKED      \
      WAITING         ----- 阻塞状态
      TIMED_WAITING  /
      TERMINATED    内核中的线程结束(PCB没了)等待GC垃圾回收装置 */

}
