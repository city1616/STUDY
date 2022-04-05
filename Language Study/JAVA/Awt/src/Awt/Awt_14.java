package Awt;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt_14 extends Frame implements TextListener {

	TextField txt;
	
	Label lbl_info;
	
	public static void main(String[] args) {
		new Awt_14("TextEvent Example");
	}
	
	public void textValueChanged(TextEvent e) {
		lbl_info.setText(txt.getText());
	}
	
	public Awt_14(String str) {
		super(str);
		txt = new TextField("PUT ON TEXT", 20);
		txt.addTextListener(this);
		lbl_info = new Label("          ");
		add("Center", lbl_info);
		add("South", txt);
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
