import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id, pass;
    String name, email;

    Student(int id, String name, String email, int pass) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
    }
}

class Book {
    String name, author;
    boolean isAvailable;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.isAvailable = true;
    }
}

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
    static int studentIdCounter = 1001;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Admin\n2. Students\n3. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    adminLogin();
                    break;
                case 2:
                    studentMenu();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }

    static void adminLogin() {
        System.out.print("Enter User ID: ");
        String userId = sc.next();
        System.out.print("Enter Password: ");
        int password = sc.nextInt();

        if (userId.equals("t4teq") && password == 123) {
            int choice;
            do {
                System.out.println("1. Add Book\n2. View Issued Books\n3. Logout");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        addBook();
                        break;
                    case 2:
                        viewIssuedBooks();
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Invalid choice");
                }
            } while (choice != 3);
        } else {
            System.out.println("Wrong ID/Password");
        }
    }

    static void studentMenu() {
        int choice;
        do {
            System.out.println("1. Signup\n2. Login\n3. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    signup();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }

    static void signup() {
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter your email: ");
        String email = sc.next();
        System.out.print("Enter your password: ");
        int password = sc.nextInt();

        students.add(new Student(studentIdCounter, name, email, password));
        System.out.println("Account created successfully! Your user ID: " + studentIdCounter);
        studentIdCounter++;
    }

    static void login() {
        System.out.print("Enter user ID: ");
        int uid = sc.nextInt();
        System.out.print("Enter your password: ");
        int pass = sc.nextInt();

        for (Student student : students) {
            if (student.id == uid && student.pass == pass) {
                studentActions();
                return;
            }
        }
        System.out.println("Wrong ID/Password");
    }

    static void studentActions() {
        int choice;
        do {
            System.out.println("1. View Books\n2. Borrow Book\n3. Return Book\n4. Logout");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    viewBooks();
                    break;
                case 2:
                    borrowBook();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }

    static void addBook() {
        System.out.print("Enter book name: ");
        String name = sc.next();
        System.out.print("Enter author name: ");
        String author = sc.next();
        books.add(new Book(name, author));
        System.out.println("Book added successfully");
    }

    static void viewBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable) {
                System.out.println("Book: " + book.name + ", Author: " + book.author);
            }
        }
    }

    static void borrowBook() {
        System.out.print("Enter book name: ");
        String name = sc.next();
        System.out.print("Enter author name: ");
        String author = sc.next();

        for (Book book : books) {
            if (book.isAvailable && book.name.equals(name) && book.author.equals(author)) {
                book.isAvailable = false;
                System.out.println("Book issued successfully");
                return;
            }
        }
        System.out.println("Book not available");
    }

    static void returnBook() {
        System.out.print("Enter book name: ");
        String name = sc.next();
        System.out.print("Enter author name: ");
        String author = sc.next();

        for (Book book : books) {
            if (!book.isAvailable && book.name.equals(name) && book.author.equals(author)) {
                book.isAvailable = true;
                System.out.println("Book returned successfully");
                return;
            }
        }
        System.out.println("Invalid book details");
    }

    static void viewIssuedBooks() {
        System.out.println("Issued Books:");
        for (Book book : books) {
            if (!book.isAvailable) {
                System.out.println("Book: " + book.name + ", Author: " + book.author);
            }
        }
    }
}
