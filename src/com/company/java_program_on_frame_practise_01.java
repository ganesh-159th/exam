package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout.*;


public class java_program_on_frame_practise_01 {
    public static void main(String[] args) {
        Frame obj=new Frame("my project");
        obj.setSize(300,300);

        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JButton p1a= new JButton("name");//p1a
        p1a.setSize(30,30);
        p1a.setBounds(50,50,50,50);
        p1a.setBackground(Color.yellow);
        JButton p1b=new JButton("age");//p1b
        p1b.setSize(30,30);
        p1b.setBounds(50,50,50,50);
        p1b.setBackground(Color.yellow);
        JButton p2a=new JButton("size");//p2a
        p2a.setSize(30,30);
        p2a.setBounds(50,50,50,50);
        p2a.setBackground(Color.yellow);
        JButton p2b=new JButton("section");//p2b
        p2b.setSize(30,30);
        p2b.setBounds(50,50,50,50);
      //  p2b.setTextf();        p2b.setBackground(Color.yellow);
        p1.add(p1a);
        p1.add(p1b);
        p2.add(p2a);
        p2.add(p2b);

       obj.add(p1);
       obj.add(p2);
        obj.setVisible(true);


    }
}
