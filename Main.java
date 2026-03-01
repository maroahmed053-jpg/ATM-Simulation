import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String studentName;
        int numSubjects;
        double total = 0, average;
        char grade;

        System.out.println("===== Student Grade System =====");

        // اسم الطالب
        System.out.print("Enter student name: ");
        studentName = input.nextLine();

        // عدد المواد
        System.out.print("Enter number of subjects: ");
        numSubjects = input.nextInt();
        input.nextLine(); // تنظيف الإدخال

        String[] subjects = new String[numSubjects];
        double[] marks = new double[numSubjects];

        // إدخال المواد والدرجات
        for (int i = 0; i < numSubjects; i++) {

            System.out.print("Enter subject name: ");
            subjects[i] = input.nextLine();

            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = input.nextDouble();
            input.nextLine();

            total += marks[i];
        }

        // الحساب
        average = total / numSubjects;

        // التقدير
        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else
            grade = 'F';

        // عرض النتائج
        System.out.println("\n===== Result =====");
        System.out.println("Student Name: " + studentName);

        for (int i = 0; i < numSubjects; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
        System.out.println("Grade = " + grade);
    }
}