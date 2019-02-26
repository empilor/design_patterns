package chapter.one.singletone;

public class NonMultithreadSingletone {
    private static NonMultithreadSingletone uniqueInstance;

    private NonMultithreadSingletone() {
    }

    public static NonMultithreadSingletone getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new NonMultithreadSingletone();
        }
        return uniqueInstance;
    }
}
