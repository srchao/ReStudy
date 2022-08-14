package javase.thread;

import javase.thread.ext.T3;
import javase.thread.imp.T1;
import javase.thread.imp.T2;
import org.junit.Test;

public class ThreadTest {
    //创建两个线程，让其中一个线程输出1-100之间的偶数，另一个线程输出1-100之间的奇数。
    @Test
    public void test1(){
        Thread thread1 = new Thread(new T1());
        Thread thread2 = new Thread(new T2());
        T3 t3 = new T3();

        thread1.start();
        thread2.start();

        t3.start();
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new T1());
        Thread thread2 = new Thread(new T2());

        T3 t3 = new T3();

        thread1.setName("线程1");
        thread2.setName("线程2");
        t3.setName("线程3");

        thread1.start();
        thread2.start();
        t3.start();
    }
}
