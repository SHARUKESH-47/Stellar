import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String b=a.toLowerCase();
		char m;
		int c=0;
		for(int i=0;i<b.length();i++)
		{
		    m=b.charAt(i);
		    if(m=='a'||m=='e'||m=='i'||m=='o'||m=='u')
		    c++;
		}
		System.out.println(c);
	}
}
