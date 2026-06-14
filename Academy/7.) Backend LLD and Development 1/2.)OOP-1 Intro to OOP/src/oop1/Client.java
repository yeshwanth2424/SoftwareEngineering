package oop1;

public class Client {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.id = "1";
        student1.name = "Yesh";
        student1.course = "Computer Science";

        Student student2 = new Student();
        student2.id = "2";
        student2.name = "Elon musk";
        student2.course = "Mathematics";

        System.out.println("Details of Student 1:");
        student1.printDetails();
        System.out.println("\nDetails of Student 2:");
        student2.printDetails();
    }
}
