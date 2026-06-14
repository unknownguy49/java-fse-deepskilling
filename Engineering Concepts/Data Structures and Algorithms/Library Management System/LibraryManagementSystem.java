import java.util.*;
public class LibraryManagementSystem 
{
    public static int linearSearch(Book books[],String target)
    {
        for(int i=0;i<books.length;i++)
        {
            if(books[i].title.equalsIgnoreCase(target))
            {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Book books[],String target)
    {
        int left=0;
        int right=books.length-1;

        while(left<=right)
        {
            int mid=(left+right)/2;
            int result=books[mid].title.compareToIgnoreCase(target);
            if(result==0)
                return mid;
            else if(result<0)
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
    }

    public static void main(String args[])
    {
        Book books[]={
                new Book(101,"Java","James Gosling"),
                new Book(102,"Python","Guido van Rossum"),
                new Book(103,"Database","Elmasri"),
                new Book(104,"Algorithms","Cormen")
        };

        int linearResult=linearSearch(books,"Database");
        System.out.println("Linear Search Index: "+linearResult);

        Arrays.sort(books,Comparator.comparing(book->book.title));
        int binaryResult=binarySearch(books,"Database");
        System.out.println("Binary Search Index: "+binaryResult);
    }
}