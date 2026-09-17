public class SmartTV implements WiFiEnabled, MusicPlayer, VideoStreaming {

    @Override
    public void connectWiFi() {
        System.out.println("Smart TV connected to Wi-Fi.");
    }

    @Override
    public void playMusic(String song) {
        System.out.println("Smart TV playing music: " + song);
    }

    @Override
    public void streamVideo(String video) {
        System.out.println("Smart TV streaming: " + video);
    }
}