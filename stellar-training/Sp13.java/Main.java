import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year (YYYY): ");
        int year = scanner.nextInt();
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int K = year % 100; 
        int J = year / 100;  
        int dayOfWeek = (day + (13 * (month + 1)) / 5 + K + (K / 4) + (J / 4) + (5 * J)) % 7;
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        System.out.println("The day of the week is: " + days[dayOfWeek]);
        scanner.close();
    }
}
