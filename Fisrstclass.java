import java.util.Scanner;
public class Fisrstclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are welcome to java class. This class promises to be exciting");

        System.out.print("Enter your score for Math: ");
        int mathscore = scanner.nextInt();

        System.out.print("Enter English score: ");
        int englishScore = scanner.nextInt();

        System.out.print("Enter Civic score: ");
        int civicScore = scanner.nextInt();

         System.out.print("Enter Biology score: ");
        int biologyScore = scanner.nextInt();

        System.out.print("Enter French score: ");
        int frenchScore = scanner.nextInt();

        scanner.close();
        long newscore = mathscore + englishScore + civicScore+ biologyScore + frenchScore;
        long allscore = 100;
        int shortscore = (int) allscore; 
        int cgpa = 5;

        int studentscore = (int) newscore / cgpa;
        System.out.println("All Score: " + newscore); 
        System.out.println(" Over 100: " + studentscore +" /100");
        System.out.println("     CGPA: " + (double) studentscore / 20); 

    }
}