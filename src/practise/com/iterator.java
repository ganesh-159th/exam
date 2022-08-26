package sample.com;
import javax.management.MBeanAttributeInfo;
import java.util.*;
        import java.util.Iterator;


public class iterator {
    public static void main(String[] args) {
     ArrayList<Integer>C = new ArrayList<>();
     C.add(78);
     C.add(67);
     C.add(90);
     Iterator<Integer>c= C.listIterator();
        {
            System.out.println(c.next());
        }
        ListIterator<Integer> C1= C.listIterator();
        System.out.println("\n before the normal numner is :");
        while(C1.hasNext())
        {
            System.out.println("\n the element is :"+C1.next());
        }
        while(C1.hasPrevious()){
            System.out.println("\n the element is :"+C1.previous());
        }







    }
}
