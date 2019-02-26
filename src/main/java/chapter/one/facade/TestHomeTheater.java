package chapter.one.facade;

import chapter.one.facade.*;

public class TestHomeTheater {
    public static void main(String[] args) {
        Popper popper = new PopperImpl();
        StereoSystem stereoSystem = new StereoSystemImpl();
        VideoRecorder videoRecorder = new VideoRecorderImpl();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(popper, stereoSystem, videoRecorder);

        System.out.println("Lets watch Star Wars!");
        homeTheater.watchMovie();

        System.out.println("\nIt was great, now I need to turn all off");
        homeTheater.finishWatching();
    }
}
