import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    double a=s.nextDouble();
	    double b=s.nextDouble();
	    double c=b-a;
	    System.out.printf("%.2f\n",c);
	    System.out.print(Math.round(c*25));
	}
}
