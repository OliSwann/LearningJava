package moreExamples;

import javax.swing.*;  
import java.awt.event.*;

public class StartingSwing {
	
public static void main(String[] args) {  
    JFrame f=new JFrame("Button Example");  
    final JTextField tf=new JTextField();  
    tf.setBounds(50,50, 150,20);  
    JButton b=new JButton("Click Here");  
    b.setBounds(50,100,95,30);  
    b.addActionListener(new ActionListener() {  
    	
public void actionPerformed(ActionEvent e){  
            tf.setText("BOO!");  
        }  
    }); 
f.add(b);//adding button in JFrame  
f.add(tf);
          
f.setSize(400,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
}
