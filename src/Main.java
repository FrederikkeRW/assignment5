/*
Write a Java program to convert minutes into a number of years and days
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write a number of minutes, and i will convert it into years and days");

        int minutes = keyboard.nextInt();
        int years = minutes/525600;
        int days = minutes/1440;
        if(years > 0){
            int restDays = days % 365; // Giver resten af 'days', ud af 365.
            System.out.println("There are "+years+ " years, and "+restDays+" days on "+minutes+ " minutes");
        } else{
            System.out.println("There are "+days+" days on "+minutes+ " minutes");
        }
    }
}
