import java.util.Vector;
public class vectr {
    public static void main(String [] args)
    {
        System.out.println("Vector");
        Vector v=new Vector();
      v.add("wellcome");
      v.add("to");
      v.add("arraylist");
      v.add(1);
      v.add("Umesh");
      v.add('A');
      v.add(true);
      v.add(null);
      System.out.println(v);

      for(int i=0; i<v.size(); i++)
      {
        System.out.println(v.get(i));
      }
      v.remove(1);
      System.out.println(v);

      v.set(0, "Mira");
      for(Object x:v)
      {
        System.out.println(x);
      }
      
    }
}
