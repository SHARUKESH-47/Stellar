import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println(fact(n));
	Main m=new Main();
	m.sum(n);
	}
	public static int fact(int n)
	{
	    if(n==1)
	    return 1;
	    else
	    return n*fact(n-1);
	}
	public void sum(int n)
	{       
	    int a=0;
	    for(int i=0;i<=n;i++)
	    a=a+i;
	    System.out.print(a);
	}
}

