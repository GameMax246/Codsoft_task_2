import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int subjects=scanner.nextInt();
        int marks[]=new int[subjects];
        for (int i = 0; i <subjects; i++) {
            System.out.print("Enter marks for subject " + (i ) + ": ");
            marks[i] = scanner.nextInt();
        }
        System.out.println();
        double totalmarks=0;
         for (int i = 0; i <subjects; i++) {
             totalmarks += marks[i];
         }
         double percentage =totalmarks/subjects;
         System.out.println("Your Total Mark is :"+totalmarks);
         System.out.println("your percentage is "+percentage+" % ");
         if(percentage>=90){
             System.out.print("You got Grade A+");
         }
         else if (percentage>=80){
             System.out.print("You got Grade A");
         }
         else if(percentage>=70){
             System.out.print("Yoy gut Grade B");
         }
         else if(percentage>=60){
             System.out.print("You got Grade C");
         }
         else if(percentage>=50){
             System.out.print("You got Grade D");
         }
         else{
             System.out.print("You failed");
         }
    }
}