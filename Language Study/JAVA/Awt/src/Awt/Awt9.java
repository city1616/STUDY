package Awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt9 {

	public static void main(String[] args) {
		awt_9 f = new awt_9();
	}

}

class awt_9 extends Frame {
	public awt_9() {
		setLayout(new GridLayout(4, 2));
		
		add(new Button("버튼1"));
		add(new Button("버튼2"));
		add(new Button("버튼3"));
		add(new Button("버튼4"));
		add(new Button("버튼5"));
		add(new Button("버튼6"));
		add(new Button("버튼7"));
		add(new Button("버튼8"));
		
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