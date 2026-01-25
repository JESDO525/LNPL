import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void showBooks(){
        for (Book book : books){
            System.out.println(book);
        }
    }

    public void searchBooks(int id){
        boolean check = false;
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).getId() == id){
                System.out.println("Este es el libro que buscabas: " + books.get(i) );
                check = true;
                break;
            }
            }if(check == false){
            System.out.println("Libro no encontrado");
        }
        }
    }

