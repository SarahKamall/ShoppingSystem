/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingstore;

import java.util.ArrayList;
import java.util.Scanner;
import static shoppingstore.ShopOwnerMethods.products;

public class MemberMethods {

    ShopperMethods s = new ShopperMethods();
    ShopOwnerMethods o = new ShopOwnerMethods();
    int choose;
    public static ArrayList<Shopper> shoppers = new ArrayList<Shopper>();
    public static ArrayList<ShopOwner> shopowners = new ArrayList<ShopOwner>();
    public boolean IsShopper;

    public MemberMethods() {
    }

    Scanner x = new Scanner(System.in);

    public void OptionMenuO() {
        System.out.println("Welcome, you are now in the Shop Owner Menu");
        System.out.println("1- Edit your data");
        System.out.println("2- Add new product");
        System.out.println("3- Remove existing product");
        System.out.println("4- View all the products");
        System.out.println("5- Add Shop Data");
        System.out.println("6- Logout");
        choose = x.nextInt();
        switch (choose) {
            case 1:
                Edit();
                OptionMenuO(); 
                break;
            case 2:
                o.AddProd();
                OptionMenuO(); 
                break;
            case 3:
                o.RemoveProd();
                OptionMenuO(); 
                break;
            case 4:
                View();
                OptionMenuO(); 
                break;
            case 5:
                o.AddShopData();
                OptionMenuO(); 
                break;
            case 6:
                return;
            default:
                System.out.println("You have entered an invalid number, please try again :( ");
                OptionMenuO(); 
                break;
        }

    }

    public void OptionMenuS() {
        System.out.println("Welcome, you are now in the Shopper Menu");
        System.out.println("1- Edit your data");
        System.out.println("2- Add items to the shopping cart");
        System.out.println("3- View all the products");
        System.out.println("4- View the receipt");
        System.out.println("5- Search by the name of the product");
        System.out.println("6- Logout");
        choose = x.nextInt();
        switch (choose) {
            case 1:
                Edit();
                OptionMenuS();
                break;
            case 2:
                s.AddItemstoCart();
                OptionMenuS();
                break;
            case 3:
                View();
                OptionMenuS();
                break;
            case 4:
                s.viewReceipt();
                OptionMenuS();
                break;
            case 5:
                s.Search();
                OptionMenuS();
                break;
            case 6:
               return;
            default:
                System.out.println("You have entered an invalid number, please try again :( ");
                OptionMenuS();
                break;
        }
    }

    public void SignUp() {
        System.out.println("Welcome to our Online Shopping Store System, if you are Shop Owner and want to register press 1, else if you are Shopper press 2");
        choose = x.nextInt();
        if (choose == 1) {
            System.out.print("Please enter your name: ");
            String n = x.next();
            System.out.print("Please enter your e-mail address: ");
            String mail = x.next();
            System.out.print("Please enter your passwrod: ");
            String pass = x.next();
            System.out.print("Please enter your age: ");
            int age1 = x.nextInt();
            System.out.print("Please enter your gender: ");
            char gen = x.next().charAt(0);
            System.out.print("Please enter your ID: ");
            int id = x.nextInt();
            System.out.print("Please enter your salary: ");
            double sal = x.nextDouble();
            System.out.println("Pleased to have you as new member in our Online Shopping Store System :) ");
            shopowners.add(new ShopOwner(n, id, mail, pass, age1, gen, sal, false));
            OptionMenuO();
        } else if (choose == 2) {
            System.out.print("Please enter your name: ");
            String na = x.next();
            System.out.print("Please enter your e-mail address: ");
            String email2 = x.next();
            System.out.print("Please enter your passwrod: ");
            String pass2 = x.next();
            System.out.print("Please enter your age: ");
            int age2 = x.nextInt();
            System.out.print("Please enter your gender: ");
            char gend = x.next().charAt(0);
            System.out.print("Please enter your ID: ");
            int Id = x.nextInt();
            System.out.print("Please enter your money: ");
            double mon = x.nextDouble();
            System.out.println("Pleased to have you as new member in our Online Shopping Store System :) ");
            shoppers.add(new Shopper(na, Id, email2, pass2, age2, gend, mon, true));
            OptionMenuS();
        } else {
            System.out.print("You have entered an invalid number, please try again :( ");
        }
    }

