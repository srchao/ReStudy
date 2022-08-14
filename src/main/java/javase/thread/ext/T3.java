package javase.thread.ext;

public class T3 extends Thread{
    @Override
    public void run() {
        for (int i=1;i<101;i++){
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }

}
