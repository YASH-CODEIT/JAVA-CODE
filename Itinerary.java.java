import java.util.HashMap;
public class Itinerary{
    public static void main(String[] args) {
        String start=null;
        //creating ticket HashMap
        HashMap<String,String> ticket=new HashMap<>();
        ticket.put("Chennai","Bengaluru");
        ticket.put("Mumbai", "Delhi");
        ticket.put("Goa","Chennai");
        ticket.put("Delhi", "Goa");
        //creating reverse of ticket HashMap
        HashMap<String,String> revTicket=new HashMap<>();
        revTicket.put("Bengaluru","Chennai");
        revTicket.put("Delhi", "Mumbai");
        revTicket.put("Chennai","Goa");
        revTicket.put("Goa","Delhi");

        //now compare key of ticket exists in the revTicket HashMap or not
        for(String key:ticket.keySet()){
            if(!revTicket.containsKey(key)){
             start=key;
            }
          
            }
            while(ticket.containsKey(start)){
                System.out.print(start+"->");
                start=ticket.get(start);
            }
        
            System.out.println(start);
       
    }
}
