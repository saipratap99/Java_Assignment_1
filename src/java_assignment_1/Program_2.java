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
class User_2{
    //  class variable to count users
    // tracks number of users
   static int users_count = 0;
   
   // protected instance variables 
    protected String name;
    protected int regno;
    protected String role;
    
    User_2()
    {
        name = "NONAME";
        regno = 000000;
        role = "none";
        users_count++;
    }
    User_2(String var_name,int var_regno, String var_role)
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
    String getRole(){
        return role;
    }
    
    
}

class Student extends User_2{
    
    // tracks number of students
    static int students_count = 0;
    
    // default counstructor for initializing object
    Student()
    {
        students_count++;
    }
    
    // initialize the student object
    Student(String var_name,int var_regno)
    {
        super(var_name,var_regno,"student");
        students_count++;
    }
    
    // getter for Role
    @Override String getRole(){
        return "User of type " + role;
    }
    
}

class Teacher extends User_2{
    
    // tracks number of students
    static int teachers_count = 0;
    
    // default counstructor for initializing object
    Teacher()
    {
        teachers_count++;
    }
    
    // initialize the student object
    Teacher(String var_name,int var_regno)
    {
        super(var_name,var_regno,"teacher");
        teachers_count++;
    }
    
    // getter for Role
    @Override String getRole(){
        return "User of type " + role;
    }
}

public class Program_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creates the reference object of student and teacher
        User_2 student1 = new Student("Sai Pratap",1234567);
        User_2 teacher1 = new Teacher("Tarun",1784545);
        // displays number of users
        System.out.println("Number of Users: " + User_2.users_count);
        // displays number of studenst
        System.out.println("Number of Students: " + Student.students_count);
        // displays number of teachers
        System.out.println("Number of Teachers: " + Teacher.teachers_count);
        // displays the student and teacher 
        System.out.println(student1.getName()+"-"+student1.getRegno()+"-"+student1.getRole());
        System.out.println(teacher1.getName()+"-"+teacher1.getRegno()+"-"+teacher1.getRole());   
    }
    
}
