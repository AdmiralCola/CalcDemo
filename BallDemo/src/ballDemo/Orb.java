package ballDemo;


import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Orb 
{
	private int xLeft;
	private int yTop;
	JComponent component;
	Ellipse2D.Double sphere;
	
	public Orb (int x, int y, JComponent aComponent)
	{
		xLeft = x;
		yTop = y;
		component = aComponent;
		sphere = new Ellipse2D.Double(x,y,100,100);
	}

	public void draw(Graphics2D g2, int left, int top, Color color)
	{
		try
		{
			xLeft = left;
			yTop = top;
			
			sphere 
			   = new Ellipse2D.Double(xLeft, yTop, 10, 10);
			
			g2.setPaint(color);
			g2.fill(sphere);
			g2.draw(sphere);
			
		
		}
		finally
		{
		}
	}
	
	public double getCenterX()
	{
		return sphere.getCenterX();
	}
	
	public double getCenterY()
	{
		return sphere.getCenterY();
	}
}
