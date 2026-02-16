import java.util.Scanner;

class Student {
    String name;
    double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class GradeCalculator {
    public String calculateGrade(double marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "D";
    }
}

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Marks: ");
        double marks = Double.parseDouble(scanner.nextLine());

        Student student = new Student(name, marks);
        GradeCalculator calculator = new GradeCalculator();
        String grade = calculator.calculateGrade(marks);

        System.out.println("\n--- Student Report ---");
        student.displayDetails();
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
  