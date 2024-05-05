import java.util.*;
class Publication
{
    private String title;
    public int qty;
    private double price;
    private int copies;
    public String gettitle()
    {
        return this.title;   
    }
    public void settitle(String title)
    {
        this.title=title;
    }
    public double getprice()
    {
       return this.price; 
    }
    public void setprice(double price)
    {
        this.price=price;
    }
    public int getqty()
    {
        return this.qty;
    }
    public void setprice(int qty)
    {
        this.qty=qty;
    }
    public int getcopies()
    {
        return this.copies;
    }
    public void setcopies(int price)
    {
        this.copies=copies;
    }
    public void sellcopy()
    {
        System.out.print("Total publication sell"+(qty*price));
    }
class Book extends Publication
{
        private String author;
        public void ordercopies(int pcopies)
        {
            System.out.println("Total sell copies"+(qty*getprice()));
        }
class Magazine extends Publication
{
        private int orderQty;
        private String currIssue;
        public void Recv(String pNewIssue)
        {
            setcopies(orderQty);
            currIssue=pNewIssue;
        }
        public void sellcopy(int qty)
        {
            System.out.println("Total Magazine sell"+(qty*getprice()));
        }
        class Test
        {
            public static void main(String []args)
            {
                Book book1=new Book();
                book1.ordercopies(3);
                Publication book2=new Book();
                book2.setprice( 30);
                book2.sellcopy(3);
                Publication publication=new Publication();
                publication.setcopies(4);
                publication.getcopies();
                publication.setprice(333);
                publication.getprice();
                publication.sellcopy(4);
                Magazine magazine=new Magazine();
                magazine.setprice(55);
                magazine.sellcopy(3);
            }
        }
        
        
        
        
        
        
        
        
        
        
}
}
}    

}
