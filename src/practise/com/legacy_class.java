package sample.com;
import java.util.*;
import java.util.Stack;
import java.util.Hashtable;
import java.util.Vector;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Dictionary;

public class legacy_class {
    public static void main(String[] args) {
        Stack<Integer> c= new Stack<>();
        c.push(56);
        c.push(89);
        c.push(67);
        System.out.println(c);
        Hashtable<Integer,String> D1= new Hashtable<>();
        D1.put(89,"ganesh");
        D1.put(67,"suman");
        D1.put(90,"sapan");
        System.out.println(D1);
        Vector<Integer> c1= new Vector<>();
        c1.add(0,45);
        c1.add(1,55);
        c1.add(2,65);
        System.out.println(c1);
        HashMap<Integer,String>g = new HashMap<>(7);
        g.put(67,"dihbu");
        g.clear();
        g.put(90,"fdiuhf");
        System.out.println("hash map :"+g);





    }
}
