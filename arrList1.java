import java.util.ArrayList;
public class arrList1 {
    public static void main(String [] args)
    {
      ArrayList al=new ArrayList();
      ArrayList al1=new ArrayList();
      ArrayList al2=new ArrayList();

      al.add("wellcome");
      al.add("to");
      al.add("arraylist");
      al.add(1);
      al.add("Umesh");
      al.add('A');
      al.add(true);
      al.add(null);

      al1.add("raja");
      al1.add("bittu");
      al1.add("krishna");
      al1.add("kripa");


      al2.add("tit");
      al2.add("lnct");
      al2.add("NRI");
      al2.add(191);
      al2.add(0111);


      System.out.println(al);
      System.out.println(al1);
      System.out.println(al2);

      al.add(al2);
      al.add(al2);
      System.out.println(al);
      System.out.println(al.size());

      al2.set(1, "Orientel");
      System.out.println(al2);
   
    }
}
