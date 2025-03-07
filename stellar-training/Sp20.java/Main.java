import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=s.nextInt();
	    }
	    int count=0;
	    for(int i=0;i<n;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            if(a[i]==a[j])
	            {
	                count++;
	                System.out.println("first repeating value is "+a[i]);
	            }
	            if(count!=0)
	                break;
	        }
	        
	    }
	}
}
