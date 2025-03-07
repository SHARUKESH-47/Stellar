import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int c=s.nextInt();
	    if((a+b+c)==180)
	    {
	       if(a==90 || b==90 || c==90)
	       System.out.println("2nd Prize");
	       else if(a==b && b==c)
	       System.out.println("3rd Prize");
	       else
	       System.out.println("1st Prize");
	    }
	    else
	    System.out.println("No Prize");
	}
}
