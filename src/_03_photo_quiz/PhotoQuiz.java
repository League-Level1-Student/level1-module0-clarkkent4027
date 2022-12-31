package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// â€œCopy Image Addressâ€�)
		String photo = "https://www.pngitem.com/pimgs/m/408-4082725_teletubbies-tinky-winky-dancing-png-teletubbies-tinky-winky.png";
		// 2. create a variable of type "Component" that will hold your image
		Component quiz = createImage(photo);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
		quizWindow.add(quiz);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String tubbie = JOptionPane.showInputDialog(null, "Which Teletubbie is this?");
		// 7. print "CORRECT" if the user gave the right answer
		if (tubbie.equalsIgnoreCase("Tinky Winky")) {
			System.out.println("CORRECT!");
		} else {
			// 8. print "INCORRECT" if the answer is wrong
			System.out.println("INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(quiz);
		// 10. find another image and create it (might take more than one line
		// of code)
		String photo1 = "https://vignette.wikia.nocookie.net/tubbies/images/2/2e/Laa-Laa.jpg/revision/latest/scale-to-width-down/340?cb=20120502063614";
		Component quiz1 = createImage(photo1);
		// 11. add the second image to the quiz window
		quizWindow.add(quiz1);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
	String tubbie1 = JOptionPane.showInputDialog(null, "Which Teletubbie is this?");
		//// 14+ check answer, say if correct or incorrect, etc.
	if (tubbie1.equalsIgnoreCase("La La")) {
		System.out.println("CORRECT!");
	} else {

		}	System.out.println("INCORRECT");
	}
	
	private Component createImage(String imageUrl) throws MalformedURLException {
		URL ur1 = new URL(imageUrl);
		Icon icon = new ImageIcon(ur1);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
}                                                                                                                                                           
		/* OPTIONAL */
		// *14. add scoring to your quiz
		// *15. make something happen when mouse enters image
		// (imageComponent.addMouseMotionListener())
	
