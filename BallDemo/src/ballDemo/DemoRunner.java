package ballDemo;

import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;

public class DemoRunner 
{
	static Random randGen;
	
	public static void main(String [] args)
	{
		final int BALLSIZE = 128;
		
		JFrame frame = new JFrame();
		
		frame.setSize(1500,1000);
		frame.setTitle("Balls");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		randGen = new Random();
		
		Ball[] ball = new Ball[BALLSIZE];
		
		
		
		for(int i =0; i<BALLSIZE; i++)
		{
			ball[i] = new Ball(randGen.nextInt(1500) ,randGen.nextInt(1000),33, randGen.nextInt(50)-25, randGen.nextInt(50)-25, getRandomColor());
			
			frame.add(ball[i]);
			
			ball[i].startAnimation();
			
			frame.setVisible(true);
			
			frame.setBackground(new Color(0,0,0));
			frame.repaint();
		}
		
		
	}
	
	public static Color getRandomColor()
	{
		return new Color(randGen.nextInt(64)+128,randGen.nextInt(64)+128,randGen.nextInt(64)+128);
	}
}
