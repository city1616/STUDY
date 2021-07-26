package Awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Awt_4 {

	public static void main(String[] args) {
		awt4_frame f = new awt4_frame();
	}

}

class awt4_frame extends Frame {
	public awt4_frame() {
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
