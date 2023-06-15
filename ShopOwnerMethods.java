
package shoppingstore;

import java.util.ArrayList;
import java.util.Scanner;


public class ShopOwnerMethods {
//MemberMethods m = new MemberMethods();
    public static ArrayList <Product> products = new ArrayList<Product>();
    public static ArrayList <ShopData> shopdata = new ArrayList<ShopData>();
    Scanner x = new Scanner(System.in);
    
    public void AddProd()
    {
    System.out.print("Please enter the name of the product: ");
    String n = x.next();
    System.out.print("Please enter the category of this product : ");
    String cat = x.next();
    System.out.print("Please enter the price of this product : ");
    double pro = x.nextDouble();
    System.out.print("Please enter the quantity of this product : ");
    int quan = x.nextInt();
    products.add(new Product(n,cat,pro,quan));
    
    }
    public void RemoveProd()
    {
    System.out.print("Please enter the name of the product you want to remove: ");
    String n = x.nextLine();
    for(int i=0; i < products.size(); i++)
    {
        if(products.get(i).name.equals(n))
            products.remove(i);
    }
    System.out.println("This product is removed successfully");
    
    }
   
        public void AddShopData()
    {
    System.out.print("Please enter the name of the shop: ");
    String n = x.nextLine();
    System.out.print("Please enter the address of this shop: ");
    String addr = x.nextLine();
    System.out.print("Please enter the category of this product : ");
    String cat = x.nextLine();
    shopdata.add( new ShopData(n, addr, cat));
   
    }
   
}
