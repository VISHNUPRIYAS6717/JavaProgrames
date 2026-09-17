public class SmartAC implements WiFiEnabled, VoiceControlled, TemperatureMonitor {

    @Override
    public void connectWiFi() {
        System.out.println("Smart AC connected to Wi-Fi.");
    }

    @Override
    public void giveCommand(String command) {
        System.out.println("Smart AC received command: " + command);
    }

    @Override
    public void showTemperature() {
        System.out.println("Current room temperature: 24°C");
    }
}