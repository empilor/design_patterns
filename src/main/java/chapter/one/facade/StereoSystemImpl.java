package chapter.one.facade;

public class StereoSystemImpl implements StereoSystem {
    public void turnOn() {
        System.out.println("Stereo system is ON");
    }

    public void turnOff() {
        System.out.println("Stereo system is OFF");
    }

    public void connectToVCR() {
        System.out.println("Stereo system is connected to VCR");
    }
}
