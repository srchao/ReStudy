package javase.thread.imp;

public class Test1 {
    public static void main(String[] args) {
        T4 t4 = new T4();
        Thread thread1 = new Thread(t4);
        Thread thread2 = new Thread(t4);
        Thread thread3 = new Thread(t4);

        thread1.setName("线程1");
        thread2.setName("线程2");
        thread3.setName("线程3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

}
