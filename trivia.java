import java.time.Year;
import java.util.Scanner;


import java.io.*;

import java.util.*;

import java.util.Scanner;
public class trivia {
    static Scanner cin = new Scanner(System.in);

    static void myMethod() {


        String playAgain;

        int correct = 0;

        int incorrect = 0;

        int questions = 5;

        System.out.println("Welcome to the Multiple Choice Quiz of African countries facts :)! \n");


        String[][] Ques_Ans = {

                {"Which of these countries is not in East Africa? ", "\n A. Rwanda \n B. Uganda \n C. Senegal \n D. Burundi\n", "C"},

                {"What is the largest country in Africa? ", "\n A. Congo \n B. Algeria \n C. Nigeria \n D. Kenya\n", "B"},

                {"Which country won the latest African Football Cup ? ", "\n A. Egypt \n B. Comolos \n C. Cameroon \n D. Senegal\n", "D"},

                {"What is the smallest African country? ", "\n A. Seychelles \n B. Togo; \n C. Mali; \n D. Kenya;\n", "A"},

                {"What's the largest populated african country?", "\n A. Nigeria \n B. Tanzania \n C. Zimbabwe \n D. Ghana\n", "A"}};


        String[] user_ans = new String[(int) questions];

        int i = 0;


        do {

            System.out.print("" + (i + 1) + ". " + Ques_Ans[i][0] + "   " + Ques_Ans[i][1]);

            user_ans[i] = String.valueOf(cin.next().charAt(0));
            //isValid(user_ans);


            if (Ques_Ans[i][2].equals(user_ans[i])) {

                System.out.println("\n Correct!");

                correct++;


            } else {

                System.out.println("\n Incorrect. The correct answer is " + Ques_Ans[i][2]);

                incorrect++;

            }


            System.out.print("\n");

            i++;

        } while (i < questions);


        System.out.println("\n You've got: " + correct + "  correct answers");

        System.out.println("\n AND\n");

        System.out.println( incorrect + "  incorrect answers" );



    }

    public static void main(String args[]) {
        Scanner inputScanner = new Scanner(System.in);
        String userInput = "";
        do {
            myMethod();
            System.out.print("Do you want to play again (Y / N)? ");
            userInput = inputScanner.nextLine();
            System.out.println(userInput);
        } while (userInput.equals("Y") || userInput.equals(""));
    }
}