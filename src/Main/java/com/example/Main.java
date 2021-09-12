package com.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Nham

 */

public class Main {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
    System.out.printf("What is input string? ");
    String inputString = scan.nextLine();

    int charNum = inputString.length();

    System.out.printf(inputString + " has %d characters.", charNum);
    }
}
