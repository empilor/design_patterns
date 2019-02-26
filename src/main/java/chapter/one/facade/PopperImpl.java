package chapter.one.facade;

public class PopperImpl implements Popper {
    public void turnOn() {
        System.out.println("Popper is ON");
    }

    public void turnOff() {
        System.out.println("Popper is OFF");
    }

    public void doPopCorn() {
        System.out.println("Popper is making PopCorn");
        System.out.println("Popper has made PopCorn");
    }
}
