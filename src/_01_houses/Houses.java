package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {

		Random h = new Random();
		Robot house = new Robot();
		house.setSpeed(250);
		house.turn(235);
		house.move(400);
		house.turn(125);
		house.penDown();
		for (int i = 0; i < 10; i++) {
			int v = h.nextInt(3);
			if (v == 0) {
				drawHouse(house, "small");
			} else if (v == 1) {
				drawHouse(house, "medium");

			} else if (v == 2) {
				drawHouse(house, "large");
			}
		}
	}

	void drawHouse(Robot houses, int height) {
		houses.move(height);
		houses.turn(90);
		houses.move(35);
		houses.turn(90);
		houses.move(height);
		houses.turn(270);
		houses.move(35);
		houses.turn(270);
	}

	void drawHouse(Robot houses, String height) {
		if (height.equals("small")) {
			drawHouse(houses, 60);
		} else if (height.equals("medium")) {
			drawHouse(houses, 120);
		} else if (height.equals("large")) {
			drawHouse(houses, 250);
		}

	}
}
