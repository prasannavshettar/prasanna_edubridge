package edubridge;

public class Student { 
    String name; 
    int age; 

    void introduce() { 
        System.out.println("I am " + name + ", age " + age); 
    } 

    public static void main(String[] args) {
        Student s = new Student(); 
        s.name = "Surya"; 
        s.age = 21; 
        s.introduce(); 
    }
}
