import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    Scanner sc= new Scanner(System.in);
    ArrayList<Book> books= new ArrayList<>();
    ArrayList<Student> stds= new ArrayList<>();
    void addbooks(){
        System.out.println("Enter book id: ");
        int bkid=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter book name: ");
        String bkName=sc.nextLine();
        System.out.println("Enter book Author: ");
        String bkAuthor=sc.nextLine();
        Book book=new Book(bkid,bkName,bkAuthor,true);
        books.add(book);
    }
    void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            b.displaybooks();
            System.out.println("-------------------");
        }
    }
    void removebooks(){
        System.out.println("Enter book id to be deleted: ");
        int id= sc.nextInt();
        boolean found=false;
        for(Book b:books){
            if(b.bkid==id){
                books.remove(b);
                found=true;
                System.out.println("Book removed!!");
                break;
            }

        }
        if(!found){
                System.out.println("book not found!!!");

        }
    }
    void searchbooks(){
        System.out.println("enter the id of the book");
        boolean found=false;
        int id=sc.nextInt();
        for(Book b:books){
            if(b.bkid==id){
                System.out.println("book name: "+b.bkName);
                System.out.println("book author: "+b.bkAuthor);
                System.out.println("book available? : "+b.isAvail);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Book not found!!");
        }
    }
    void addstudent(){
        System.out.println("Enter Student id:");
        int stId=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student name:");
        String stName=sc.nextLine();
        Student st=new Student(stId,stName);
        stds.add(st);
    }
    void showstudent(){
        if (stds.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student s : stds) {
            s.displaystudents();
            System.out.println("-------------------");
        }
    }
    void libissuebook(){
        System.out.println("Enter the book id you want to issue: ");
        int id= sc.nextInt();
        Book bookFound=null;
        Student stuFound=null;
        System.out.println("Enter the student rollno: ");
        int studid=sc.nextInt();
        for(Book b:books){
            if(b.bkid==id) {
                bookFound=b;
                break;
            }
            }
        if(bookFound==null){
            System.out.println("Book not found!");
        }
        if(!bookFound.isAvail){
            System.out.println("Book is already issued!!");
            return;
        }
        for(Student s:stds){
            if(s.stId==studid){
                stuFound=s;
                break;
            }
        }
        if(stuFound==null){
            System.out.println("Student not found!");
            return;
        }

        bookFound.isAvail = false;
        stuFound.issuedBooks.add(bookFound);

        System.out.println("Book issued successfully!");
    }
    void libreturnbook() {

        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();

        System.out.print("Enter Book ID: ");
        int bookId = sc.nextInt();

        Student foundStudent = null;

        // Find the student
        for (Student s : stds) {

            if (s.stId == studentId) {
                foundStudent = s;
                break;
            }
        }

        if (foundStudent == null) {
            System.out.println("Student not found!");
            return;
        }

        Book returnBook = null;

        // Find the book in student's issued list
        for (Book b : foundStudent.issuedBooks) {

            if (b.bkid == bookId) {
                returnBook = b;
                break;
            }
        }

        if (returnBook == null) {
            System.out.println("This student has not issued this book!");
            return;
        }

        // Return the book
        returnBook.isAvail = true;
        foundStudent.issuedBooks.remove(returnBook);

        System.out.println("Book returned successfully!");
    }
}
