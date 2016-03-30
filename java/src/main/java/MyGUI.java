import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

/**
 * A demo of GUI programming with Swing
 */
public class MyGUI extends JFrame {
	
	public MyGUI() {
		super("The GUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton theButton = new JButton("Click me!");
        theButton.addActionListener(new ActionListener() {
            //class body goes here
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked me!");
            }
        });

        JButton theButton2 = new JButton("No, click me!");
        theButton2.addActionListener(new ActionListener() {
            //class body goes here
            public void actionPerformed(ActionEvent e) {
                System.out.println("Haha, I win!");
            }
        });

        this.setLayout(new FlowLayout());

		this.add(theButton);
        this.add(theButton2);
		
		this.pack();
		this.setVisible(true);		
	}
    
	
	public static void main(String[] args) {
        new MyGUI(); //create the frame
    }
}
