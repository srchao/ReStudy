package javase.thread.imp;

public class T2 implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<101;i++){
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
