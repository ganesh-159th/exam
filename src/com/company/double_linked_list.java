package com.company;
import java.util.*;


public class double_linked_list {
    class node {
        node prev;
        int data;
        node next;

        node(int data) {
            this.prev = null;
            this.data = data;
            this.next = null;
        }
    }


    node head = null;

    void addnode(int data) {
        node temp = new node(data);
        if (head == null) {
            head = temp;

        } else {
            node start = head;
            while (start.next != null) {
                start = start.next;
            }
            start.next = temp;
            temp.next = start;
        }
    }


        public static void main (String[]args){
            double_linked_list dll = new double_linked_list();
            dll.addnode(78);
            dll.addnode(90);
            System.out.println("\n the entered number are :"+dll);
        }
    }

