package chapter.one.facade;

public class HomeTheaterFacade {
    Popper popper;
    StereoSystem stereoSystem;
    VideoRecorder videoRecorder;

    public HomeTheaterFacade(Popper popper, StereoSystem stereoSystem, VideoRecorder videoRecorder) {
        this.popper = popper;
        this.stereoSystem = stereoSystem;
        this.videoRecorder = videoRecorder;
    }

    public void watchMovie() {
        popper.turnOn();
        popper.doPopCorn();
        videoRecorder.turnOn();
        videoRecorder.injectCD();
        stereoSystem.turnOn();
        stereoSystem.connectToVCR();
    }

    public void finishWatching() {
        popper.turnOff();
        videoRecorder.turnOff();
        stereoSystem.turnOff();
    }
}
