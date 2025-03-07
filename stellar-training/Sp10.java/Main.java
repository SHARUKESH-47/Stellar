import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if (a>=90)
        System.out.println("O");
        else if(a>=80)
        System.out.println("A+");
        else if(a>=70)
        System.out.println("A");
        else if(a>=60)
        System.out.println("B+");
        else if(a>=50)
        System.out.println("B");
        else if(a>40)
        System.out.println("c");
        else
        System.out.println("U");
    }
}