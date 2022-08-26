package com.company;
import java.sql.Struct;
import java.util.*;
public class java_program_On_double_Linked_list {
    class node {
        int data;
        node prev;

        node next;
        public node (int data){
            this.data=data;
        }
    }
    node head,tail=null;
    public void insert(int data)
    {
        node newnode = new node(data);
        if(head ==null)
        {
            head=tail=newnode;
            head.prev=null;
            tail.next=null;
        }
        else
        {
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
            tail.next=null;
        }
    }
  public void display()
  {
      node current=head;
      if(head==null)
      {
          System.out.println("\n the list is empty :");
          return ;
      }
      System.out.println("\n the nodes of double linked list is :");
      while (current !=null)
      {
          System.out.println(current.data+"");
          current =current .next;
      }
  }




    public static void main(String[] args) {
        java_program_On_double_Linked_list dlist=new java_program_On_double_Linked_list();
        dlist.insert(78);
        dlist.insert(89);
        dlist.insert(90);
        dlist.insert(34);
        dlist.insert(79);
        dlist.insert(790);
        dlist.insert(34);
        dlist.insert(123);
        dlist.display();



    }

}
