package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {
		Robot house = new Robot();
		house.setSpeed(250);
		house.turn(235);
		house.move(400);
		house.turn(125);
		house.penDown();
		drawHouse(house); 
	}
void drawHouse(Robot houses) {
	houses.move(100);
	houses.turn(90);
	houses.move(20);
	houses.turn(90);
	houses.move(100);
	houses.move(20);
}
}
