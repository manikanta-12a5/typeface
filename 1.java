import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
	
	    Scanner  sc=new Scanner (System.in);
	    int n=sc.nextInt();
	    String str="";
	    while(n!=0)
	    {
	        int i=n%3;
	        n=n/3;
	        str=i+str;
	        
	    }
	    if(str.length()>=1)
	    System.out.println(str);
	    else
	    System.out.println("0");
	}
}
