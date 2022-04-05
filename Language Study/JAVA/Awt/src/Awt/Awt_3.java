package Awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt_3 {

	public static void main(String[] args) {
		Awt3_frame f = new Awt3_frame();
	}
}

class Awt3_frame extends Frame {
	public Awt3_frame() {
		setSize(300, 200);
		setVisible(true);
		Awt3_handler handler = new Awt3_handler();
		addWindowListener(handler);
	}
}
class Awt3_handler extends WindowAdapter {
	public void windowClosing(WindowEvent arg0) {
		super.windowClosing(arg0);
		System.exit(0);
	}
}