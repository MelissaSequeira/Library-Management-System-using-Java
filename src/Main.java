import java.io.IOException;
import java.util.Scanner;

public class Main {

public static void main(String args[]) throws IOException {
    Scanner sc=new Scanner(System.in);
    Library lib=new Library();
    lib.loadbooks();
    lib.loadstudent();
    while(true){
    System.out.println("Library Management System");
    System.out.println("=============================");
    System.out.println("1.Add Books");
    System.out.println("2.display Books");
    System.out.println("3.remove Books");
        System.out.println("4.search Books");
        System.out.println("5.Add Students");
        System.out.println("6.Show students");
        System.out.println("7.Issue book to students");
    System.out.println("8.Return book to library");
        System.out.println("9.Exit");
    System.out.println("=============================");
    System.out.println("Enter choice");
    int choice=sc.nextInt();

        switch (choice){
            case 1:
                lib.addbooks();
                break;
            case 2:
                lib.viewBooks();

                break;
            case 3:
                lib.removebooks();
                break;
            case 4:
                lib.searchbooks();
                break;
            case 5:
                lib.addstudent();
                break;
            case 6:
                lib.showstudent();
                break;
            case 7:
                lib.libissuebook();
                break;
            case 8:
                lib.libreturnbook();
                break;
            case 9:
                System.out.println("Thank you Visit again");
                lib.savebooks();
                lib.savestudents();
                System.exit(0);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
}
