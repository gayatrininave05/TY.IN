class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return "Name: " + name;
    }
}

class Student extends Person {
    private String studentID;
    
    public Student(String name, String studentID) {
        super(name);
        this.studentID = studentID;
    }
    
    public String getStudentID() {
        return "Student ID: " + studentID;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", "S12345");
        System.out.println(student.getName());
        System.out.println(student.getStudentID());
    }
}
