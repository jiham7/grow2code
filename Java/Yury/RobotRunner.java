
/**
 * Write a description of class RobotRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RobotRunner
{
    public static void main(String[] args) {
        Robot robot = new WasteDisposalRobot();
        
        robot.start();
        robot.work();
        robot.stop();

    }
}
