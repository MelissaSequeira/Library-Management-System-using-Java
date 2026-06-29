public class Book {
    int bkid;
    String bkName;
    String bkAuthor;
    boolean isAvail;

    Book(int bkid, String bkName, String bkAuthor, boolean isAvail){
        this.bkid=bkid;
        this.bkName=bkName;
        this.bkAuthor=bkAuthor;
        this.isAvail=isAvail;
    }
    void displaybooks(){
        System.out.println("Book Id: "+bkid);
        System.out.println("Book Name: "+bkName);
        System.out.println("Book Author: "+bkAuthor);
        System.out.println("Availability: "+isAvail);
    }
}
