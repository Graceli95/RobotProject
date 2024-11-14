//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        create a new Robot object
        Robot myRobot = new Robot();
        myRobot.move();   //make the myRobot move
        myRobot.stop();  //make the myRobot stop
        myRobot.checkBatteryLevel();  //check battery level
        myRobot.chargeBattery();  //charge the robot's battery
        myRobot.displayInfo();


    }
}