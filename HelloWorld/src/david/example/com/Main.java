package david.example.com;

import java.awt.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args){
		
		System.out.println("Hello World!");
		
		Font font = new Font("Verdana", Font.BOLD, 30);
		
		JLabel text = new JLabel("Hello World");
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setFont(font);
		
		JFrame frame = new JFrame("Hello World Program");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.add(text);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
}
