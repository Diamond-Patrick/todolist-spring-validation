package com.spring.validation.todolist.todolist_validation.Utilities;

import java.util.Scanner;

public class UtilityScanner {

    private static Scanner scanner = new Scanner(System.in);

    public static String input(String info) {
        System.out.print(info + " : ");
        return scanner.nextLine();
    }
}
