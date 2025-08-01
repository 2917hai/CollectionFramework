/*
 * Cursor in Java->
 * 1) Enumetaion(1.0)
 *     A) To perform only Read Operations
 *     B) It is only for legacy class hence it is not a universal cursor
 *     C) It is single Direction cursor
 *     D) implemented class is vector
 * 
 * Limitation:
 *     We can aply only for legacy class it is not universol
 * method:
 *     1) hasMoreElement
 *     2) nextElemet
 * 2) Iterator
 *     A) TO perform read and remove operation
 *     B) This is universol cursor it means we iterate data of any collection object
 *     C) implemented class Vector or ArrayList we can create class using vector or arrayList
 *     C) It is single Direction cursor
 * 
 * method;
 *     1) boolean hasNext();
 *     2) object next();
 *     3) remove();
 * 3) ListIterator
 *     A)  To perform read,remove, update and add all operation 
 *     B)  It is biadirectional cursor
 *     C)  it is only for list implemented classes
 * method:
 *     1) boolean hasNext();
 *     2) object next();
 *     3) remove();
 *     4) add();
 *     5) set();
 *     
 *     
 *      
 */
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;


public class Cursor {
 public static void main(String [] args)
  {
    Vector v=new Vector<>();  // all type of data accept
   //  Vector<String> v=new Vector<>();  // Only string type of data accept

    v.add("Umesh");
    v.add("raja");
    v.add("Ram");
    v.add("done");


    ///////////////////////////////////  Enumeration cursor  /////////////////////////////////////////
    
    System.out.println("Print data using Enumeration cursor");
    Enumeration etr=v.elements();
    while (etr.hasMoreElements()) {
        System.out.println("====>"+etr.nextElement());
        
    }


    ///////////////////////////////////   Iterator   ////////////////////////////////////////////////////
    /// 
    
    System.out.println("Iterator");
     
     Iterator <String> it=v.iterator();

     while(it.hasNext())
     {
        
        System.out.println("data=>"+it.next());

     }
          while(it.hasNext())
     {
        String name=it.next();
        if(name.equals("Ram"))
        {
          it.remove();
        }
        
     }

   System.out.println(v);




   ///////////////////////////////////   ListIterator     /////////////////////////////////////////////
   ListIterator<String> lt=v.listIterator();

   System.out.println("print data of vector Using ListIterator in forward DIrection");
   while (lt.hasNext()) {
            String current = lt.next();
            
            if (current.equals("Ram")) {
                lt.set("Uma");
            }
            else if(current.equals("Umesh"))
            {
             
              lt.remove();
            }

            System.out.print(current + "\t");
        }

        System.out.println();

   System.out.println("print data of vector Using ListIterator in backward DIrection");
   while(lt.hasPrevious())
   {
    System.out.print(lt.previous()+"\t");
   }
   

  }
    
}
