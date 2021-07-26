package Awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt_10 {

	public static void main(String[] args) {
		awt10 f = new awt10();
	}

}

class awt10 extends Frame {
	public awt10() {
		setLayout(new GridLayout(4, 3, 20, 10));
		
		add(new Button("버튼1"));
		add(new Button("버튼2"));
		add(new Button("버튼3"));
		add(new Button("버튼4"));
		add(new Button("버튼5"));
		add(new Button("버튼6"));
		add(new Button("버튼7"));
		add(new Button("버튼8"));
		add(new Button("버튼9"));
		add(new Button("버튼10"));
		
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