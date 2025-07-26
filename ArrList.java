
import java.util.ArrayList;
public class ArrList {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("Umesh");
        al.add("Kumar");
        al.add(1);
        al.add('A');
        al.add(155.85);
        al.add(true);
        al.add(null);
        System.out.println(al);


        ///////////////   access the data of arrayList using loop   //////////////////
        
        for(int i=0; i<al.size(); i++)
        {
            System.out.print(al.get(i)+"\t");
        }

        //////////////////  update data of arraylist  /////////////////
        
        al.set(1, "yadav");
          System.out.println(al);

System.out.println();
          /////////////////////////////  delete data of arraylist   ////////////////
          
          al.remove("yadav");
            System.out.println(al);
            al.add("raja");
            al.add("bittu");
            al.remove(1);
              System.out.println(al);
                System.out.println(al);
                al.add(0,"wellcome");

                ArrayList list1=new ArrayList();
                list1.add("kya");
                list1.add("Kyu");
                list1.add("kahe");
  
                al.add(list1);
                System.out.println("both list are show here");
                for(Object x:al)
                {
                    System.out.println(x);
                }

              
      
        
       
    }
}