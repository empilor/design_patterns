package chapter.one.facade;

public class VideoRecorderImpl implements VideoRecorder {
    public void turnOn() {
        System.out.println("VCR is On");
    }

    public void turnOff() {
        System.out.println("VCR is OFF");
    }

    public void injectCD() {
        System.out.println("CD is injected into VCR");
    }
}
