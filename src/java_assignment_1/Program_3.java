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

// abstract class
abstract class User_3{
    //  class variable to count users
    // tracks number of users
   static int users_count = 0;
   
   // protected instance variables 
    protected String name;
    protected int regno;
    protected String role;
    
    User_3()
    {
        name = "NONAME";
        regno = 000000;
        role = "none";
        users_count++;
    }
    User_3(String var_name,int var_regno, String var_role)
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
    
    // getter for role
    // abstract method
    abstract String getRole();
}

class Student_3 extends User_3{
    
    // tracks number of students
    static int students_count = 0;
    
    // default counstructor for initializing object
    Student_3()
    {
        students_count++;
    }
    
    // initialize the student object
    Student_3(String var_name,int var_regno)
    {
        super(var_name,var_regno,"student");
        students_count++;
    }
    
    // getter for Role
    @Override String getRole(){
        return "User of type " + role;
    }
    
}

class Teacher_3 extends User_3{
    
    // tracks number of students
    static int teachers_count = 0;
    
    // default counstructor for initializing object
    Teacher_3()
    {
        teachers_count++;
    }
    
    // initialize the student object
    Teacher_3(String var_name,int var_regno)
    {
        super(var_name,var_regno,"teacher");
        teachers_count++;
    }
    
    // getter for Role
    @Override String getRole(){
        return "User of type " + role;
    }
}




public class Program_3 {
    public static void main(String[] args) {
        // TODO code application logic here
        // creates the object of student and teacher
        Student_3 student1 = new Student_3("Sai Pratap",1234567);
        Teacher_3 teacher1 = new Teacher_3("Tarun",1784545);
        // displays number of users
        System.out.println("Number of Users: " + User_3.users_count);
        // displays number of studenst
        System.out.println("Number of Students: " + Student_3.students_count);
        // displays number of teachers
        System.out.println("Number of Teachers: " + Teacher_3.teachers_count);
        // displays the student and teacher 
        System.out.println(student1.getName()+"-"+student1.getRegno()+"-"+student1.getRole());
        System.out.println(teacher1.getName()+"-"+teacher1.getRegno()+"-"+teacher1.getRole());   
    }
    
}
