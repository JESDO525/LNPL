import java.util.Scanner;

public class Book {
    //Variables
    private int id;
    private String title;
    private boolean available;

    //Contructor
    public Book(int id, String title){
        this.id = id;
        this.title = title;
        this.available = true;
    }

    //Getters and setters
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public boolean isAvailable(){
        return available;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }

    @Override
    public String toString(){
        return "Book {" + "\nid:" + id + "\nTitle:" + title + "\nSotck?:" + available +"\n}\n";
    }
}
