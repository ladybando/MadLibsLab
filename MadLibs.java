/**
 * Description
 *
 * @author Ayana Bando
 * @since 2022-06-20
 */

import java.util.Locale;
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

        System.out.println("Enter an adverb: ");
        String adverb = sc.nextLine();

        System.out.println("Enter another noun: ");
        String noun1 = sc.nextLine();

        System.out.println("Enter another noun: ");
        String noun2 = sc.nextLine();

        System.out.println("Enter an adjective: ");
        String adjective = sc.nextLine();

        System.out.println("Enter a verb:");
        String verb = sc.nextLine();

        System.out.println("Enter another adjective: ");
        String adjective1 = sc.nextLine();

        System.out.println("Enter another verb: ");
        String verb1 = sc.nextLine();

        System.out.println("Enter a proper noun:");
        String propNoun = sc.nextLine();

        System.out.println("Enter another adverb: ");
        String adverb1 = sc.nextLine();

        System.out.println("Enter another verb: ");
        String verb2 = sc.nextLine();

        System.out.println("Enter another adverb: ");
        String adverb2 = sc.nextLine();

        System.out.println("Enter another adjective: ");
        String adjective2 = sc.nextLine();

//story goes here
        System.out.println("\n" +
                "\nOnce upon a time, there were two " + noun + " who lived together at the " + adverb +" of a " + adjective + " tree. The two " + noun + " loved to tell " +
                "\neach other stories at the end of the day. Their favorite story was about two " + noun1 + " who fought to save a " + noun2 + " princess from a " +
                "\nscary toad who " + adjective1 + " to " + verb + " her. The " + noun1 + " " + verb1 + " many battles against toad armies and made many new friends like the " + propNoun + " clan " +
                "\nand the humming bird clan. " + adverb1.toUpperCase() + " they " + verb2 + " the story and the toad army won. Other times, the dragonflies won and saved" +
                "\nthe princess. The " + noun + " ended " + adverb2 + "'s story with the princess " + adjective2 + " the toad and saving herself!");
    }




    // ===========================================
    
}






// =============== LAB SUMMARY ===============

