import java.util.*;
import java.util.ArrayList;

class Students {
    public ArrayList<String> add() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();

        System.out.println("Enter Student ID:");
        int sid = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter Enrollment No:");
        String enroll = sc.nextLine();

        System.out.println("Enter Percentage:");
        float per = sc.nextFloat();

      
        al.add(String.valueOf(sid));
        al.add(name);
        al.add(enroll);
        al.add(String.valueOf(per));

        return al;
    }
}

public class MiniProjectCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students st = new Students();

        ArrayList<ArrayList<String>> al = new ArrayList<>();
        int choice;
        do {
            ArrayList<String> al1 = st.add();
            al.add(al1);
            System.out.println("Enter your choice: 1 to Continue | 0 to Stop");
            choice = sc.nextInt();
            sc.nextLine(); 

        } while (choice != 0);

      
       System.out.println(
        "Enter 1 for add data"+"\n"
        +"Enter 2 for update data"+"\n"
        +"Enter 3 for delete data"+"\n"
        +"Enter 4 for show all data"
    
       );
       int c=sc.nextInt();
       switch (c) {
             case 1:
            {
                int a;
                do {
                    ArrayList<String> ab=st.add();
                    al.add(ab);
                     System.out.println("Enter your choice: 1 to Continue | 0 to Stop");
                    a = sc.nextInt();
                    sc.nextLine();
                    
                } while (a!=0);
                
                break;
            }

             case 2:
            {
                System.out.println("update data");
                 System.out.println(al);
                System.out.println("Enter id");
                int id=sc.nextInt();
                for(ArrayList<String> um:al)
                {
                    int p=Integer.parseInt(um.get(0));
                    if(p==id)
                    {
                        System.out.println("what do you want to upadate");
                         System.out.println(
                             "Enter 1 for Name"+"\n"
                               +"Enter 2 for enrollment"+"\n"
                              +"Enter 3 for percentage"
                              
                             );
                             System.out.println("enter your choice");
                             int n=sc.nextInt();
                             switch (n) {
                                case 1:
                                    {
                                        sc.nextLine();
                                        System.out.println("enter new name");
                                        String name=sc.nextLine();
                                        um.set(1, name);
                                        break;
                                    }
                                     case 2:
                                    {
                                        System.out.println("enter new enroll");
                                        String enroll=sc.nextLine();
                                        um.set(2, enroll);
                                        break;
                                    }
                                     case 3:
                                    {
                                        System.out.println("enter new percantage");
                                        String per=sc.nextLine();
                                        um.set(3, per);
                                        break;
                                    }
                             
                                default:
                                    break;
                             }
                               

                    }
                }
                System.out.println("data update successfully");
                System.out.println(al);
                break;
            }

             case 3:
            {
                 System.out.println("delete data");
                 System.out.println(al);
                System.out.println("Enter id");
                int id=sc.nextInt();
                for(ArrayList<String> um:al)
                {
                  int p=Integer.parseInt(um.get(0));
                    if(p==id)
                    {
                       al.remove(um);
                       break;

                    }
                }
                System.out.println("data deleted successfully");
                System.out.println(al);
                break;
            }


             case 4:
            {
                  System.out.println("\nAll Student Details:");
              for (ArrayList<String> student : al) {
            System.out.println("ID: " + student.get(0));
            System.out.println("Name: " + student.get(1));
            System.out.println("Enroll No: " + student.get(2));
            System.out.println("Percentage: " + student.get(3));
            System.out.println("-----------------------------");
        }
                break;
            }
       
        default:
            break;
       }
    }
}
