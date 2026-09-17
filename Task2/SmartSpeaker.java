public class SmartSpeaker implements WiFiEnabled, VoiceControlled, MusicPlayer {

    @Override
    public void connectWiFi() {
        System.out.println("Smart Speaker connected to Wi-Fi.");
    }

    @Override
    public void giveCommand(String command) {
        System.out.println("Voice command received: " + command);
    }

    @Override
    public void playMusic(String song) {
        System.out.println("Smart Speaker playing: " + song);
    }
}