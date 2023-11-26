package _01_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chuckle_Clicker {
	public static void main(String[] args) {
		
	}
	void makeButtons(){
		JFrame frame = new JFrame("Simple");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton button1=new JButton("Joke");
		panel.add(button1);
		JButton button2=new JButton("Punchline");
		panel.add(button2);
	}
}
