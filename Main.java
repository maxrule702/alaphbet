package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please type in a letter");
        String userletter = input.next();
        userletter = userletter.toUpperCase();
        System.out.println("please type in a number");
        int usernumber = input.nextInt();
        List alphabet = new ArrayList();
        alphabet.add("A");alphabet.add("B");alphabet.add("C");alphabet.add("D");alphabet.add("E");alphabet.add("F");alphabet.add("G");alphabet.add("H");alphabet.add("I");alphabet.add("J");alphabet.add("K");alphabet.add("L");alphabet.add("O");alphabet.add("N");alphabet.add("M");alphabet.add("P");alphabet.add("Q");alphabet.add("R");alphabet.add("S");alphabet.add("T");alphabet.add("U");alphabet.add("V");alphabet.add("W");alphabet.add("X");alphabet.add("Y");alphabet.add("Z");
        int startLetter = alphabet.indexOf(userletter);
        while (usernumber != 0) {
            System.out.println(alphabet.get(startLetter));
            usernumber--;
            startLetter --;
        }
    }
}
