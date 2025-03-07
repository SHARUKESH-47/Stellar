import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a=s.nextFloat();
        System.out.printf("%.3f\n",a);	
	    System.out.printf("%.2f\n",a);
	    System.out.printf("%.1f\n",a);
        System.out.printf("%.0f\n",a);
        System.out.println(String.format("%.2f",a));
	}
}
