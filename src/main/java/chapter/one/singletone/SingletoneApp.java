package chapter.one.singletone;

import chapter.one.singletone.MyProcessMulti;
import chapter.one.singletone.MyProcessMultiLazy;
import chapter.one.singletone.MyProcessNonMulti;

public class SingletoneApp {
    public static void main(String[] args) throws InterruptedException {
        //Non-safety multithreading singletone
        //useless statement println - threads are usually start earlier
        System.out.println("Non-multithreading: ");
        new Thread(new MyProcessNonMulti()).start();
        new Thread(new MyProcessNonMulti()).start();
        new Thread(new MyProcessNonMulti()).start();
        new Thread(new MyProcessNonMulti()).start();
        new Thread(new MyProcessNonMulti()).start();
        new Thread(new MyProcessNonMulti()).start();

        //safety multithreading singletone
        //useless statement println - threads are usually start earlier
        System.out.println("Multithreading: ");
        new Thread(new MyProcessMulti()).start();
        new Thread(new MyProcessMulti()).start();
        new Thread(new MyProcessMulti()).start();
        new Thread(new MyProcessMulti()).start();
        new Thread(new MyProcessMulti()).start();
        new Thread(new MyProcessMulti()).start();

        //safety multithreading lazy singletone
        //useless statement println - threads are usually start earlier
        System.out.println("Multithreading lazy: ");
        new Thread(new MyProcessMultiLazy()).start();
        new Thread(new MyProcessMultiLazy()).start();
        new Thread(new MyProcessMultiLazy()).start();
        new Thread(new MyProcessMultiLazy()).start();
        new Thread(new MyProcessMultiLazy()).start();
        new Thread(new MyProcessMultiLazy()).start();
    }
}