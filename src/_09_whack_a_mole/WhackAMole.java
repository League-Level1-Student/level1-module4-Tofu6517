package _09_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WhackAMole implements ActionListener{
	public static void main(String[] args) {
		WhackAMole wAM=new WhackAMole();
		wAM.moleSetUp();
		wAM.drawButtons();
	}
	Random rn = new Random();
	int answer = rn.nextInt(24) + 1;
	JPanel newPanel=new JPanel();
	JButton pressed = createButton(""); 
	public void moleSetUp() {
		JFrame frame=new JFrame("Wak.A.Mole");
		frame.setVisible(true);
		frame.setSize(310,330);
		frame.add(newPanel);
	}
	public int theRN() {
		Random rn = new Random();
		int answer = rn.nextInt(24) + 1;
		return answer;
		}
	public void drawButtons() {
		
		for(int i=1;i<24;i++) {
			JButton normalButton = createButton(""); 
			if(i==answer) {
				pressed.setText("MOLE!");
				newPanel.add(pressed);
			}
			newPanel.add(normalButton);
		}
	}
	private JButton createButton(String p) {
		JButton theButton=new JButton();
		return theButton;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pressed) {
			drawButtons();
		}
	}
}
