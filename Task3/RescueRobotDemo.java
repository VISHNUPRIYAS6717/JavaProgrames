public class RescueRobotDemo {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("         EMERGENCY RESCUE ROBOT SYSTEM");
        System.out.println("==============================================");

        // Abstract class references
        RescueRobot[] robots = new RescueRobot[4];

        robots[0] = new FireRescueRobot(
                101, "FireBot", 90);

        robots[1] = new WaterRescueRobot(
                102, "AquaBot", 85);

        robots[2] = new MountainRescueRobot(
                103, "MountainBot", 80);

        robots[3] = new MultiTerrainRescueRobot(
                104, "RescueX", 95);

        for (RescueRobot robot : robots) {

            System.out.println("\n----------------------------------------------");

            robot.displayStatus();
            robot.startRobot();
            robot.performMission();

            // Interface references
            if (robot instanceof Flyable) {
                Flyable flyingRobot = (Flyable) robot;
                flyingRobot.fly();
            }

            if (robot instanceof Swimmable) {
                Swimmable swimmingRobot = (Swimmable) robot;
                swimmingRobot.swim();
            }

            if (robot instanceof Climbable) {
                Climbable climbingRobot = (Climbable) robot;
                climbingRobot.climb();
            }

            robot.stopRobot();
        }

        System.out.println("\n==============================================");
        System.out.println("All Rescue Missions Demonstrated Successfully!");
        System.out.println("==============================================");
    }
}