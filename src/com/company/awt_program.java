package com.company;
import java.awt.*;
import java.util.*;


public class awt_program extends Frame {
    awt_program() {
  Button b1= new Button("click here !!");
  b1.setBounds(5,5,5,5);
  add(b1);


        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        awt_program obj= new awt_program();

    }

}
