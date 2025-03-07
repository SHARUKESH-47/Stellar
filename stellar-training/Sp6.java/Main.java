import java.util.*;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int count=0;
	    int temp=a;
	    int c=a/100;
	    count+=c;
	    a=a%100;
	    if(a>=50)
	    {
	        temp=a/50;
	        count+=temp;
	        a=a%50;
	        
	    }
	    if(a>=10){
	        temp=a/10;
	        count+=temp;
	        a=a%10;
	    }
	    if(a>=10){
	        temp=a/10;
	        count+=temp;
	        a=a%10;
	    }
	    if(a>=5){
	        temp=a/5;
	        count+=temp;
	        a=a%5;
	    }
	    if(a>=2){
	        temp=a/2;
	        count+=temp;
	        a=a%2;
	        count+=a;
	    }
	    System.out.println(count);
	}
}
