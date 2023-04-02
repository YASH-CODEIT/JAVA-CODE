import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class hashMap {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> map=new HashMap<>();
        //Insert
        map.put("India",890);
        map.put("America",349);
        map.put("China",3812);
        map.put("Russia",292);
        //print
        System.out.println(map);
        //search
        if(map.containsKey("India"))
            System.out.println("It is contain");
        else
            System.out.println("It is not contain");
        //remove
        map.remove("India");
        //Iterate
        //1.Method
        for(Map.Entry<String,Integer> e:map.entrySet()) {
            System.out.print(e.getKey() + ":");
            System.out.print(e.getValue());
            System.out.println();
        }
        //2.Method
        Set<String> it=map.keySet();
        for(String key:it){
            System.out.println(key+" "+map.get(key));
        }
        //To get value through key
        System.out.println(map.get("China"));
        }
    }

