import javax.swing.*;
import java.awt.event.*;
 
public class Calculator {

	JFrame frame;
	JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0;
	
	Calculator()
    {
        frame = new JFrame("Calculator");
        frame.setLayout(null);
        //t = new JTextField();
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
        

        button1.setBounds(50,100,50,50);
        button2.setBounds(110,100,50,50);
        button3.setBounds(170,100,50,50);
        button4.setBounds(50,160,50,50);
        button5.setBounds(110,160,50,50);
        button6.setBounds(170,160,50,50);
        button7.setBounds(50,220,50,50);
        button8.setBounds(110,220,50,50);
        button9.setBounds(170,220,50,50);
        
        frame.setVisible(true);
        frame.setSize(350,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
    }
}
