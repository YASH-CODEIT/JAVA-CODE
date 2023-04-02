import java.util.HashSet;
import java.util.Iterator;
public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(10);
        set.add(10);//This element is not added.Each element of hashSet is unique.
        //print
        System.out.println(set);
        //search
        if(set.contains(10)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        //remove
        if(set.remove(2))
            System.out.println("Successfully Removed!!!");
        else
            System.out.println("Not Removed");
        //Iterated
        Iterator it=set.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }
    }
}
