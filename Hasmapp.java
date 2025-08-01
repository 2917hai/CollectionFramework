import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

 

public class Hasmapp {
    public static void main(String[] args) {
         HashMap<String,Integer> hm1=new HashMap<>();
         hm1.put("A",20);
           hm1.put("Z",567);
             hm1.put("C",28);
               hm1.put("B",50);
               System.out.println(""+hm1);
               System.out.println("values of specific keys");
               System.out.println("key Z: "+hm1.get("Z"));

               Set<String> keys=hm1.keySet();
               for(String k:keys)
               {
                System.out.println("Key is "+k+"\t value is"+hm1.get(k));
               }

               // print all value of map
               Collection<Integer>v=hm1.values();
               System.out.println("values are:"+v);

               System.out.println("print all data or values");
               for(int i:v)
               {
                System.out.println("=> "+i);
               }


               //  pritn data using entry interface  
               for(Map.Entry<String,Integer>a:hm1.entrySet())
               {
                System.out.println("keys: "+a.getKey()+" values: "+a.getValue());
               }
    }
}
