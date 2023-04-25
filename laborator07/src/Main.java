import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        SharedMemory sharedMemory = new SharedMemory(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        List<Robot> robots = new ArrayList<Robot>();
        RobotList robotList = new RobotList(robots);

        Matrix matrix = new Matrix(5);
        Robot robot1 = new Robot(0, 0, sharedMemory, matrix, 1);
        //Robot robot2 = new Robot(1, 0, sharedMemory, matrix, 2);

        TimeKeeper timeKeeper = new TimeKeeper(TimeUnit.SECONDS.toMillis(50));
        timeKeeper.start();

        robotList.addList(robot1);
        RobotMotion robotMotion1 = new RobotMotion(robot1,timeKeeper);

        matrix.print();
        System.out.println("-------------------------------------");

        robotMotion1.start();



        try {
            robotMotion1.join();
            timeKeeper.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (timeKeeper.isTimeExceeded()) {
            System.out.println("TIME EXCEEDED.");
        } else {
            for (Robot robot : robotList.getRobotList()) {
                System.out.println("ROBOT WITH ID " + robot.getId() + " PUT " + robot.getTokensPlacedInMatrix() + " TOKENS" + " IN MATRIX");
            }
        }
    }
}
