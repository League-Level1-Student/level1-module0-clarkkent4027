package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {

		Random h = new Random();
		Robot house = new Robot();
		house.setSpeed(250);
		house.turn(235);
		house.move(465);
		house.turn(125);
		house.penDown();
		for (int i = 0; i < 10; i++) {
			int v = h.nextInt(3);
			if (v == 0) {
				drawHouse(house, "small", Color.ORANGE);
			} else if (v == 1) {
				drawHouse(house, "medium", Color.MAGENTA);

			} else if (v == 2) {
				drawHouse(house, "large", Color.CYAN);
			}
		}
	}

	void drawHouse(Robot houses, int height, Color color) {
		houses.setPenColor(color);
		houses.move(height);

		if (height == 250) {
			drawFlatRoof(houses);
		} else
			drawPointyRoof(houses);
		houses.move(height);
		houses.turn(-90);
		houses.setPenColor(50, 255, 0);
		houses.move(35);
		houses.turn(-90);

	}

	void drawHouse(Robot houses, String height, Color color) {
		if (height.equals("small")) {
			drawHouse(houses, 60, Color.ORANGE);
		} else if (height.equals("medium")) {
			drawHouse(houses, 120, Color.MAGENTA);
		} else if (height.equals("large")) {
			drawHouse(houses, 250, Color.CYAN);
		}
	}

	static void drawPointyRoof(Robot houses1) {
		houses1.turn(45);
		houses1.move(35);
		houses1.turn(90);
		houses1.move(35);
		houses1.turn(45);

	}

	void drawFlatRoof(Robot houses) {
		houses.turn(90);
		houses.move(55);
		houses.turn(90);
	}
}
