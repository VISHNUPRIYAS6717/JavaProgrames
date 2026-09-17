public class MountainRescueRobot extends RescueRobot
        implements Climbable, Flyable {

    public MountainRescueRobot(int robotId, String robotName, int batteryLevel) {
        super(robotId, robotName, batteryLevel);
    }

    @Override
    public void performMission() {
        System.out.println("Mission: Searching for people in the mountains.");
    }

    @Override
    public void climb() {
        System.out.println(robotName + " is climbing the mountain.");
    }

    @Override
    public void fly() {
        System.out.println(robotName + " is flying over the mountain.");
    }
}