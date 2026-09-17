public class SmartCamera implements WiFiEnabled, VideoStreaming {

    @Override
    public void connectWiFi() {
        System.out.println("Smart Camera connected to Wi-Fi.");
    }

    @Override
    public void streamVideo(String video) {
        System.out.println("Smart Camera streaming: " + video);
    }
}