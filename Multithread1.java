import java.lang.Thread;

class MyThread extends Thread{
    public void run(){
        int i = 0;
        while(i < 500){
            System.out.println("Aakash");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i < 500){
            System.out.println("Deepansh");
            i++;
        }
    }
}

public class Multithread1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
