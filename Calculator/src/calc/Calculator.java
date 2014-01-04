package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame
{
	
	private static final long serialVersionUID = 1L;
	
	JTextField screen;
	JPanel window;
	JButton zero;
	JButton one;
	JButton two;
	JButton three;
	JButton four;
	JButton five;
	JButton six;
	JButton seven;
	JButton eight;
	JButton nine;
	JButton clear;
	JButton clearAll;
	JButton add;
	JButton sub;
	JButton mul;
	JButton div;
	String mathWin;
	int stored;


	public Calculator(String name)
	{
		super(name);
		drawWindow();
	}


	private void drawWindow() 
	{
		mathWin = new String ("0");
		stored = 0;
		
		window = new JPanel();
		screen = new JTextField();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		screen.setEditable(false);
		screen.setText(mathWin);
		
		one = new JButton();
		two = new JButton();
		three = new JButton();
		four = new JButton();
		five = new JButton();
		six = new JButton ();
		seven = new JButton();
		eight = new JButton();
		nine = new JButton();
		zero = new JButton();
		
		clear = new JButton();
		clearAll = new JButton();
		
		add = new JButton();
		sub = new JButton();
		mul = new JButton();
		div = new JButton();
		
        one.setText("1");
        one.addActionListener(new ActionListener()
        {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				if((mathWin.equalsIgnoreCase(new String(Integer.toString(stored))))||(mathWin.equalsIgnoreCase("0")))
				{
					mathWin = "1";
				}
				
				else
				{
					mathWin += "1";
				}
				
				screen.setText(mathWin);
			}
        	
        });

        two.setText("2");
        two.addActionListener(new ActionListener()
        {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				if((mathWin.equalsIgnoreCase(new String(Integer.toString(stored))))||(mathWin.equalsIgnoreCase("0")))
				{
					mathWin = "2";
				}
				
				else
				{
					mathWin += "2";
				}
				
				screen.setText(mathWin);
			}
        	
        });
        
        three.setText("3");
        three.addActionListener(new ActionListener()
        {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				if((mathWin.equalsIgnoreCase(new String(Integer.toString(stored))))||(mathWin.equalsIgnoreCase("0")))
				{
					mathWin = "3";
				}
				
				else
				{
					mathWin += "3";
				}
				
				screen.setText(mathWin);
			}
        	
        });
        
        four.setText("4");
        four.addActionListener(new ActionListener()
        {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				if((mathWin.equalsIgnoreCase(new String(Integer.toString(stored))))||(mathWin.equalsIgnoreCase("0")))
				{
					mathWin = "4";
				}
				
				else
				{
					mathWin += "4";
				}
				
				screen.setText(mathWin);
			}
        	
        });
        
        five.setText("5");
        five.addActionListener(new ActionListener()
        {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				if((mathWin.equalsIgnoreCase(new String(Integer.toString(stored))))||(mathWin.equalsIgnoreCase("0")))
				{
					mathWin = "5";
				}
				
				else
				{
					mathWin += "5";
				}
				
				screen.setText(mathWin);
			}
        	
        });
        
        six.setText("6");
        six.addActionListener(new ActionListener()
        {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				if((mathWin.equalsIgnoreCase(new String(Integer.toString(stored))))||(mathWin.equalsIgnoreCase("0")))
				{
					mathWin = "6";
				}
				
				else
				{
					mathWin += "6";
				}
				
				screen.setText(mathWin);
			}
        	
        });
        
        seven.setText("7");
        seven.addActionListener(new ActionListener()
        {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				if((mathWin.equalsIgnoreCase(new String(Integer.toString(stored))))||(mathWin.equalsIgnoreCase("0")))
				{
					mathWin = "7";
				}
				
				else
				{
					mathWin += "7";
				}
				
				screen.setText(mathWin);
			}
        	
        });
        
        eight.setText("8");
        eight.addActionListener(new ActionListener()
        {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				if((mathWin.equalsIgnoreCase(new String(Integer.toString(stored))))||(mathWin.equalsIgnoreCase("0")))
				{
					mathWin = "8";
				}
				
				else
				{
					mathWin += "8";
				}
				
				screen.setText(mathWin);
			}
        	
        });
        
        nine.setText("9");
        nine.addActionListener(new ActionListener()
        {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				if((mathWin.equalsIgnoreCase(new String(Integer.toString(stored))))||(mathWin.equalsIgnoreCase("0")))
				{
					mathWin = "9";
				}
				
				else
				{
					mathWin += "9";
				}
				
				screen.setText(mathWin);
			}
        	
        });
        
        zero.setText("0");
        zero.addActionListener(new ActionListener()
        {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				if((mathWin.equalsIgnoreCase(new String(Integer.toString(stored))))||(mathWin.equalsIgnoreCase("0")))
				{
					mathWin = "0";
				}
				
				else
				{
					mathWin += "0";
				}
				
				screen.setText(mathWin);
			}
        	
        });
        
        clear.setText("C");
        clear.addActionListener(new ActionListener()
        {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				if(mathWin.length() == 1)
				{
					mathWin = "0";
				}
				
				else
				{
					mathWin = mathWin.substring(0,mathWin.length()-1);
				}
				
				screen.setText(mathWin);
			}
        	
        });
        
        clearAll.setText("CE");
        clearAll.addActionListener(new ActionListener()
        {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				stored = 0;
				mathWin = "0";
				
				screen.setText(mathWin);
			}
        	
        });
        
        add.setText("+");
        add.addActionListener(new ActionListener()
        {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				int holding = 0;
				
				if(Integer.parseInt(mathWin) != stored)
				{
					holding = Integer.parseInt(mathWin);
				}
				
				stored += holding;
				
				mathWin = new String (Integer.toString(stored));
				
				screen.setText(mathWin);
			}
        	
        });
        
        sub.setText("-");
        sub.addActionListener(new ActionListener()
        {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				int holding = 0;
				
				if(Integer.parseInt(mathWin) != stored)
				{
					holding = Integer.parseInt(mathWin);
				}
				
				stored -= holding;
				
				mathWin = new String (Integer.toString(stored));
				
				screen.setText(mathWin);
			}
        	
        });
        
        mul.setText("*");
        mul.addActionListener(new ActionListener()
        {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				int holding = 0;
				
				if(Integer.parseInt(mathWin) != stored)
				{
					holding = Integer.parseInt(mathWin);
				}
				
				stored = stored * holding;
				
				mathWin = new String (Integer.toString(stored));
				
				screen.setText(mathWin);
			}
        	
        });
        
        div.setText("%");
        div.addActionListener(new ActionListener()
        {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				int holding = 0;
				
				if(Integer.parseInt(mathWin) != stored)
				{
					holding = Integer.parseInt(mathWin);
				}
				
				stored = stored / holding;
				
				mathWin = new String (Integer.toString(stored));
				
				screen.setText(mathWin);
			}
        	
        });

        screen.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        screen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(zero, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                            .addComponent(seven, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clearAll, 0, 0, Short.MAX_VALUE)
                            .addComponent(nine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mul, 0, 0, Short.MAX_VALUE)
                            .addComponent(div, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(screen, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(four)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(five)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(six)
                            .addGap(18, 18, 18)
                            .addComponent(sub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(one)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(two)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(three)
                            .addGap(18, 18, 18)
                            .addComponent(add))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one)
                    .addComponent(two)
                    .addComponent(three)
                    .addComponent(add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four)
                    .addComponent(five)
                    .addComponent(six)
                    .addComponent(sub))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven)
                    .addComponent(eight)
                    .addComponent(nine)
                    .addComponent(mul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zero)
                    .addComponent(clear)
                    .addComponent(clearAll)
                    .addComponent(div))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>
		
}

