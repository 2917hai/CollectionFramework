// import java.util.TreeSet;
// public class Tset {
//     public static void main(String[] args) {
//         TreeSet<String> t=new TreeSet<>();
//         t.add("A");
//         t.add("Z");
//         t.add("B");
//         t.add("X");
//         t.add("X");

//         System.out.println(t+"\t");
//         System.out.println("------------------------------------");


//     }
// }








// import java.util.TreeSet;
// import java.util.Comparator;
// public class Tset implements Comparator<String> {
//     public static void main(String[] args) {
//         TreeSet<String> t=new TreeSet<>(new Tset());
//         t.add("A");
//         t.add("Z");
//         t.add("B");
//         t.add("X");
//         t.add("X");

//         System.out.println(t+"\t");
//         System.out.println("------------------------------------");


//     }

//     @Override
//     public int compare(String o1, String o2) {
//         return o2.compareTo(o1);
//         
//     }
// }





import java.util.TreeSet;
import java.util.Comparator;
public class Tset implements Comparator<Integer> {
    public static void main(String[] args) {
        TreeSet<Integer> t=new TreeSet<>(new Tset());
       t.add(100);
       t.add(5);
       t.add(50);
       t.add(200);
       t.add(150);
       System.out.println(t+"\t");
       System.out.println("------------------------------------");


    }

    @Override
    public int compare(Integer o1,Integer o2) {
       if(o1>o2)
       {
        return 1;
       }
       else if(o2>o1)
       {
        return -1;
       }
       else
       {
        return 0;
       }
    }

}


 