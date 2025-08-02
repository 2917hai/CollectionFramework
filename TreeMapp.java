import java.util.Map;
import java.util.TreeMap;

public class TreeMapp {
    public static void main(String[] args) {
        TreeMap<String,Integer> t=new TreeMap<String,Integer>();
        t.put("A", 65);
        t.put("B",66);
        t.put("Z", 90);
        t.put("Y", 89);
        System.out.println("all key values pair"+t);
        for(Map.Entry e:t.entrySet())
        {
            System.out.println("key is "+e.getKey()+" \t"+"values is "+e.getValue());
        }

        TreeMap<Integer,String> t1=new TreeMap<Integer,String>();
        t1.put(10, "A");
        t1.put(20, "B");
        t1.put(30, "C");
        t1.put(40, "D");
        t1.put(50, "E");
        t1.put(60, "F");
        t1.put(70, "G");
        t1.put(80, "H");
        t1.put(90, "I");
        t1.put(100, "J");
        System.out.println("key values pair are "+t1);              //  {10=A, 20=B, 30=C, 40=D, 50=E, 60=F, 70=G, 80=H, 90=I, 100=J}
        System.out.println("HeadMap: "+t1.headMap(50));         // {10=A, 20=B, 30=C, 40=D}
        System.out.println("TailMap: "+t1.tailMap(30));        // {30=C, 40=D, 50=E, 60=F, 70=G, 80=H, 90=I, 100=J}
        System.out.println("firstKey: "+t1.firstKey());                //10
        System.out.println("lastKey: "+t1.lastKey());                   // 100
        System.out.println("subMap: "+t1.subMap(10, 50));  //   {10=A, 20=B, 30=C, 40=D}
    }
}
