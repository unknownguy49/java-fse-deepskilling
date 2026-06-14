import java.util.*;

public class InventoryManager 
{
    HashMap<Integer,Product> inventory=new HashMap<>();

    public void addProduct(Product p)
    {
        inventory.put(p.productId,p);
    }

    public void updateProduct(int id,int quantity,double price)
    {
        if(inventory.containsKey(id))
        {
            Product p=inventory.get(id);
            p.quantity=quantity;
            p.price=price;
        }
    }

    public void deleteProduct(int id)
    {
        inventory.remove(id);
    }

    public void displayProducts()
    {
        for(Product p:inventory.values())
        {
            System.out.println(p);
        }
    }

    public static void main(String args[])
    {
        InventoryManager manager=new InventoryManager();

        manager.addProduct(new Product(1,"Laptop",10,50000));
        manager.addProduct(new Product(2,"Mouse",50,500));

        manager.displayProducts();

        manager.updateProduct(1,15,52000);
        manager.deleteProduct(2);

        System.out.println("\nAfter Update:");
        manager.displayProducts();
    }
}