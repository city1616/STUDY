package Awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt_6 {

	public static void main(String[] args) {
		awt_frame_tt f = new awt_frame_tt();
	}

}

class awt_frame_tt extends Frame {
	public awt_frame_tt() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		add(new Button("add"));
		add(new Button("sub"));
		add(new Button("mul"));
		add(new Button("div"));
		add(new Button("calculate"));
		
		setSize(300 ,300);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
				
			}
		});
		
	}
}