package _02_my_first_swing_gui;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstSwingGUI {
	public void run() {

		// 1. Create and initialize an object of the JFrame class
JFrame Hi = new JFrame();
// 2. Set your JFrame object to be visible
Hi.setVisible(true);
		// 3. Run your program. Do you see your window? It's probably very
		// small.
//Yes! It was very small
		// 4. Set the default close operation to JFrame.EXIT_ON_CLOSE
Hi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 5. Create and initialize an object of the JPanel class
JPanel Bye = new JPanel();
		// 6. Create and initialize an object of the JLabel class
JLabel Hello = new JLabel();
		// 7. Set the text of the JLabel to a lovely greeting.
Hello.setText("Hello!");
		// 8. Add the JPanel object to the JFrame
Hi.add(Bye);
		// 9. Add the JLabel object to the JPanel
Bye.add(Hello);
		// 10. Pack your JFrame.
Hi.pack();
		// 11. Run your program again. Do you see your message.
//Yes! I see my message!
		// 12. Use the loadImage method to set the icon of the JLabel object.
Hello.setIcon(loadImage());
		// 13. Re-pack the JFrame object.
Hi.pack();
		// 14. Run the program one more time. Do you see the image?
//Yes! I see the image!
	}

	public ImageIcon loadImage() {
		try {
			return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("java.png")));
		} catch (IOException e) {

			return null;
		}
	}
}
