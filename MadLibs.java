/**
 * Description
 *
 * @author Ayana Bando
 * @since 2022-06-20
 */

import java.util.Scanner;

public class MadLibs {
    public static void main (String[] args) {
        storyBuilder();
    }
    // ========== INSERT YOUR CODE HERE ==========

    public static void storyBuilder(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a noun:");
        String noun = sc.nextLine();

        System.out.println("Enter a proper noun:");
        String propNoun = sc.nextLine();

        System.out.println("Enter a verb:");
        String verb = sc.nextLine();

        System.out.println("Enter an adjective: ");
        String adjective = sc.nextLine();

        System.out.println("Enter an adverb: ");
        String adverb = sc.nextLine();

        System.out.println("Enter another adverb: ");
        String adverb1 = sc.nextLine();

        System.out.println("Enter another noun: ");
        String noun1 = sc.nextLine();

        System.out.println("Enter another verb: ");
        String verb1 = sc.nextLine();

        System.out.println("Enter another adjective: ");
        String adjective1 = sc.nextLine();

        System.out.println("Enter another verb: ");
        String verb2 = sc.nextLine();

        System.out.println("Enter another adjective: ");
        String adjective2 = sc.nextLine();

        System.out.println("Enter another adverb: ");
        String adverb2 = sc.nextLine();

//story goes here
        System.out.println("");
    }

  /*  should this method return the 5 different types or will it need to be 12. how will i determine which goes where?
  public static void collectSpeech(){


    }*/




    // ===========================================
    
}






// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?




2. What will you always remember (never forget) from this exercise?




*/