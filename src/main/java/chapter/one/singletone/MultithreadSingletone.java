package chapter.one.singletone;

public class MultithreadSingletone {
    private volatile static MultithreadSingletone uniqueInstance;

    private MultithreadSingletone() {}

    public static synchronized MultithreadSingletone getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MultithreadSingletone();
        }
        return uniqueInstance;
    }
}
