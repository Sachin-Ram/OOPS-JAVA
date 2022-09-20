package book;

public class Books {
    public String title;

    public String author;

    public int year;   

    public String publisher;

    public int id;

    public Books(String title,String author,int year,String publisher,int id)

    {   this.title=title;

        this.author=author;

        this.year=year;

        this.publisher=publisher;

        this.id=id;

    }

    public void getTitle()

    {

        System.out.println("Title of Book: "+title);

    }

    public void getAuthor()

    {

        System.out.println("Author of Book: "+author);

    }

    public void getYear()

    {

        System.out.println("Year: "+year);

    }

    public void getPublisher()

    {

        System.out.println("Publisher of Book: "+publisher);

    } 

    public void getid()

    {

        System.out.println("id of Book: "+id);

    }
/* 
    public void setTitle(String title)

    {

        this.title=title;

    }

    public void setAuthor(String author)

    {

       this.author=author;

    }

    public void setYear(int year)

    {

        this.year=year;

    }

    public void setPublisher(String publisher)

    {

        this.publisher=publisher;

    } 

    public void setCost(int id)

    {

        this.id=id;

    }    
*/
    public void show()

    {

        getTitle();

        getAuthor();

        getYear();

        getPublisher();

        getid();

    }    

}

