import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int b=0,c=0,d=0,e=0,f=0,g=0;
	    if (a>=100){
	    b=a/100;
	    a=a%100;
	    }
	    if(a<100 && a>=50){
	    c=a/50;
	    a=a%50;
	    }
	    if(a<50 && a>=10){
	    d=a/10;
	    a=a%10;
	    }
	    if(a<10 && a>=5){
	    e=a/5;
	    a=a%5;
	    }
	    if(a<5 && a>=2){
	    f=a/2;
	    a=a%2;
	    }
	    if(a<2){
	    g=a/1;
	    a=a%1;
	    }
	    System.out.println(b+c+d+e+f+g);
	}
}
