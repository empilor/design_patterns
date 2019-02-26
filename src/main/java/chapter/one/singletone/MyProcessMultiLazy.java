package chapter.one.singletone;

public class MyProcessMultiLazy implements Runnable {

    public void run() {
        System.out.println("Multithread lazy instance: " + MultithreadSingletoneLazy.getInstance());
    }
}
