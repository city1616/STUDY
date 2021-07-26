package Awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt_5 {

	public static void main(String[] args) {
		awt5 f = new awt5();
	}

}

class awt5 extends Frame {
	public awt5() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 20));
		
		add(new Button("BUTTON 1"));
		add(new Button("BUTTON 2"));
		add(new Button("BUTTON 3"));
		add(new Button("BUTTON 4"));
		add(new Button("BUTTON 5"));
		add(new Button("BUTTON 6"));
		
		setSize(300, 200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		}
		);
	}
}