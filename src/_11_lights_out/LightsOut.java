package _11_lights_out;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * Lights Out is a puzzle game with a grid of lights that are either on (light
 * gray) or off (white). Pressing any light will toggle it and its adjacent
 * lights. The goal of the game is to switch all the lights off.
 * 
 * Follow the instructions below to create your own version of Lights Out
 * 
 * 
 */
public class LightsOut implements MouseListener {
	JFrame frame = new JFrame();
	JPanel gamePanel = new JPanel();
	
	public int randomNum() {
		Random rn = new Random();
		int onOrOff = rn.nextInt(2) + 1;
		return onOrOff;
	}
	public LightsOut() {

		/** PART 1. CREATE YOUR LIGHT BOARD **/
		//1. Make your gamePanel a 5x5 grid with setLayout(new GridLayout(5, 5));
		gamePanel.setLayout(new GridLayout(5,5));
			frame.setVisible(true);


			//2. Add 25 JLabels to your gamePanel (these are your lights)
		for(int i=0;i<25;i++) {
			int onOrOff=randomNum();;
			if(onOrOff==1) {
			JLabel light=new JLabel();
			light.setText(Integer.toString(i));
			light.setBackground(Color.WHITE);
			light.setOpaque(true);
			light.addMouseListener(this);
			gamePanel.add(light);
			}
			else {
				JLabel light=new JLabel();
				light.setText(Integer.toString(i));
				light.setBackground(Color.LIGHT_GRAY);
				light.setOpaque(true);
				light.addMouseListener(this);
				gamePanel.add(light);
				
			}
		frame.setSize(500, 500);
		frame.add(gamePanel);
		frame.pack();
		}
			//3. Use setText() to add a position number to each light (0-24).
			
			//4. Set the background of each light to LIGHT_GRAY
			// - you will also have to set the background to opaque.
			// - Use light.setOpaque(true);

			//5. Add a mouseListener to each light
		
		
		//6. Add your panel to a frame

		//7. Set the size of the frame

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		/** PART 2: TOGGLE NEIGHBORING LIGHTS **/
		// 1. Get the light that was clicked on `(JLabel) e.getSource`
			int trueBackground=0;
			JLabel light=(JLabel) e.getSource();
			String position=light.getText();
			int positionI=Integer.parseInt(position);
			makeMove(positionI);
			for(int i=0;i<25;i++) {
				JLabel llight=getLightAtPosition(i);
				if(llight.getBackground()==Color.LIGHT_GRAY) {
					trueBackground=trueBackground+1;
				}
			}
			if(trueBackground==25) {
				System.out.println("You Win!");
			}
		// 2. Get the number (position) of the light

		// 3. Now use the makeMove method to code which lights turn on and off.

		// 4.Check if the player has won (e.g. all the lights are off)
		// ---- HINT: use `getLightAtPosition` to get the light at each position
		// ---------- use 'getBackground' to get the light color

		/** PART 3: RANDOMIZE YOUR BOARD **/
		// Now that your game works can you make the game start with some lights on?

	}

	void makeMove(int pos) {
		toggle((JLabel) gamePanel.getComponent(pos));
		if (pos >= 5) {
			toggle((JLabel) gamePanel.getComponent(pos - 5));
		}
		if ((pos + 1) % 5 != 0) {
			toggle((JLabel) gamePanel.getComponent(pos + 1));
		}
		if (pos % 5 != 0) {
			toggle((JLabel) gamePanel.getComponent(pos - 1));
		}
		if (pos + 5 <= 24) {
			toggle((JLabel) gamePanel.getComponent(pos + 5));
		}
	}

	JLabel getLightAtPosition(int lightPosition) {
		return (JLabel) gamePanel.getComponent(lightPosition);
	}

	void toggle(JLabel label) {
		if (label.getBackground() == Color.WHITE) {
			label.setBackground(Color.LIGHT_GRAY);

		} else {
			label.setBackground(Color.WHITE);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
	}
}
