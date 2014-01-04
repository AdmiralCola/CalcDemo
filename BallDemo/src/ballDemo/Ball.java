package ballDemo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JComponent;

public class Ball extends JComponent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Orb orb1;
	private int x,y,delay;
	private int dx,dy;
	private boolean moving = true;
	private Random randGen;
	private Color color;
	
	public Ball (int x1, int y1, int d, int dx1, int dy1, Color random)
	{
		x = x1;
		y = y1;
		
		dx = dx1;
		dy = dy1;
		
		delay = d;
		color = random;
		
		orb1 = new Orb(x,y,this);
	}
	
	public void startAnimation()
	{
		class AnimationRunnable implements Runnable
		{
			public void run()
			{
				randGen = new Random();
				
				try
				{
					do
					{
						if((x <= 10)||(x >= 1480))
						{
							dx = dx * -1;
						}
					
						if ((y < 10)||(y >= 980))
						{
							dy = dy * -1;
						}
						x = x + dx;
						y = y + dy;
						
						
						repaint();
						Thread.sleep(delay);
					
					}while(moving);
				}
				
				catch (InterruptedException exception)
	            {
	            	
	            }
	            finally
	            {
	            	
	            }
				
			}
		}
		
		Runnable r = new AnimationRunnable();
		Thread t = new Thread(r);
		t.start();
	}

	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		orb1.draw(g2, x, y, color);
	}
}
