package Summer_2023.Q2.a;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List< Book > books;
    Library(){
        books = new ArrayList<>();
    }
    void addBook(Book book){
        for(int i=0; i<books.size(); i++){
            if(books.get(i).title.equals(book.title)){return;}
        }
        books.add(book);
    }
    void buyBook(String bookTitle){
        for(int i=0; i<books.size(); i++){
            Book b = books.get(i);
            if(b.title.equals(bookTitle)){
// Write your code here
                try{
                b.buyBook();
                books.set(i, new Book(b.title, b.author, b.numberOfAvailableCopies-1));
                }catch (BookOutOfStockException e){
                    System.out.println("The book you are willing to order is unavailable");
                }
                break;
            }
        }
    }
}
