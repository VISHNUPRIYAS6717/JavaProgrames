public class MultiTerrainRescueRobot extends RescueRobot
        implements Flyable, Swimmable, Climbable {

    public MultiTerrainRescueRobot(int robotId, String robotName,
                                   int batteryLevel) {
        super(robotId, robotName, batteryLevel);
    }

    @Override
    public void performMission() {
        System.out.println("Mission: Performing rescue operation across multiple terrains.");
    }

    @Override
    public void fly() {
        System.out.println(robotName + " is flying to the rescue location.");
    }

    @Override
    public void swim() {
        System.out.println(robotName + " is swimming across the river.");
    }

    @Override
    public void climb() {
        System.out.println(robotName + " is climbing obstacles.");
    }
}