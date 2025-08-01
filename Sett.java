import java.util.Iterator;
import java.util.LinkedHashSet;

public class Sett {
    public static void main(String[] args) {
           LinkedHashSet<Integer> st=new LinkedHashSet<>();
           st.add(10);
           st.add(20);
           st.add(100);
           st.add(80);
           st.add(30);
           System.out.println(st.add(80));// false becouse duplicate not allowed
           System.out.println(st+"\t");
           for(Integer i:st)
           {
            System.out.println("\t"+i);
           }
           Iterator it=st.iterator();
           while (it.hasNext()) {
            System.out.println("\t"+it.next());
            
           }

    }
}
