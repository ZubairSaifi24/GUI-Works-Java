package com.GuiCalculator;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ServiceCal implements ActionListener
{
	private Frame frm;
	private Button btn1,btn2,btn3,btn4,clr;
	private Label l1,l2,l3;
	private TextField tf1,tf2,tf3;
	
	public ServiceCal() {
		frm = new Frame();
        btn1 = new Button(" + ");
        btn2 = new Button(" - ");
        btn3 = new Button(" * ");
        btn4 = new Button(" / ");
        clr = new Button(" C ");

        l1 =  new Label("Enter the n1   : ");
        l2 =  new Label("Enter the n2  : ");
        l3 =  new Label("Result          : ");
        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
	}
	
	public  void action()
    {
        frm.setVisible(true);
        frm.setLayout(null);
        frm.setTitle("Calculator");
        frm.setBounds(100,100,300,400);
        frm.addWindowListener((WindowListener) new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frm.dispose();
                System.exit(0);
            }
        });

        l1.setBounds(30,100,100,40);
        l2.setBounds(30,145,100,40);
        l3.setBounds(30,190,100,40);
        frm.add(l1);
        frm.add(l2);
        frm.add(l3);

        tf1.setBounds(130,100,100,40);
        tf2.setBounds(130,145,100,40);
        tf3.setBounds(130,190,100,40);
        frm.add(tf1);
        frm.add(tf2);
        frm.add(tf3);

        btn1.setBounds(30,245,50,40);
        btn1.addActionListener(this);
        btn1.setBackground(Color.ORANGE);
        frm.add(btn1);

        btn2.setBounds(85,245,50,40);
        btn2.addActionListener(this);
        btn2.setBackground(Color.GREEN);
        frm.add(btn2);
        
        btn3.setBounds(30,300,50,40);
        btn3.addActionListener(this);
        btn3.setBackground(Color.cyan);
        frm.add(btn3);
        
        btn4.setBounds(85,300,50,40);
        btn4.addActionListener(this);
        btn4.setBackground(Color.YELLOW);
        frm.add(btn4);


        clr.setBounds(140,245,50,40); 
        clr.setBackground(Color.RED);
        
        clr.addActionListener(this);
        frm.add(clr);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn1)
        {
            String s1 = tf1.getText();
            String s2 = tf2.getText();
            if(!(s1.isBlank() || s2.isBlank())) {
                int n1 = Integer.parseInt(s1);
                int n2 = Integer.parseInt(s2);
                int n3 = n1 + n2;
                tf3.setText(n3 + "");
            }
            else {
                System.out.println(" Field is blank");
                tf3.setText("0");
            }
        }
        if(e.getSource()==btn2)
        {
            String s1 = tf1.getText();
            String s2 = tf2.getText();
            if(!(s1.isBlank() || s2.isBlank())) {
                int n1 = Integer.parseInt(s1);
                int n2 = Integer.parseInt(s2);
                int n3 = n1 - n2;
                tf3.setText(n3 + "");
            }
            else {
                System.out.println(" Field is blank");
                tf3.setText("0");
            }
        }
        
        if(e.getSource()==btn3)
        {
            String s1 = tf1.getText();
            String s2 = tf2.getText();
            if(!(s1.isBlank() || s2.isBlank())) {
                int n1 = Integer.parseInt(s1);
                int n2 = Integer.parseInt(s2);
                int n3 = n1 * n2;
                tf3.setText(n3 + "");
            }
            else {
                System.out.println(" Field is blank");
                tf3.setText("0");
            }
        }
        
        if(e.getSource()==btn4)
        {
            String s1 = tf1.getText();
            String s2 = tf2.getText();
            if(!(s1.isBlank() || s2.isBlank())) {
                int n1 = Integer.parseInt(s1);
                int n2 = Integer.parseInt(s2);
                int n3 = n1 / n2;
                tf3.setText(n3 + "");
            }
            else {
                System.out.println(" Field is blank");
                tf3.setText("0");
            }
        }
        
        else if(e.getSource() == clr)
        {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        }
    }
	
	
}
