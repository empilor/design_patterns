package chapter.one.singletone;

public class MyProcessMulti implements Runnable {
    public void run() {
        System.out.println("Multithread instance: " + MultithreadSingletone.getInstance());
    }
}
