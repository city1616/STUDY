package Awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt_11 {

	public static void main(String[] args) {
		awt11 f = new awt11();
	}

}

class awt11 extends Frame {
	Panel p01, p02;
	Label dis;
	Button btn01, btn02;
	
	public awt11() {
		setLayout(new BorderLayout());
		
		p01 = new Panel();
		p02 = new Panel();
		
		dis = new Label("[결과] : 아무런 버튼도 눌리지 않았다.");
		btn01 = new Button("버튼1");
		btn02 = new Button("버튼2");
		
		p01.add(dis);
		p02.add(btn01);
		p02.add(btn02);
		
		add(p01, BorderLayout.NORTH);
		add(p02, BorderLayout.CENTER);
		
		pack();
		
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