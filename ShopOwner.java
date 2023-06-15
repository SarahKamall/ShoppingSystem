/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingstore;


public class ShopOwner extends Member {
public double salary;    public boolean IsShopper;
    public ShopOwner(String name, int ID, String email, String password, int age, char gender, double salary, boolean IsShopper) {
        super(name, ID, email, password, age, gender);
        this.salary = salary;
        this.IsShopper = IsShopper;
    }

    
    
}
