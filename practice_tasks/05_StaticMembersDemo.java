package week5;

//05_Static_Members

class Student {
 static String collegeName = "ABC Engineering College";
 String name;

 Student(String name) {
     this.name = name;
 }
}

public class StaticMembersDemo {
 public static void main(String[] args) {
     Student s1 = new Student("Navaneeth");
     Student s2 = new Student("Rahul");

     System.out.println("College: " + Student.collegeName);
     System.out.println("Student 1: " + s1.name);
     System.out.println("Student 2: " + s2.name);
 }
}
