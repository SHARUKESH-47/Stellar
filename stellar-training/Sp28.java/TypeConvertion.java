import java.io.*;
import java.util.*;
import java.lang.*;
class TypeConvertion
{
        public static void main(String[] args)
		{
			String str=new String("45");
			int i=Integer.parseInt(str);
			float f=Float.parseFloat(str);
			double d=Double.parseDouble(str);
			
			System.out.println("Original String Value : "+str);
			System.out.println("Integer Value : "+i);
			System.out.println("Float value : "+f);
			System.out.println("Double Value : "+d);	
		}
}
