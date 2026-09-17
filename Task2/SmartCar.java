public class SmartCar implements WiFiEnabled, VoiceControlled,
                                 MusicPlayer, VideoStreaming {

    @Override
    public void connectWiFi() {
        System.out.println("Smart Car connected to Wi-Fi.");
    }

    @Override
    public void giveCommand(String command) {
        System.out.println("Smart Car received voice command: " + command);
    }

    @Override
    public void playMusic(String song) {
        System.out.println("Smart Car playing: " + song);
    }

    @Override
    public void streamVideo(String video) {
        System.out.println("Smart Car streaming: " + video);
    }
}