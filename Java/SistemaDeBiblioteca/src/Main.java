import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        library.addBook(new Book(1,"AprendiendoJava"));
        library.addBook(new Book(2,"Chain Saw Man"));
        library.addBook(new Book(3,"Sakamoto days"));

        library.searchBooks(1);
    }
}
