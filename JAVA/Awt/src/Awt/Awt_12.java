package Awt;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt_12 extends Frame {
	
	public Awt_12(String str) {
		super(str);
		setLayout(new FlowLayout());
		Label lbl1 = new Label("ID");
		Label lbl2 = new Label("PASSWORD");
		TextField txt1 = new TextField("ID", 20);
		
		TextField txt2 = new TextField(20);
		txt2.setEchoChar('*');
		add(lbl1); add(txt1);
		add(lbl2); add(txt2);
		setSize(200, 200);
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
		new Awt_12("TextField Example");
	}

}
