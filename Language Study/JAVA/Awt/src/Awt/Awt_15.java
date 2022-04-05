package Awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt_15 {

	public static void main(String[] args) {
		new FrameEvent();
	}

}

class FrameEvent extends Frame implements ActionListener {
	TextField txtContent;
	TextArea txtState;
	Button btnAppend;
	
	public FrameEvent() {
		setLayout(new BorderLayout());
		txtContent = new TextField(20);
		txtState = new TextArea();
		btnAppend = new Button("Extra");
		
		this.add(txtContent, BorderLayout.NORTH);
		this.add(txtState, BorderLayout.CENTER);
		this.add(btnAppend, BorderLayout.SOUTH);
		
		btnAppend.addActionListener(this);
		setSize(400, 300);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
				
			}
		}
		);
	}
	public void actionPerformed(ActionEvent e) {
		if(txtContent.getText() != "") {
			txtState.append(txtContent.getText() + "\n");
			txtContent.setText("");
		}
	}
}