public class FireRescueRobot extends RescueRobot
        implements Flyable, Climbable {

    public FireRescueRobot(int robotId, String robotName, int batteryLevel) {
        super(robotId, robotName, batteryLevel);
    }

    @Override
    public void performMission() {
        System.out.println("Mission: Rescuing people from a burning building.");
    }

    @Override
    public void fly() {
        System.out.println(robotName + " is flying over the fire zone.");
    }

    @Override
    public void climb() {
        System.out.println(robotName + " is climbing the damaged building.");
    }
}