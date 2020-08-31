/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_assignment_1;

/**
 *
 * @author DELL
 */
class User{
    //  class variable to count users
   static int users_count = 0;
   
   // protected instance variables 
    protected String name;
    protected int regno;
    protected String role;
    
    User()
    {
        name = "NONAME";
        regno = 000000;
        role = "none";
        users_count++;
    }
    User(String var_name,int var_regno, String var_role)
    {
        name = var_name;
        regno = var_regno;
        role = var_role;
        users_count++;
    }
    
    
    // setter for name
    void setName (String name)
    {
        this.name = name;
    }
    
    // getter for name
    String getName(){
        return this.name;
    }
    
    // setter for regno
    void setRegno (int regno)
    {
        this.regno = regno;
    }
    
    // gettter for regno 
    int getRegno(){
        return this.regno;
    }
    
    // setter for role
    void setRole (String role)
    {
        this.role = role;
    }
    
    // getter for Role
    String getRole(){
        return this.role;
    }
    
}


public class Program_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User student1 = new User("Sai Pratap",1234567,"student");
        User teacher1 = new User("Tarun",1784545,"teacher");
        System.out.println("Number of users: " + User.users_count);
        System.out.println(student1.getName()+"-"+student1.getRegno()+"-"+student1.getRole());
        System.out.println(teacher1.getName()+"-"+teacher1.getRegno()+"-"+teacher1.getRole());   
    }
    
}
