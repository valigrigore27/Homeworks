import java.util.Random;

public class RobotMotion extends Thread {
    private Robot robot;
    private TimeKeeper timekeeper;


    public RobotMotion(Robot robot, TimeKeeper timekeeper) {
        this.robot = robot;
        this.timekeeper = timekeeper;
        setDaemon(true);
    }

    public TimeKeeper getTimekeeper() {
        return timekeeper;
    }

    public void setTimekeeper(TimeKeeper timekeeper) {
        this.timekeeper = timekeeper;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }


    @Override
    public void run() {

        int n = getRobot().getMatrix().length();
        getRobot().setTokensPlacedInMatrix(0);
        for (int i = 0; i < n; i++) {
            if (getTimekeeper().isTimeExceeded()) {
                System.out.println("Time limit exceeded");
                return;
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    int rnd = new Random().nextInt(getRobot().getSharedMemory().length());
                    if (getRobot().getMatrix().getElementsFromMatrix(i, j, k) == 0) {
                        getRobot().getMatrix().elemEqualValue(i, j, k, getRobot().getSharedMemory().getTokens()[rnd]);
                        getRobot().incTokensPlacedInMatrix();
                    }
                }
            }

            for (int j = 0; j < n; j++) {
                System.out.print("[");
                for (int k = 0; k < n; k++) {
                    System.out.print(getRobot().getMatrix().getElementsFromMatrix(i, j, k));
                    if (k != n - 1) {
                        System.out.print(", ");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            System.out.println("error");
                        }
                    }
                }
                System.out.print("]\n");
            }
            System.out.println();
            if (getTimekeeper().isTimeExceeded()) {
                System.out.println("Time limit reached");
                break;
            }
        }
    }


}




