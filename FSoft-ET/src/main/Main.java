package main;

import algorithms.Algorithms;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Algorithms algorithms = new Algorithms();

    public static void main(String[] args) {

        System.out.println("Enter a paragraph for algorithms: ");
        String string = scanner.nextLine();
        System.out.println("The longest string in the bellow paragraph is: " + algorithms.findTheLongestString(string));

    }

}
