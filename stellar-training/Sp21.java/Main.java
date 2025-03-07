import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int c=0;
	    int d=0;
	    int m=0;
	    int a[][]=new int[n][n];
	    for(int i=0;i<n;i++)
	    {
	    for(int j=0;j<n;j++)
	    {
	    a[i][j]=s.nextInt();
	    System.out.print(a[i][j]);
	    if(i==j)
	    c+=a[i][j];
	    if((i+j)==n-1)
	    d+=a[i][j];
	    }
	    System.out.println();
	    }
	    System.out.println(c+" "+d);
	    for(int i=0;i<n;i++)
	    for(int j=0;j<=i;j++)
	    m+=a[i][j];
	    System.out.println(m);
	}
}
