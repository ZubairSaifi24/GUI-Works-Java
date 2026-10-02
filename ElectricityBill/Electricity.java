package com.ElectricityBill;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Electricity implements ActionListener
{

	private Frame frm;
	private Button btn1,btn2;
	private Label l1,l2,l3,l4;
	private TextField tf1,tf2,tf3,tf4;
	
	public Electricity() {
		frm = new Frame();
		btn1 = new Button(" Bill ");
		btn2 = new Button(" clr ");
		l1 = new Label("Enter customer name : ");
		l2 = new Label("Enter electricity unit   : ");
		l3 = new Label("Enter rate of electricity  : ");
		l4 = new Label("Bill                              :");
		tf1 = new TextField();
		tf2 = new TextField();
		tf3 = new TextField();
		tf4 = new TextField();
	}
	
	public void action() {
		frm.setVisible(true);
		frm.setLayout(null);
		frm.setTitle("Electricity Bill Machine");
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
        l3.setBounds(50,190,170,40);
        l4.setBounds(50,235,170,40);
        frm.add(l1);
        frm.add(l2);
        frm.add(l3);
        frm.add(l4);

        tf1.setBounds(230,100,100,30);
        tf2.setBounds(230,145,100,30);
        tf3.setBounds(230,190,100,30);
        tf4.setBounds(230, 235, 130, 50);
        frm.add(tf1);
        frm.add(tf2);
        frm.add(tf3);
        frm.add(tf4);

        btn1.setBounds(110,300,70,40);
        btn1.addActionListener(this);
        btn1.setBackground(Color.GREEN);
        frm.add(btn1);

        btn2.setBounds(190,300,70,40);
        btn2.addActionListener(this);
        btn2.setBackground(Color.RED);
        frm.add(btn2);
	}
	
	public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn1)
        {
            String s1 = tf1.getText();
            String s2 = tf2.getText();
            String s3 = tf3.getText();
            if(!(s1.isBlank() || s2.isBlank() || s3.isBlank())) {
                int n2 = Integer.parseInt(s2);
                int n3 = Integer.parseInt(s3);
                int n4 = n2*n3;
                tf4.setText(s1+"\n"+"Bill : "+n4);
            }
            else {
                System.out.println(" Field is blank");
                tf4.setText("0");
            }
        }
        
        if(e.getSource() == btn2)
        {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
        }
    }
	
}









