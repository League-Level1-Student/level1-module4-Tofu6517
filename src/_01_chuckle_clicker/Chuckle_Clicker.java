package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chuckle_Clicker implements ActionListener {
	public static void main(String[] args) {
		new Chuckle_Clicker().makeButtons();
	}
	JButton jokeButton=new JButton("Joke");
	JButton punchlineButton=new JButton("Punchline");
	 void makeButtons(){
		JFrame frame = new JFrame("Simple");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(jokeButton);
		panel.add(punchlineButton);
		jokeButton.addActionListener(this);
		punchlineButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource() == jokeButton) {
			System.out.println("Joke.");
		}
		if(event.getSource() == punchlineButton) {
			System.out.println("punchline.");
		}
	}
}
