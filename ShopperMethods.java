package shoppingstore;

import java.util.Scanner;
import java.util.ArrayList;
import static shoppingstore.ShopOwnerMethods.products;
import static shoppingstore.MemberMethods.shoppers;

public class ShopperMethods {
    double totalprice = 0;
    Scanner x = new Scanner(System.in);
    public static ArrayList<Cart> shoppingCart = new ArrayList<>();

    public void Search() {
        System.out.println("Enter the name of the product you want to search on it ");
        String n = x.nextLine();
        Boolean check = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).name.equals(n)) {
                System.out.println("The name of the product is " + products.get(i).name);
                System.out.println("The category of the product is " + products.get(i).category);
                System.out.println("The price of the product is " + products.get(i).price);
                System.out.println("The quantity of the product is " + products.get(i).quantity);
                check = true;
                break;
            } 
        }
        if(!check){
            System.out.println("The Product is not found.....!");}
    }

    public void AddItemstoCart() {
        System.out.println("Enter the name of the item you want to add in the shopping cart ");
        String n = x.next();
        Boolean check = false;
        for (int i = 0; i < products.size(); i++) {
            if ((products.get(i).name.equals(n))) {
               System.out.println("You've added this item in the shopping cart successfully");
                shoppingCart.add(new Cart(products.get(i).name, products.get(i).price));
              check=true;
                break;
            } 
        }
        if(!check){
            System.out.println("The Product is not found.....!");}
    }

    public void viewReceipt() {
  for (int i = 0; i < shoppingCart.size(); i++) {
            System.out.print("The name of the product: " + shoppingCart.get(i).name);
            System.out.println(", The price of the product: " + shoppingCart.get(i).price);
            totalprice = totalprice + shoppingCart.get(i).price;
        }     
        System.out.println("The total price of the products you've bought is " +totalprice);
    }

}
