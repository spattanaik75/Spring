import java.util.*;

/**
 * Created by user on 2014/11/27.
 */
public class CollectionsDemo {

    public static void main(String[] args) {
        List a1=new ArrayList();
        a1.add("soumya");
        a1.add("soumyashree");
        System.out.println("ArrayList Elements");
        System.out.print("\t" + a1);

        List l1 =new LinkedList();
        l1.add("zara");
        l1.add("manahad");
        l1.add("bhaiya");
        System.out.println();
        System.out.println("Linkedlist elements:");
        System.out.print("\t" + l1);

        Set s1= new HashSet();
        s1.add("zombie");
        s1.add("nue");
        System.out.println();
        System.out.println("Hashset elements:");
        System.out.print("\t" + s1);

        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);
    }
}
