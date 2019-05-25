package multi.thread;

public class TestThread extends Thread {
  @Override
  public void run() {
    System.out.println("继承了Thread的多线程实现");
  }
}
