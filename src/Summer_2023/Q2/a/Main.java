package Summer_2023.Q2.a;

public class Main {
    public static void main(String[] args) {
        Book book1=new Book("Title1","Author1",2);
        Book book2=new Book("Title2","Author2",3);
        Book book3=new Book("Title3","Author3",5);
        Book book4=new Book("Title4","Author4",2);
        Book book5=new Book("Title5","Author5",1);

        Library library=new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.buyBook("Title3");
        //System.out.println(book3.numberOfAvailableCopies);
        System.out.println(library.books.get(2).numberOfAvailableCopies);
        library.buyBook("Title3");
        //System.out.println(book3.numberOfAvailableCopies);
        System.out.println(library.books.get(2).numberOfAvailableCopies);

    }
}
