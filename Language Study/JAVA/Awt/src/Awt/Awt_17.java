package Awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt_17 {

	public static void main(String[] args) {
		new FrameEvent1();
	}

}

class FrameEvent1 extends Frame implements ActionListener {
	Button redBtn, blueBtn;
	
	public FrameEvent1() {
		setLayout(new FlowLayout());
		
		redBtn = new Button("RED");
		blueBtn = new Button("BLUE");
		
		add(redBtn);
		add(blueBtn);
		
		redBtn.addActionListener(this);
		blueBtn.addActionListener(this);
		
		setSize(300, 200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("PUSH BUTTON");
		
	}
}