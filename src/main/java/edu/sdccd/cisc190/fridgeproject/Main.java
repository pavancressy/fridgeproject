package edu.sdccd.cisc190.fridgeproject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ingredient ing1 = new Ingredient();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input an ingredient!\n");
        ing1.setName(userInput.nextLine());
        System.out.println(ing1.getName() + " is your first ingredient.");
    }
}
