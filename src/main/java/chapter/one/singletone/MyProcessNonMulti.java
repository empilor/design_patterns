package chapter.one.singletone;

public class MyProcessNonMulti implements Runnable {
    public void run() {
        System.out.println("Instance: " + NonMultithreadSingletone.getInstance());
    }
}
