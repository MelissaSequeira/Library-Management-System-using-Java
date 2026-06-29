import java.util.ArrayList;

public class Student {

    int stId;
    String stName;
    ArrayList<Book> issuedBooks = new ArrayList<>();

    Student(int stId, String stName) {
        this.stId = stId;
        this.stName = stName;
    }

    void displaystudents() {

        System.out.println("Student ID : " + stId);
        System.out.println("Student Name : " + stName);

        if (issuedBooks.isEmpty()) {
            System.out.println("No books issued.");
        } else {
            System.out.println("Issued Books:");

            for (Book b : issuedBooks) {
                System.out.println(b.bkName);
            }
        }
    }
}