    public void SignIn()
   {
        System.out.println("If your are signing in as shop owner press 1, but if you are shopper please press 2 ");
        choose = x.nextInt();
        if(choose == 1) {
        System.out.print("Enter your e-mail address: ");
        String m = x.next();
        System.out.print("Enter your password : ");
        String p = x.next();
        for (int i = 0; i < shopowners.size(); i++) {
            shopowners.get(i).IsShopper = false;
                if (shopowners.get(i).email.equals(m) && shopowners.get(i).password.equals(p)) {
                        OptionMenuO();
                    }  
                }
          for (int i = 0; i < shopowners.size(); i++) {
             if (!shopowners.get(i).email.equals(m) || !shopowners.get(i).password.equals(p))
                {
                    System.out.println("You have entered an invalid e-mail address or password, please try again :( ");
                    SignIn();
                }
            }
          
         
        }
        else if(choose == 2 ){
        System.out.print("Enter your e-mail address: ");
        String m = x.next();
        System.out.print("Enter your password : ");
        String p = x.next();
            for (int i = 0; i < shoppers.size(); i++) {
                shoppers.get(i).IsShopper = true;
                if (shoppers.get(i).email.equals(m) && shoppers.get(i).password.equals(p)) {
                        OptionMenuS();
                    }
                }
            for (int i = 0; i < shoppers.size(); i++) {
             if (!shoppers.get(i).email.equals(m) || !shoppers.get(i).password.equals(p))
                {
                    System.out.println("You have entered an invalid e-mail address or password, please try again :( ");
                    SignIn();
                }
            }   
        }
               else
        {
                System.out.println("You have entered an invalid number, please try again :( ");
                SignIn();
        }
        return;
    }

    public void Edit() {
        if (IsShopper = false) {
            System.out.println("Choose from the numbers which data you want to change: 1) E-mail address"
                    + "2) Password 3) Age 4) Salary");
            choose = x.nextInt();
            switch (choose) {

                case 1:
                    System.out.println("Please enter your ID");
                    int ids = x.nextInt();
                    for (int i = 0; i < shopowners.size(); i++) {
                        if (shopowners.get(i).ID == ids) {
                            System.out.println("Please enter your new e-mail address ");
                            String mailll = x.next();
                            shopowners.get(i).email = mailll;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Please enter your ID");
                    int z = x.nextInt();
                    for (int i = 0; i < shopowners.size(); i++) {
                        if (shopowners.get(i).ID == z) {
                            System.out.println("Please enter your new password ");
                            String passS = x.next();
                            shopowners.get(i).password = passS;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Please enter your ID");
                    int y = x.nextInt();
                    for (int i = 0; i < shopowners.size(); i++) {
                        if (shopowners.get(i).ID == y) {
                            System.out.println("Please enter your modified age ");
                            int AGE = x.nextInt();
                            shopowners.get(i).age = AGE;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Please enter your ID");
                    int f = x.nextInt();
                    for (int i = 0; i < shopowners.size(); i++) {
                        if (shopowners.get(i).ID == f) {
                            System.out.println("Please enter your modified salary ");
                            double sal = x.nextDouble();
                            shopowners.get(i).salary = sal;
                        }
                    }
                    break;
                default:
                    System.out.print("You have entered an invalid number, please try again :( ");
                    break;

            }
        } else if (IsShopper = true) {
            System.out.println("Choose from the numbers which data you want to change: 1) E-mail address"
                    + " 2) Password 3) Age 4) Money");
            choose = x.nextInt();
            switch (choose) {

                case 1:
                    System.out.println("Please enter your ID");
                    int idss = x.nextInt();
                    for (int i = 0; i < shoppers.size(); i++) {
                        if (shoppers.get(i).ID == idss) {
                            System.out.println("Please enter your new e-mail address ");
                            String maill = x.next();
                            shoppers.get(i).email = maill;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Please enter your ID");
                    int z = x.nextInt();
                    for (int i = 0; i < shoppers.size(); i++) {
                        if (shoppers.get(i).ID == z) {
                            System.out.println("Please enter your new password ");
                            String passS = x.next();
                            shoppers.get(i).password = passS;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Please enter your ID");
                    int y = x.nextInt();
                    for (int i = 0; i < shoppers.size(); i++) {
                        if (shoppers.get(i).ID == y) {
                            System.out.println("Please enter your modified age ");
                            int AGE = x.nextInt();
                            shoppers.get(i).age = AGE;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Please enter your ID");
                    int f = x.nextInt();
                    for (int i = 0; i < shoppers.size(); i++) {
                        if (shoppers.get(i).ID == f) {
                            System.out.println("Please enter your new balance ");
                            double mon = x.nextDouble();
                            shoppers.get(i).money = mon;
                        }
                    }
                    break;
                default:
                    System.out.print("You have entered an invalid number, please try again :( ");
                    break;

            }
        }
    }

    public void View() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println("The name of the product: " + products.get(i).name);
            System.out.println("The category of the product: " + products.get(i).category);
            System.out.println("The price of the product: " + products.get(i).price);
            System.out.println("The quantity of the product: " + products.get(i).quantity);
        }
    }
}
