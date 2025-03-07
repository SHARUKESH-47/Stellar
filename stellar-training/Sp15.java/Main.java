import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    if(n>=100 && n<=999)
	    {
	        if(((n%100)/10)%3==0)
	        System.out.print("Trendy Number");
	        else
	        System.out.print("Not Trendy Number");
	    }
	    else
	        System.out.print("Not Trendy Number");
	}
}
