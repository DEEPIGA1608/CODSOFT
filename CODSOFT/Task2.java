import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks obtained (out of 100) in each subject:");
        int numOfSubjects = 5; // Assuming there are 5 subjects
        int totalMarks = 0;
        for (int i = 1; i <= numOfSubjects; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        System.out.println("Total Marks: " + totalMarks);

        double averagePercentage = (double) totalMarks / numOfSubjects;
        System.out.println("Average Percentage: " + averagePercentage + "%");

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
