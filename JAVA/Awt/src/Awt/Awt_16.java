package Awt;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt_16 extends Frame {
	Checkbox os1, os2, os3;
	Checkbox cpu1, cpu2, cpu3;
	CheckboxGroup cbg;
	
	public  Awt_16(String str) {
		super(str);
		setLayout(new FlowLayout());
		
		Label lbl1 = new Label("INSTALLING OS", Label.CENTER);
		add(lbl1);
		
		os1 = new Checkbox("WINDOW 98");
		os2 = new Checkbox("WINDOW 2000");
		os3 = new Checkbox("WINDOW XP");
		add(os1);
		add(os2);
		add(os3);
		
		Label lbl2 = new Label("SETLECT CPU", Label.CENTER);
		add(lbl2);
		
		cbg = new CheckboxGroup();
		
		cpu1 = new Checkbox("PHANTIUM 4", cbg, true);
		cpu2 = new Checkbox("ATHLON XP", cbg, false);
		cpu3 = new Checkbox("CELLOLON", cbg, false);
		add(cpu1);
		add(cpu2);
		add(cpu3);
		
		setSize(460, 150);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
				
			}
		});
	}

	public static void main(String[] args) {
		new Awt_16("CHECKBOX Example");
	}

}
