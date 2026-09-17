// Abstract base class for all rescue robots
public abstract class RescueRobot {

    protected int robotId;
    protected String robotName;
    protected int batteryLevel;

    // Constructor
    public RescueRobot(int robotId, String robotName, int batteryLevel) {
        this.robotId = robotId;
        this.robotName = robotName;
        this.batteryLevel = batteryLevel;
    }

    // Concrete method
    public void startRobot() {
        System.out.println(robotName + " has started.");
    }

    // Concrete method
    public void stopRobot() {
        System.out.println(robotName + " has stopped.");
    }

    // Concrete method
    public void displayStatus() {
        System.out.println("Robot ID     : " + robotId);
        System.out.println("Robot Name   : " + robotName);
        System.out.println("Battery      : " + batteryLevel + "%");
    }

    // Abstract method
    public abstract void performMission();
}