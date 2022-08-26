package com.company;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class java_program_on_factorial_of_the_number_in_swing extends JFrame{
    JTextField t1,t2;
    java_program_on_factorial_of_the_number_in_swing()
    {
        JLabel l1 = new JLabel(" enter the number :");
        JLabel l2 = new JLabel(" result :");
        t1=new JTextField(20);
        t2=new JTextField(20);
        JPanel p= new JPanel(new GridLayout(2,3));
        JButton b= new JButton("find");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number= t1.getText();
                int num=Integer.parseInt(number);
                long fac= num;
                for(int i=num;i>1;i--)
                {
                    fac=fac*(i-1);
                }
                t2.setText(Long.toString(fac));

            }
        });
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(b);
        add(p);
        setVisible(true);
    }

    public static void main(String[] args) {
        java_program_on_factorial_of_the_number_in_swing obj= new java_program_on_factorial_of_the_number_in_swing();
    }
}








