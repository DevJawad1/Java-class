// import java.util.Scanner;
// public class Arrayclass{
//     static Scanner na = new Scanner(System.in);
    // public static void displayName(String name, String day, int score){
    //     System.err.println("My name is "+ name + " on "+ day + " I got "+ score+" %");
    // };


//         public static void startApp(){
//             System.out.println("press \n 1. Start algebra\n 2. Calculate cgpa\n 3. Quit application");
//             int option = na.nextInt();
//             if(option==1){
//                 algebra();
//             }else if (option==2){
//                 cgpa();
//             }else if (option==3){
//                 System.exit(0);
//             }else{
//                 System.out.println("Invalid option selected");
//                 startApp();
//             }
//         };

//     public static void algebra(){
//         double result = 45.3 + subtract();
//         System.out.println("Welcome " + myName() + subtract()+ " your total value is "+ result);
//     };
//     public static String myName(){
//         System.out.print("Enter your name");
//         String name = na.nextLine();
//         System.out.println(name);
//         return name;
//     };
//     public static int addition(int a, int b){
//         int result = a + b;
//         return result;
//     };
//     public static double subtract(){
//         double va=50;
//         double va2=20;
//         int add = addition(5, 6);
//         double result = va - va2 *add;
//         return result;
//     };
//     public static void main(String[] args) {
//         startApp();
//         System.out.println("Please enter your name");
//         String name = na.nextLine();
//         displayName(name , "Staurday", 100);
//     }
//     public static void cgpa (){
//     //  Scanner scanner = new Scanner(System.in);
//         System.out.println("You are welcome to CGPA calculating. Now provide your score");

//         System.out.print("Enter your score for Math: ");
//         int mathscore = na.nextInt();

//         System.out.print("Enter English score: ");
//         int englishScore = na.nextInt();

//         System.out.print("Enter Civic score: ");
//         int civicScore = na.nextInt();

//          System.out.print("Enter Biology score: ");
//         int biologyScore = na.nextInt();

//         System.out.print("Enter French score: ");
//         int frenchScore = na.nextInt();

        
//         long newscore = mathscore + englishScore + civicScore+ biologyScore + frenchScore;
//         long allscore = 100;
//         int shortscore = (int) allscore; 
//         int cgpa = 5;

//         int studentscore = (int) newscore / cgpa;
//         System.out.println("All Score: " + newscore); 
//         System.out.println(" Over 100: " + studentscore +" /100");
//         System.out.println("     CGPA: " + (double) studentscore / 20); 
//         // na.close();
//         menu();
// }

// public static void menu(){
//      System.out.println("press \n 1. Back to main menu\n 2. to quit application");
//       int menuoption = na.nextInt();

//         if(menuoption==1){
//             startApp();
//         }else if(menuoption==2){
//             System.exit(0);
//         }else{
//         System.out.println("You can only picked between 1 and 2 ");
//             menu();
//         }
// }


// }


// import java.util.Scanner;
// public class Arrayclass {
//        static Scanner pick = new Scanner(System.in);
//     public static void main(String[] args) {
//         System.out.println("Array class");
//         String[] name;
//         String[] name2 = new String[5];
//         String[] name3 = {"Ade", "Bayo", "Kola"};

//         name2[2]="Wow";
//         name2[0]="Whoa";
//         name2[4]="Yeah";
//         name3[1]= "Busayo";
//         // System.out.println(name2[2]);
//         // System.out.println(name3[1]);
//         // System.out.println(name3.length);
//         String err = name2.toString();
//         // System.out.println(err);

//         // for(String no : name2){
//         //     System.out.println(no);
//         // };

//         String[][] values= new String[3][3];
//         values[1][2] = "Row 1 col 2";
//         values[0][0] = "Row 0 col 0";
//         int [][] val = {{1, 2, 3, 4, 5}, {2, 5, 6, 7,9}, {5,8, 1,3,0}};

//         // System.out.println(val[2][0]);

//         // if(val[2][0]==0){
//         //     System.out.println("It is 0");
//         // }
//         // else{
//         //     System.out.println("not 0 but " + val[2][0]);
//         // }

//         char answer;
//         System.out.println("The current Nigeria of Nigeria is _ ___________ (a) Buhari (b) Atiku (c) Tinubu (d) Obi");
//         System.out.print("Enter your option ");
//         answer = pick.next().charAt(0);

//         switch(answer){
//             case 'c':
//                 System.out.println("Congratulation, you are correct");
//                 // count<< "Congratulation, you are correct";
//                 break;
//             case 'a':
//                 System.out.println("Sorry, you are wrong");
//                 // count<< "Congratulation, you are correct";
//                 break;
//             case 'b':
//                 System.out.println("Sorry, you are wrong");
//                 // count<< "Congratulation, you are correct";
//                 break;
//             case 'd':
//                 System.out.println("Sorry, you are wrong");
//                 // count<< "Congratulation, you are correct";
//                 break;
//             default:
//                 System.out.println("Sorry, you are wrong");
//                 // count<< "Sorry, you are wrong";
//                 break;
//         }
//         // Method Defination e.g public static void myMethod(){} or public int myMethod(int a){}
//         // Method Declaration e.g {System.out.println("This is a java class")}
//         // Method Invocation e.g myMethod() or myMethod(5)
//     }
// }
