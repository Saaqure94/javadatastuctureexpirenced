package lists.classes;

public class testBook {
    public static void main(String[] args) {

        Book book=new Book();
        book.setIsbnid(5);
        book.setAuthorName("sss");
        book.setBookName("asjkdjashd");
        System.out.println(book);
//        System.out.println("The name of the book is " + book.getBookName() + " Its Author is " + book.getAuthorName() + " and its id is: " + book.getIsbnid() );
    }
}
