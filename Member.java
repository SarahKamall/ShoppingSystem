/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingstore;


public class Member {
    public final String name;
    public final int ID;
    public String email, password;
    public int age;
    public final char gender;

    public Member(String name, int ID, String email, String password, int age, char gender) {
        this.name = name;
        this.ID = ID;
        this.email = email;
        this.password = password;
        this.age = age;
        this.gender = gender;
    }
    
    
}
