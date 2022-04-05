package Awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt_18 extends Frame implements ActionListener {
	Button redBtn, blueBtn;
	
	public Awt_18() {
		setLayout(new FlowLayout());
		
		redBtn = new Button("RED");
		blueBtn = new Button("BLUE");
		
		add(redBtn);
		add(blueBtn);
		
		redBtn.setForeground(Color.red);
		blueBtn.setForeground(Color.blue);

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
		Button obj = (Button)e.getSource();
		
		if(obj == redBtn) {
			this.setBackground(Color.red);
			System.out.println("Red");
		}
		else {
			this.setBackground(Color.blue);
			System.out.println("Blue");
		}
			
	}
	

	public static void main(String[] args) {
		Awt_18 a = new Awt_18();
	}

}
