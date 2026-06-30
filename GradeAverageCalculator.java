import java.util.Scanner;

public class GradeAverageCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of grades: ");
        int numGrades = sc.nextInt();

        double[] grades = new double[numGrades];
        double sum = 0;

        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
            sum += grades[i];
        }

        double average = sum / numGrades;

        System.out.println("\nGrades entered: ");
        for (int i = 0; i < numGrades; i++) {
            System.out.print(grades[i] + " ");
        }

        System.out.printf("\nThe average grade is: %.2f%n", average);

        sc.close();
    }
}
