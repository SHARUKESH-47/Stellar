import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int a[][]=new int[n][n];
	    int r[]=new int[n];
	    int c[]=new int[n];
	    int m=0;
	    int f=0;
	    for(int i=0;i<n;i++)
	    {
	    for(int j=0;j<n;j++)
	    {
	    a[i][j]=s.nextInt();
	    System.out.print(a[i][j]);
	    }
	    System.out.println();
	    }
	    for(int i=0;i<n;i++)
	    {
	    int rs=0;
	    int cs=0;
	    for(int j=0;j<n;j++)
	    {
	    rs+=a[i][j];
	    cs+=a[j][i];
	    }
	    r[m++]=rs;
	    c[f++]=cs;
	    }
	    for(int i=0;i<m;i++)
	    System.out.println("sum of row"+(i+1)+" "+r[i]);
	    for(int i=0;i<f;i++)
	    System.out.println("sum of column"+(i+1)+" "+c[i]);
	}
}
