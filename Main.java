class Multithreading extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}
public class Main{
    public static void main(String[] args) {
        Multithreading t1 = new Multithreading();
        t1.start();
        System.out.println("Main thread running");
    }
}
