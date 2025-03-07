import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String a=s.next();
	    int l=a.length();
	    int c=0;
	    if(l%2==0)
	    {
	      for(int i=0;i<l-2;i++){
	      for(int j=i+2;j<l;j++){
	          if(a.charAt(i)==a.charAt(j)){
	              c=1;
	          }
	          else{
	              c=0;
	          }
	      }
	      }
	    }
	    if(c==1)
	    System.out.println("Yes");
	    else
	    System.out.println("No");
	}
}