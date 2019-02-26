package chapter.one.singletone;

public class MultithreadSingletoneLazy {
    private volatile static MultithreadSingletoneLazy uniqueInstance;

    private MultithreadSingletoneLazy() {}

    public static MultithreadSingletoneLazy getInstance() {
        if (uniqueInstance == null) {
            synchronized (MultithreadSingletoneLazy.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new MultithreadSingletoneLazy();
                }
            }
        }
        return uniqueInstance;
    }
}
