package Awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt_7 {

	public static void main(String[] args) {
		awt7 f = new awt7();
	}

}

class awt7 extends Frame {
	public awt7() {
		setLayout(new BorderLayout());
		
		add(new Button("버튼1"), BorderLayout.EAST);
		add(new Button("버튼2"), BorderLayout.WEST);
		add(new Button("버튼3"), BorderLayout.SOUTH);
		add(new Button("버튼4"), BorderLayout.NORTH);
		add(new Button("버튼5"), BorderLayout.CENTER);
		
		setSize(300, 200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
}