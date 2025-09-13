import java.util.Scanner;

class StudentDetails {
String name;
int rollNo;
float marks;

void displayDetails() {
    System.out.println("Student Details\n");
    System.out.println("Name = "+name);

    System.out.println("Roll Number = "+rollNo);
    System.out.println("Marks = "+marks);
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StudentDetails s1 = new StudentDetails();

    System.out.println("Enter Student Name :");
    s1.name = sc.nextLine();

    System.out.println("Enter Roll Number :");
    s1.rollNo = sc.nextInt();

    System.out.println("Enter Marks :");
    s1.marks = sc.nextFloat();

    s1.displayDetails();
    }
}
