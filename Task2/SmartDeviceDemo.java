public class SmartDeviceDemo {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("       SMART DEVICE CONTROL SYSTEM");
        System.out.println("==============================================");

        // Smart TV
        SmartTV tv = new SmartTV();

        System.out.println("\n--- Smart TV ---");
        tv.connectWiFi();
        tv.playMusic("Perfect - Ed Sheeran");
        tv.streamVideo("Educational Video");

        // Smart Speaker
        SmartSpeaker speaker = new SmartSpeaker();

        System.out.println("\n--- Smart Speaker ---");
        speaker.connectWiFi();
        speaker.giveCommand("Play my favorite song");
        speaker.playMusic("Believer");

        // Smart AC
        SmartAC ac = new SmartAC();

        System.out.println("\n--- Smart AC ---");
        ac.connectWiFi();
        ac.giveCommand("Set temperature to 22 degrees");
        ac.showTemperature();

        // Smart Camera
        SmartCamera camera = new SmartCamera();

        System.out.println("\n--- Smart Camera ---");
        camera.connectWiFi();
        camera.streamVideo("Front Door Camera");

        // Smart Car
        SmartCar car = new SmartCar();

        System.out.println("\n--- Smart Car ---");
        car.connectWiFi();
        car.giveCommand("Navigate to the university");
        car.playMusic("Shape of You");
        car.streamVideo("Travel Information");

        System.out.println("\n==============================================");
        System.out.println("All Smart Device Features Demonstrated!");
        System.out.println("==============================================");
    }
}