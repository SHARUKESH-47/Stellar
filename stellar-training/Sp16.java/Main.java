import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int m=s.nextInt();
	    for(int i=n;i<=m;i++)
	    {
	    if(i>=10 && i<=99)
	    {
	        if(i==(((i%10)+((i%100)/10))+((i%10)*((i%100)/10))))
	        System.out.println(i);
	    }
	    }
	}
}
