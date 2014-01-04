package calc;

import javax.swing.JFrame;

public class CalculatorRunner 
{
	public static void main(String [] args)
	{
		Calculator calc = new Calculator("Calculator");
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc.setVisible(true);
	}
}
