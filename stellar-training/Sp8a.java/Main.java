import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
		int[] a= {100,50,10,5,2,1};
        for(int i=0;i<6;i++)
        {
            if(n>=a[i])
            {
                c+=n/a[i];
                n=n%a[i];
            }
        }
        System.out.println(c);
	}	
}
