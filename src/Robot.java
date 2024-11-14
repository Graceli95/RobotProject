import java.awt.*;

import static java.awt.Color.black;

public class Robot {
//    Battery level percentage 0 to 100
    int batteryLevel = 100;
//    current speed of the Robot
    int speed = 0;
//    name of the Robot
    String name = "Robo";
//color of the robot
    String color = "black";
//    weight of the robot
    int weight = 20;
//    simulates the robot moving forward
    public void move(){
        speed = 5;
        System.out.println(name + " is moving at speed "+speed +" mph");
    }

//    simulates the robot stopping
    public void stop(){
        speed = 0;
        System.out.println(name + " has stopped");
    }
//    charge battery
    public void chargeBattery() {
       int betteryLevel = 100;
        System.out.println(name + "'s battery is fully charged");
        System.out.println("ff");
    }
//    display the current battery level of the robot
    public void checkBatteryLevel(){
        System.out.println(name + "'s current battery level is "+batteryLevel + "%");
    }
//    display name, color, and weight of the robot
    public void displayInfo(){
//        System.out.println("Robot's name is " + name, " color is " + color, " weight is " + weight");
        System.out.println("Robot's name is " + name);
        System.out.println("Robot's color is " + color);
        System.out.println("Robot's weight is " + weight);
    }
}
