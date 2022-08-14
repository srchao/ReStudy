package javase.thread.imp;

public class T4 implements Runnable{
    private int ticket=100;
    @Override
    public void run(){
        while (true){
            synchronized (this){
                if (ticket>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":"+ticket--);
                }else{
                    break;
                }
            }
        }
    }
}
