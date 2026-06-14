import java.util.*;

public class SearchDemo 
{
    public static int linearSearch(Product products[],String target)
    {
        for(int i=0;i<products.length;i++)
        {
            if(products[i].productName.equalsIgnoreCase(target))
                return i;
        }
        return -1;
    }

    public static int binarySearch(Product products[],String target)
    {
        int left=0;
        int right=products.length-1;

        while(left<=right)
        {
            int mid=(left+right)/2;
            int cmp=products[mid].productName.compareToIgnoreCase(target);
            if(cmp==0)
                return mid;
            else if(cmp<0)
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
    }

    public static void main(String args[])
    {
        Product products[]={
            new Product(1,"Laptop","Electronics"),
            new Product(2,"Mouse","Electronics"),
            new Product(3,"Keyboard","Electronics"),
            new Product(4,"Monitor","Electronics")
        };
        int linearResult=linearSearch(products,"Keyboard");
        System.out.println("Linear Search Index: "+linearResult);
        
        Arrays.sort(products,Comparator.comparing(p->p.productName));
        int binaryResult=binarySearch(products,"Keyboard");
        System.out.println("Binary Search Index: "+binaryResult);
    }
}