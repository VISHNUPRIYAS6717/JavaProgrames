public class WaterRescueRobot extends RescueRobot
        implements Swimmable {

    public WaterRescueRobot(int robotId, String robotName, int batteryLevel) {
        super(robotId, robotName, batteryLevel);
    }

    @Override
    public void performMission() {
        System.out.println("Mission: Rescuing people from flood water.");
    }

    @Override
    public void swim() {
        System.out.println(robotName + " is swimming through flood water.");
    }
}