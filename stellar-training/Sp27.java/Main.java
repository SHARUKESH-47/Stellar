import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int c=0;
	    int a[][]=new int[n][n];
	    for(int i=0;i<n;i++)
	    for(int j=0;j<n;j++){
	    a[i][j]=s.nextInt();
	    if(a[i][j]!=20)
	    c+=a[i][j];
	    }
	    System.out.println(c);
	}
}
