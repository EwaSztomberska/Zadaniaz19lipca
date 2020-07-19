package com.company;

import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String text = scanner.nextLine();
        char znakSpacji = ' ';
        int sumSpacji= 0;
        for(int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == znakSpacji) {
                sumSpacji++;
            }
        }
         int procent = (int) ((double)sumSpacji/text.length() * 100);
        System.out.println(procent + "%");
        }
    }

