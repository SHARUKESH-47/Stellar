import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int c=1;
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    a[i]=s.nextInt();
	    c*=a[i];
	    }
	    System.out.println(c);
	}
}
