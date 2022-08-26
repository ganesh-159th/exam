package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import javax.swing.ButtonGroup;


public class java_program_frame_practise_02 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3;
    JLabel bm;

    public void java_program_frame_practise_02()
    {
        setVisible(true);
        setSize(200,200);
        setLayout(new FlowLayout(FlowLayout.CENTER));

        JRadioButton r1= new JRadioButton("red");
        JRadioButton r2= new JRadioButton("green");
        JRadioButton r3= new JRadioButton("yellow");
ButtonGroup obj1= new ButtonGroup();
obj1.add(r1);
obj1.add(r2);
obj1.add(r3);
add(r1);
add(r2);
add(r3);
r1.addActionListener(this);
r2.addActionListener(this);
r3.addActionListener(this);
JLabel bm= new JLabel();
bm.setBounds(67,80,45,45);
add(bm);

    }

    @Override
    public void actionPerformed(ActionEvent e)  {
        if(e.getActionCommand().equals("red")) {
            r1.setBackground(Color.red);
            bm.setText("stop");
        }
        else if(e.getActionCommand().equals("green")){
            r2.setBackground(Color.green);
            bm.setText("go");
        }
        else {
            r3.setBackground(Color.yellow);
            bm.setText("ready");

        }


    }

    public static void main(String[] args) {

    new java_program_frame_practise_02();
    }
}
