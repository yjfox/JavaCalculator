/* This project is a simple calculator, which contains some basic math functions, 
 * such as Plus, Minus, Multiplication and Division
 * 
 * Now I have created an repository on GitHub, 
 * so that everyone could give their own contribution to this project. 
 * 
 * GitHub @yjfox
 * 
 * JavaCalculator.java
 * Created on Sep 14th, 2013, by Jun Yin.
*/

import java.awt.event.*;
import javax.swing.*;

public class JavaCalculator extends JFrame{
	
	double firnum;
	double sednum;
	double result;
	double negnum;
   
	int calculateflag;                 //goto equalPerformed() will find that value 1 means "+",2 means "-",3 means "*" and 4 means "/"

	boolean decimalflag = false;       //let program know if user click the symbol of decimal 
	boolean newnumflag = false;        //creating a new start of calculation
	boolean equalmulclick = false;     //controlling the multiple "=" click
	
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton cleanup;   // with setText'c', used for cleaning all numbers in display
	JButton decimal;   // with setText'.', it is a decimal symbol control
	JButton divide;    
	JButton multiply;
	JButton plus;
	JButton minus;
	JButton symbol;    // with setText'+/-', used for creating a negative number
	JButton equal;     // click it to show the result 
	JTextField display;
	JPanel panel;
	
	
	public JavaCalculator() {
		
		button0 = new JButton();
		button1 = new JButton();
		button2 = new JButton();
        button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();
		button6 = new JButton();
		button7 = new JButton();
		button8 = new JButton();
		button9 = new JButton();
		cleanup = new JButton();
		decimal = new JButton();
		divide = new JButton();
		multiply = new JButton();
		plus = new JButton();
		minus = new JButton();
		symbol = new JButton();
		equal = new JButton();
		display = new JTextField();
		panel = new JPanel();
		
		// setBackground(Color(204,204,204)); 
		setResizable(false);
		
		display.setEditable(false);
		display.setBorder(BorderFactory.createEtchedBorder());
		
		button1.setText("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (newnumflag == true) { 
					display.setText(button1.getText());
					newnumflag = false;
				}
				else
					display.setText(display.getText()+button1.getText());
	        	equalmulclick = false;
			}
		});
		
		button2.setText("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (newnumflag == true) {
					display.setText(button2.getText());
					newnumflag = false;
				}
				else
					display.setText(display.getText()+button2.getText());
	        	equalmulclick = false;
			}
		});
		
		button3.setText("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (newnumflag == true) {
					display.setText(button3.getText());
					newnumflag = false;
				}
				else
					display.setText(display.getText()+button3.getText());
	        	equalmulclick = false;
			}
		});
		
		button4.setText("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (newnumflag == true) {
					display.setText(button4.getText());
					newnumflag = false;
				}
				else
					display.setText(display.getText()+button4.getText());
	        	equalmulclick = false;
			}
		});
		
		button5.setText("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (newnumflag == true) {
					display.setText(button5.getText());
					newnumflag = false;
				}
				else
					display.setText(display.getText()+button5.getText());
	        	equalmulclick = false;
			}
		});
		
		button6.setText("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (newnumflag == true) {
					display.setText(button6.getText());
					newnumflag = false;
				}
				else
					display.setText(display.getText()+button6.getText());
	        	equalmulclick = false;
			}
		});
		
		button7.setText("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (newnumflag == true) {
					display.setText(button7.getText());
					newnumflag = false;
				}
				else
					display.setText(display.getText()+button7.getText());
	        	equalmulclick = false;
			}
		});
		
		button8.setText("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (newnumflag == true) {
					display.setText(button8.getText());
					newnumflag = false;
				}
				else
					display.setText(display.getText()+button8.getText());
	        	equalmulclick = false;
			}
		});
		
		button9.setText("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (newnumflag == true) {
					display.setText(button9.getText());
					newnumflag = false;
				}
				else
					display.setText(display.getText()+button9.getText());	
	        	equalmulclick = false;
			}
		});
		
		button0.setText("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (newnumflag == true) {
					display.setText(button0.getText());
					newnumflag = false;
				}
				else
					display.setText(display.getText()+button0.getText());	
	        	equalmulclick = false;
			}
		});

		cleanup.setText("C");
		cleanup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        display.setText("");
		        decimalflag=false;   
		        equalmulclick = false;
			}
		});
		
		decimal.setText(".");
		decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(decimalflag==false) {
						display.setText(display.getText()+decimal.getText());
			            decimalflag=true;
			            equalmulclick = false;
					}
				}catch(NumberFormatException evt){
					display.setText("INPUT ERROR");
					newnumflag = true;
				}
			}
		});
		
		plus.setText("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				try {
					if(!("".equals(display.getText()))) {
				    	firnum=(Double.parseDouble(String.valueOf(display.getText())));
					}
					display.setText("");
					calculateflag=1;
					decimalflag=false;   
					equalmulclick = false;
				}catch(NumberFormatException evt){
					display.setText("INPUT ERROR");
					newnumflag = true;
				}
			}
		});
		
		divide.setText("/");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(!("".equals(display.getText()))) {
				    	firnum=(Double.parseDouble(String.valueOf(display.getText())));
					}
					display.setText("");
					calculateflag=4;
					decimalflag=false;
					equalmulclick = false;
				}catch(NumberFormatException evt){
					display.setText("INPUT ERROR");
					newnumflag = true;
				}
			}
		});
		
		minus.setText("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(!("".equals(display.getText()))) {
				    	firnum=(Double.parseDouble(String.valueOf(display.getText())));
					}
					display.setText("");
					calculateflag=2;
					decimalflag=false;   
					equalmulclick = false;
				}catch(NumberFormatException evt){
					display.setText("INPUT ERROR");
					newnumflag = true;
				}
			}
		});
		
		multiply.setText("*");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(!("".equals(display.getText()))) {
				    	firnum=(Double.parseDouble(String.valueOf(display.getText())));
					}
					display.setText("");
					calculateflag=3;
					decimalflag=false;   
					equalmulclick = false;
				}catch(NumberFormatException evt){
					display.setText("INPUT ERROR");
					newnumflag = true;
				}
			}
		});
		
		symbol.setText("+/-");
		symbol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					negnum=(Double.parseDouble(String.valueOf(display.getText())));
					negnum=negnum*(-1);
					display.setText(String.valueOf(negnum));   
					equalmulclick = false;
				}catch(NumberFormatException evt){
					display.setText("INPUT ERROR");
					newnumflag = true;
				}
			}
		});
		
		equal.setText("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					equalPerformed(e);
				}catch(NumberFormatException evt){
					display.setText("INPUT ERROR");
					newnumflag = true;
				}
			}
		});
		
		// draw the interface
	
        GroupLayout panelLayout = new GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(display, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(button7, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(button8, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(cleanup, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(button0, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                            .addComponent(symbol, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(equal, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(button9, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(multiply, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(decimal, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(divide, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(button1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(button5, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button6, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(plus, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(minus, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(button5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                    .addComponent(button6, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button8, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button9, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                        .addComponent(multiply, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                    .addComponent(button7, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cleanup, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                    .addComponent(decimal, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                    .addComponent(button0, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                    .addComponent(divide, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(equal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(symbol, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
	}
	//draw end
	
	//method used for calculation
	
	private void equalPerformed(ActionEvent e) {
		if(equalmulclick)
			firnum = result;
		else
			sednum=(Double.parseDouble(String.valueOf(display.getText())));  
		
		switch(calculateflag) {
		case 1: {
			result = firnum + sednum;
			display.setText(String.valueOf(result));        		
			newnumflag = true;
			equalmulclick = true;
			break;
			}
		case 2: {
			result = firnum - sednum;
			display.setText(String.valueOf(result));
			newnumflag = true;
			equalmulclick = true;
			break;
			}
		case 3: {
			result = firnum * sednum;
			display.setText(String.valueOf(result));
			newnumflag = true;
			equalmulclick = true;
			break;
			}
		case 4: {
			if(sednum==0) {
				display.setText("Any number cannot be divided by 0");
				break;
				}
			else {
				result = firnum / sednum;
				display.setText(String.valueOf(result)); 
				newnumflag = true;        
				equalmulclick = true;
				break;
				}
			}
		}
		
	}
	
    public static void main(String[] args) {
    	JavaCalculator jc=new JavaCalculator();
		jc.setVisible(true);
		jc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jc.setTitle("Calculator");
    }
    
}