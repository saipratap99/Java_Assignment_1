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

// interface 
interface User_4
{
    String getName();
    int getRegno();
    String getRole();
}

// class implements from interface
class Student_4 implements User_4
{
    // tracts the students count
    static int students_count = 0;
    
    // name, role and regno
    private String name;
    private int regno;
    private String role;
    
    // default constructor
    Student_4(){
        name = "NONAME";
        regno = 000000;
        role = "none";
        students_count++;
    }
    
    // parameterized constructor
    // adds the role to student even if not passed
    Student_4(String var_name,int var_regno){
        name = var_name;
        regno = var_regno;
        role = "student";
        students_count++;
    }
    
    // overrides the abstract method
    @Override public String getName(){
        return name;
    }
    
    // overrides the abstract method
    @Override public int getRegno(){
        return regno;
    }
    
    // overrides the abstract method
    @Override public String getRole(){
        return "User of type " + role;
    }
}

// class implements from interface
class Teacher_4 implements User_4
{
    
    // tracks the teachers count
    static int teachers_count = 0;
    
    // name,regno and role instance varibales
    private String name;
    private int regno;
    private String role;
    
    
    // default constructor
    Teacher_4(){
        name = "NONAME";
        regno = 000000;
        role = "none";
        teachers_count++;
    }
    
    // parameterized constructor
    // adds the role to teacher even if not passed
    Teacher_4(String var_name,int var_regno){
        name = var_name;
        regno = var_regno;
        role = "teacher";
        teachers_count++;
    }
    
    // overrides the abstract method
    @Override public String getName(){
        return name;
    }
    
    // overrides the abstract method
    @Override public int getRegno(){
        return regno;
    }
    
    // overrides the abstract method
    @Override public String getRole(){
        return "User of type " + role;
    } 
}


public class Program_4 {
    public static void main(String[] args) {
        // TODO code application logic here
        // creates the object of student and teacher
        Student_4 student1 = new Student_4("Sai Pratap",1234567);
        Teacher_4 teacher1 = new Teacher_4("Tarun",1784545);
        // displays number of students
        System.out.println("Number of Students: " + Student_4.students_count);
        // displays number of teachers
        System.out.println("Number of Teachers: " + Teacher_4.teachers_count);
        // displays the student and teacher 
        System.out.println(student1.getName()+"-"+student1.getRegno()+"-"+student1.getRole());
        System.out.println(teacher1.getName()+"-"+teacher1.getRegno()+"-"+teacher1.getRole());   
    }
}
