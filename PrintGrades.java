/*
 */
import java.net.SocketTimeoutException;
import java.util.Scanner;
public class PrintGrades {
    public static void main(String args[]) {

        double examscore = 0.0;

        Scanner dd = new Scanner(System.in);

        String choice = "Y";
        while (choice.equalsIgnoreCase("Y")) {  //start of While loop
            System.out.println("----Please Enter your Exam $core:----");
            examscore = dd.nextDouble();
            if (examscore >= 97 && examscore <= 100) {
                System.out.println("Good Job your Grade is: A+");
            } else if (examscore >= 94 && examscore <= 96) {
                System.out.println("Good job your Grade is: A");
            } else if (examscore >= 90 && examscore <= 93) {
                System.out.println("Good Job your Grade is:A-");
            } else if (examscore >= 87 && examscore <= 89) {
                System.out.println("Good Job your Grade is:B+");
            } else if (examscore >= 84 && examscore <= 86) {
                System.out.println("Good Job your Grade is:B");
            } else if (examscore >= 80 && examscore <= 83) {
                System.out.println("Good Job your Grade is:B-");
            } else if (examscore >= 77 && examscore <= 79) {
                System.out.println("Good Job your Grade is:C+");
            } else if (examscore >= 74 && examscore <= 76) {
                System.out.println("Good Job your Grade is:C");
            } else if (examscore >= 70 && examscore <= 73) {
                System.out.println("Good Job your Grade is:C-");
            } else if (examscore >= 60 && examscore <= 69) {
                System.out.println("Good Job your Grade is:D");
            } else if (0 <= examscore && examscore < 60) {
                System.out.println("Please Go back to school to Improve your Grade!");
            } else {
                System.out.println(" Please Enter the examscore values between 0 and 100 only:");
            }
            System.out.println("Would you like to continue..(Y/N?");
            choice = dd.next();


            }  ///End of While Loop

        //System.out.println("....Good bye!you're not Interested in Looking at the exam score's Grade.");
    }  //End of main method

    }//End of the class