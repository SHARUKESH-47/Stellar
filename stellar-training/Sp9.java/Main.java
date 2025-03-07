import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    if(n%10 ==3 || n%10 ==8)
	    System.out.print("Lucky Winner");
	    else
	    System.out.println("Not Lucky Winner");
	}
}
