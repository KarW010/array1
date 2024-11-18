import java.util.Scanner;
public class ArrayAverageScore09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalpassed = 0;
        double totalfailed = 0;
        double averagepassed;
        double averagefailed;
        System.out.print("Enter the number of student: ");
        int n = sc.nextInt();
        int[] score = new int[n];
        int passedCount = 0;
        int failedCount = 0;
        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + (i + 1) + ": ");
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < score.length; i++) {
            if (score[i] > 70) {
                System.out.println("Student " + i + " Passed!");
            }
            else {
                System.out.println("Student " + i + " Failed!");
            }
        }
        for (int i = 0; i < score.length; i++) {
            if (score[i] > 70) {
                totalpassed += score[i];
                passedCount++;
            }
            else {
                totalfailed += score[i];
                failedCount++;
            }
        }
        averagepassed = totalpassed / passedCount;
        averagefailed = totalfailed / failedCount;
        System.out.println("The average score of student who passed is " + averagepassed);
        System.out.println("The average score of student who faield is " + averagefailed);
    }
}