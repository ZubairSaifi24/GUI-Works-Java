package com.conversionKM;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Convert implements ActionListener{
		private Frame frm;
		private Button btn1,btn2;
		private Label l1,l2;
		private TextField tf1,tf2;
		
		public Convert() {
			frm = new Frame();
			btn1 = new Button(" Convert ");
			btn2 = new Button(" clr ");
			l1 = new Label("Enter the Kilometers : ");
			l2 = new Label("Result                         :");
			tf1 = new TextField();
			tf2 = new TextField();
			
		}
		
		public void action() {
			frm.setVisible(true);
			frm.setLayout(null);
			frm.setTitle("Conversion calculator");
			frm.setBounds(30, 100, 400, 500);
			frm.addWindowListener(new WindowAdapter() {
	            @Override
	            public void windowClosing(WindowEvent e) {
	                frm.dispose();
	                System.exit(0);
	            }
	        });
			
			l1.setBounds(50,100,170,40);
	        l2.setBounds(50,145,170,40);
	        frm.add(l1);
	        frm.add(l2);
	     
	        tf1.setBounds(230,100,100,30);
	        tf2.setBounds(230,145,100,30);
	        frm.add(tf1);
	        frm.add(tf2);

	        btn1.setBounds(110,200,70,40);
	        btn1.addActionListener(this);
	        btn1.setBackground(Color.GREEN);
	        frm.add(btn1);

	        btn2.setBounds(190,200,70,40);
	        btn2.addActionListener(this);
	        btn2.setBackground(Color.RED);
	        frm.add(btn2);
		}
		
		public void actionPerformed(ActionEvent e)
	    {
	        if(e.getSource()==btn1)
	        {
	            String s1 = tf1.getText();
	            if(!(s1.isBlank())) {
	                int n1 = Integer.parseInt(s1);	               
	                int n2 = n1*1000;
	                tf2.setText(n2 + "");
	            }
	            else {
	                System.out.println(" Field is blank");
	                tf2.setText("0");
	            }
	        }
	         
	        if(e.getSource() == btn2)
	        {
	            tf1.setText("");
	            tf2.setText("");
	         
	        }
	    }
}
