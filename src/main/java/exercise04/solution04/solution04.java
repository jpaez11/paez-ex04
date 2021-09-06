
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Jorge Paez
 */
package exercise04.solution04;
import java.util.Scanner;

public class solution04 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);



        System.out.println("Enter a verb: ");
        String verb = myObj.nextLine();//verb

        System.out.println("Enter a noun: ");
        String noun = myObj.nextLine();//noun

        System.out.println("Enter a adjective: ");
        String adjective = myObj.nextLine();//adj

        System.out.println("Enter a adverb: ");
        String adverb = myObj.nextLine();//adv

        //enter sentence
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? Imagine that, huh?");
    }
}