package com.company;
import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class hello_world_using_applet extends JFrame {
    public static void main(String[] args) {
        JFrame obj= new JFrame("action");
        JButton b1= new JButton("find");
        JTextField t1= new JTextField(20);
        JPanel p= new JPanel(new GridLayout(7,8));
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setDisabledTextColor(Color.red);
            }
        });
        p.add(t1);
        p.add(b1);
        obj.add(p);
        obj.setVisible(true);



    }
}
