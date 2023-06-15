/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingstore;

/**
 *
 * @author hp
 */
public class Shopper extends Member {
public double money;      public boolean IsShopper;
    public Shopper(String name, int ID, String email, String password, int age, char gender, double money, boolean IsShopper) {
        super(name, ID, email, password, age, gender);
        this.money = money;
        this.IsShopper = IsShopper;
    }


    
    
}
