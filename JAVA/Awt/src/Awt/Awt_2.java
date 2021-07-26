package Awt;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt_2 extends Frame {
	public Awt_2(String str) {
		super(str);
		setLayout(new FlowLayout());
		TextArea txt1 = new TextArea("SIMPLE MEMO", 10, 20);
		add(txt1);
		setSize(300, 500);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		}
		);
	}

	public static void main(String[] args) {
		new Awt_2("TextArea Example");
	}

}
