package Summer_2023.Q2.a;

public class Book {
    String title; String author;
    int numberOfAvailableCopies;
    public Book(String title, String author, int numberOfAvailableCopies) {
        this.title = title; this.author = author;
        this.numberOfAvailableCopies = numberOfAvailableCopies;
    }
    void buyBook(){
        // Complete the method
        if(numberOfAvailableCopies==0){
            throw new BookOutOfStockException("[BookOutOfStockException] The value of numberOfAvailableCopies is 0.");
        }
    }
}

//Here is my custom Exception
class BookOutOfStockException extends RuntimeException{
    BookOutOfStockException(String str){
        super(str);
    }
}
