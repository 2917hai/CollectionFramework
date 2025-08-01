public class Subarray
{
    public static void main(String [] ags)
    {
        int arr[]=new int[]{-2,-4};
        int s=arr.length;
        int no=0;
        for(int i=0; i<s; i++)
        {
            int no1=arr[i];
            for(int j=i+1; j<s; j++)
            {
              no1=no1+arr[j];
              if(no1<0)
              {
                no=no1;
              }
            }
            if(no1>no)
            {
                no=no1;
            }
        }
        System.out.println(no);
    }
}