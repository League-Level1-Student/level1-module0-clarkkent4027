package _07_fortune_cookie;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if (rand == 1) {
			JOptionPane.showMessageDialog(null,
					"Although you will be faced with many ups and downs in your life. You will be blessed with lots of luck within whatever you do and wherever you go");
		} else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You will win 2.4 million dollars from the lottery!!!");
		} else if (rand == 3) {
			JOptionPane.showMessageDialog(null,
					"Your dog will die. If you don't have a dog, your cat will die. If you don't have a cat, your goldfish will die. If you don't have a goldfish, your hanmster will die. And if you don't have a hamster, well you get the point");
		} else if (rand == 4) {
			JOptionPane.showMessageDialog(null, "You just won 1000 dollars! to redeem it, just click on the link below and enter your credit card number, your adress, your phone number, your bank account info, and your social security number! ");
		}else if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You won a 10,000 shopping spree at the mall with every single store and a free one week ultimate Disney cruise to Hawaii for your whole family where you guys will be staying at the Disney resort in Hawaii!");
		}

	}

}
