import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
 int i=1;
 while(k-1>0)
 {
       i++;
     if(con(i))
     {
         k--;
     }
   
 }
 System.out.println(i);
   
 
   }
   static boolean con(int n)
   {
       ArrayList<Integer> lis1=new ArrayList<Integer>();
   lis1.add(0);
   lis1.add(1);
   lis1.add(2);
   lis1.add(5);
   lis1.add(6);
   lis1.add(8);
   lis1.add(9);
   boolean flag=true;
   while(n!=0)
   {
       if(!lis1.contains(n%10))
       {
           flag=false;
       }
       n=n/10;
   }
   return flag;
   }
}
