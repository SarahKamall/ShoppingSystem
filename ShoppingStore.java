/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingstore;

import java.util.Scanner;


public class ShoppingStore {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MemberMethods m = new MemberMethods();
        
        Shopper shopper1 = new Shopper("Amira", 1, "Amira@gm.com", "124amira", 21, 'f', 1000, true);
        Shopper shopper2 = new Shopper("Samira", 2, "Samira@gm.com", "124samira", 22, 'f', 2000, true);
        Shopper shopper3 = new Shopper("sayed", 3, "sayed@gm.com", "124sayed", 22, 'm', 100, true);

        ShopOwner shopowner1 = new ShopOwner("Admin", 9 , "admin@gm.com", "124admin", 30, 'm', 3500, false);
        ShopOwner shopowner2 = new ShopOwner("Admin2", 10 , "admin2@gm.com", "124admin2", 25, 'm', 4000, false);

        Product p = new Product("T-shirt", "clothes", 150, 2);
        Product p2 = new Product("Pantalon", "clothes", 200, 5);
        
        ShopOwnerMethods.products.add(p);
        ShopOwnerMethods.products.add(p2);
        
        MemberMethods.shoppers.add(shopper1);
        MemberMethods.shoppers.add(shopper2);
        MemberMethods.shoppers.add(shopper3);
        
        MemberMethods.shopowners.add(shopowner1);
        MemberMethods.shopowners.add(shopowner2);

       while(true)
       {
       System.out.println("Welcome to our shopping store system");
       System.out.println("1- Register");
       System.out.println("2- Sign In");
       System.out.println("3- Exit");
       int choose = input.nextInt();
       if(choose == 1)
       {
       m.SignUp();
       }
       else if(choose == 2)
       {
       m.SignIn();
       }
       else if (choose == 3)
       {
       System.exit(0);
       }
       }
     
    }
    
}
