import javax.swing.*;
import java.awt.event.*;
 
public class Calculator implements ActionListener {

	JFrame frame;
	JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0;
	JButton buttonPoint, buttonBack, buttonPlus, buttonMinus, buttonMult, buttonDev, buttonEqual, buttonB1, buttonB2;
	JTextField t;
	
    double first=0,second=0,result=0;
    int operator=0;
	
	Calculator()
    {
        frame = new JFrame("Calculator");
        frame.setLayout(null);
        t = new JTextField();
        button1=new JButton("1");
        button2=new JButton("2");
        button3=new JButton("3");
        button4=new JButton("4");
        button5=new JButton("5");
        button6=new JButton("6");
        button7=new JButton("7");
        button8=new JButton("8");
        button9=new JButton("9");
        button0=new JButton("0");
        buttonPlus=new JButton("+");
        buttonMinus=new JButton("-");
        buttonMult=new JButton("*");
        buttonDev=new JButton("/");
        buttonEqual=new JButton("=");
        buttonB1=new JButton("(");
        buttonB2=new JButton(")");
        buttonPoint=new JButton(".");
        buttonBack=new JButton("Backspace");
        

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button0);

        frame.add(buttonPlus);
        frame.add(buttonMinus);
        frame.add(buttonMult);
        frame.add(buttonDev);
        frame.add(buttonEqual);
        frame.add(buttonB1);
        frame.add(buttonB2);
        frame.add(buttonPoint);
        frame.add(buttonBack);
        
        frame.add(t);
        t.setBounds(50, 10, 290, 50);
        
        

        button1.setBounds(50,100,50,50);
        button2.setBounds(110,100,50,50);
        button3.setBounds(170,100,50,50);
        button4.setBounds(50,160,50,50);
        button5.setBounds(110,160,50,50);
        button6.setBounds(170,160,50,50);
        button7.setBounds(50,220,50,50);
        button8.setBounds(110,220,50,50);
        button9.setBounds(170,220,50,50);
        button0.setBounds(50,290,50,50);
        buttonPoint.setBounds(110,290,50,50);
        buttonBack.setBounds(230,290,110,50);
        buttonPlus.setBounds(230,100,50,50);
        buttonMinus.setBounds(230,160,50,50);
        buttonMult.setBounds(230,220,50,50);
        buttonDev.setBounds(290,100,50,50);
        buttonEqual.setBounds(170,290,50,50);
        buttonB1.setBounds(290,160,50,50);
        buttonB2.setBounds(290,220,50,50);
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonPoint.addActionListener(this);
        buttonBack.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonMult.addActionListener(this);
        buttonDev.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonB1.addActionListener(this);
        buttonB2.addActionListener(this);
        
        
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.setVisible(true);
    }
	
	public void actionPerformed(ActionEvent e)
    {
		if(e.getSource()==button1)
            t.setText(t.getText().concat("1"));
        
        if(e.getSource()==button2)
            t.setText(t.getText().concat("2"));
        
        if(e.getSource()==button3)
            t.setText(t.getText().concat("3"));
        
        if(e.getSource()==button4)
            t.setText(t.getText().concat("4"));
        
        if(e.getSource()==button5)
            t.setText(t.getText().concat("5"));
        
        if(e.getSource()==button6)
            t.setText(t.getText().concat("6"));
        
        if(e.getSource()==button7)
            t.setText(t.getText().concat("7"));
        
        if(e.getSource()==button8)
            t.setText(t.getText().concat("8"));
        
        if(e.getSource()==button9)
            t.setText(t.getText().concat("9"));
        
        if(e.getSource()==button0)
            t.setText(t.getText().concat("0"));
        
        if(e.getSource()==buttonPoint)
            t.setText(t.getText().concat("."));
        
        if(e.getSource()==buttonPlus)
        {
            first=Double.parseDouble(t.getText());
            operator=1;
            t.setText("");
        } 
        
        if(e.getSource()==buttonMinus)
        {
            first=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
        }
        
        if(e.getSource()==buttonMult)
        {
            first=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
        }
        
        if(e.getSource()==buttonDev)
        {
            first=Double.parseDouble(t.getText());
            operator=4;
            t.setText("");
        }
        	
        if(e.getSource()==buttonEqual)
        {
            second=Double.parseDouble(t.getText());
        
            switch(operator)
            {
                case 1: result=first+second;
                    break;
        
                case 2: result=first-second;
                    break;
        
                case 3: result=first*second;
                    break;
        
                case 4: result=first/second;
                    break;
        
                default: result=0;
            }
        
            t.setText(""+result);
        }
        
        if(e.getSource()==buttonBack)
        {
            String s=t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++)
            t.setText(t.getText()+s.charAt(i));
        }  
        
    }
    
}
