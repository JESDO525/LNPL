import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void showBooks(){
        System.out.println("Mostrando Libros....");
        for (Book book : books){
            System.out.println(book);
        }
        System.out.println("------------------\n");

    }

    public void searchBooks(int id){
        System.out.println("Buscando Libro....");
        boolean check = false;
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).getId() == id){
                System.out.println("Este es el libro que buscabas: " + books.get(i));
                check = true;
                break;
            }
            }if(check == false){
            System.out.println("Libro no encontrado");
        }
        System.out.println("------------------\n");
    }

        public void deleteBooks(int id){
        System.out.println("Eliminando libro...");
        boolean check = false;
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).getId() == id){
                System.out.println("El siguiente libro se ha eliminado: " + books.get(i));
                books.remove(i);
                check = true;
                break;
            }
        }if(check == false){
            System.out.println("El libro no se ha borrado");
            }
            System.out.println("------------------\n");
        }
    }

