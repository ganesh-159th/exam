package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.*;
import java.awt.Frame;
class section_09 extends JFrame
{
    JTextField t1,t2;
    section_09()
    {
        JFrame p= new JFrame("\n calculate:");
        JPanel b= new JPanel(new GridLayout(3,2));
        JButton c= new JButton("click ");
        t1.setSize(10,10);
        t2.setSize(10,10);
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = t2.getText();
                if(number=="0")
                {
                    System.out.println("\n there is an exception in the program :");

                }
                else
                {
                    System.out.println("\n there is not exception in the program :");
                }

            }
        });
        p.add(b);
        b.add(t1);
        b.add(t2);
        b.add(c);
        add(p);
        p.setVisible(true);


    }

    public static void main(String[] args) {
        section_09 obj= new section_09();
    }


}

