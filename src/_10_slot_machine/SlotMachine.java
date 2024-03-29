package _10_slot_machine;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SlotMachine implements ActionListener{
	public static void main(String[] args) {
		SlotMachine sM=new SlotMachine();
		sM.slotSetUp();
	}
	JFrame frame=new JFrame("the slots");
	JPanel panel=new JPanel();
	JLabel slot1=new JLabel();
	JLabel slot2=new JLabel();
	JLabel slot3=new JLabel();
	JButton spin=new JButton("spin");
	int winCounter=0;
	public void slotSetUp() {
		spin.addActionListener(this);
		frame.setVisible(true);
		frame.setSize(700,300);
		frame.add(panel);
		panel.add(spin);
	}
	public int randomNum() {
		Random rn = new Random();
		int amountOfSlots = rn.nextInt(3) + 1;
		System.out.println(amountOfSlots);
		return amountOfSlots;
	}
	public String randomPic() {
		String pic="";
		int i=randomNum();
		if(i==1) {
			pic= "cherry.jpg";
		}
		else if(i==2) {
			pic= "orange.jpg";
		}
		else if(i==3) {
			pic= "lime.jpg";
		}
		return pic;
	}
	public void drawSlots() {
		String slotPic1=randomPic();
		String slotPic2=randomPic();
		String slotPic3=randomPic();
		slot1=showImage(slotPic1);
		slot2=showImage(slotPic2);
		slot3=showImage(slotPic3);
		panel.add(slot1);
		panel.add(slot2);
		panel.add(slot3);
		panel.add(spin);
		frame.pack();
		if(slotPic1.equals(slotPic2)&&slotPic1.equals(slotPic3)) {
			System.out.println("YOU WIN");
			winCounter=winCounter+1;
		}
		else {
			System.out.println("YOU LOSE");
		}
		System.out.println("AMOUNT OF WINS IS "+winCounter);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==spin) {
		slot1.setIcon(new ImageIcon(getClass().getResource(randomPic())));
			frame.remove(panel);
			panel=new JPanel();
			frame.add(panel);

			drawSlots();
		}
	}
	private JLabel showImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		return image;
	}
	
}
