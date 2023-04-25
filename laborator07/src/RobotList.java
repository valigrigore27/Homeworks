import java.util.List;

public class RobotList {
    private List<Robot> RobotList;

    public RobotList(List<Robot> robotList) {
        RobotList = robotList;
    }

    public void setRobotList(List<Robot> robotList) {
        RobotList = robotList;
    }

    public List<Robot> getRobotList() {
        return RobotList;
    }
    public void addList(Robot robot){
        RobotList.add(robot);
    }
}
