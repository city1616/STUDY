package Awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt_19 extends Frame implements ActionListener {
	Label lbl_info;
	Button[] btn = new Button[7];
	Color[] color = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue,Color.magenta, Color.black};
	String[] string = {"RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "MAGENTA", "BLACK"};
	
	public Awt_19(String str) {
		super(str);
		setLayout(new FlowLayout());
		for(int i = 0; i < 7; i++) {
			btn[i] = new Button(string[i]);
			btn[i].setForeground(color[i]);
			btn[i].addActionListener(this);
		}
		setSize(500, 300);
		setVisible(true);
	
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e) {
		Button obj = (Button)e.getSource();
		System.out.println(obj);
		
		for(int i = 0; i < 7; i++) {
			System.out.println(btn[i]);
			if(obj == btn[i]) {
				this.setBackground(color[i]);
			}
		}
	}
	public static void main(String[] args) {
		new Awt_19("ACTIONEVENT EXAMPLE");
	}
}
