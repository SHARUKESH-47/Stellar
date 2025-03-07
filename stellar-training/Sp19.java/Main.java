import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int a[]=new int[n];
	    int b[]=new int[n];
	    int d[]=new int[n];
	    int c=0;
	    for(int i=0;i<n;i++)
	    a[i]=s.nextInt();
	    Arrays.sort(a);
	    int j=1;
	    b[0]=a[0];
	    for(int i=0;i<n-1;i++)
	    if(a[i]!=a[i+1])
	    {
	    b[j++]=a[i+1];
	    c++;
	    }
	    j=0;
	    int k=0;
	    int m=0;
	    for(int i=0;i<n;i++)
	    {
	        if(a[i]==b[j])
	        {
	          k++;
	        }
	        else
	        {
	            d[m++]=k;
	            j++;
	            k=1;
	        }
	    }
	    d[m]=k;
	    for(int i=0;i<m+1;i++)
	    {
	        System.out.println(b[i]+" "+d[i]);
	    }
	}
}
