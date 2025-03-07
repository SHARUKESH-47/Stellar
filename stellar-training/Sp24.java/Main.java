import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    StringBuffer sb=new StringBuffer(s.next());
	    if(sb.toString().equals(sb.reverse().toString()))
	    {
	    System.out.println("Palindrome");
	    }
	    else
	    System.out.println("Not Plaindrome");
	}
}
