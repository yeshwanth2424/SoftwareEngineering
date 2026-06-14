package oop2;
import oop1.Student;

public class Client {
    public static void main(String[] args) {

        Student s1 = new Student("S001", "Alice", "Computer Science");
        s1.printDetails();
    }
}
