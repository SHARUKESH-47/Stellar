import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int a=0;
	    int b=0;
	    int c=1;
	    int d=0;
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(a+" ");
	        d=a+b+c;
	        a=b;
	        b=c;
	        c=d;
	    }
	}
}
