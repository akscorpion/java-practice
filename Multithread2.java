class MyRunnable implements Runnable{
    public void run(){
        int i = 0;
        while(i < 500){
            System.out.println("Hello");
            i++;
        }
    }
}
class MyRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while(i < 500){
            System.out.println("World");
            i++;
        }
    }
}

public class Multithread2 {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(r1);

        MyRunnable2 r2 = new MyRunnable2();
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }    
}
