import java.util.*;
class publication
{
    String title;
    int copies,price;
    void saleCopy()
    {
        System.out.println("Enter price of publication");
        Scanner sc=new Scanner(System.in);
        price=in.nextInt();
        System.out.println("Total sale of pubication is:"+copies*price);
    }
    void ordercopies()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter publication copies");
        copies=in.nextInt();
    }
    
    class Book extends Publication
    {
        private String author;
        void salecopy()
        {
            System.out.println("Enter price of book");
            Scanner sc=new Scanner(System.in);
            price=in.nextInt();
            System.out.println("Total sale of Books"+copies*price);
        }
    }    
    class Magazine extends Publication
    {
        void currentIssue()
        {

        }
        void receiveIssue()
        {

        }
        void salecopy()
        {
            System.out.println("Enter the price of Magazine");
            Scanner sc=new Scanner(System.in);
            price=in.nextInt();
            System.out.println("Total sell of Magazine :"+price*copies);
        }
    }
}
    public class Test2
    {
        public static void main(String[]args)
    {
        Publication publication=new Publication();
        publication.orderCopies();
        publication.saleCopy();

        Publication book=new Book();
        book.orderCopies();
        book.saleCopy();

        Publication magazine=new Magazine();
        magazine.orderCopies();
        magazine.saleCopy();        
    }
}