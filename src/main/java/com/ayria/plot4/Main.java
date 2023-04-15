package com.ayria.plot4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Plot Four");
        System.out.println("First player`s name:");
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        System.out.println("Second player`s name:");
        String secondName = input.nextLine();
        String dimensions = getDimention(input);
        if (dimensions.equals("")) {
            dimensions = "6x7";  // default size
            System.out.println(firstName + " VS " + secondName + " 6 x 7 board");
        } else
            System.out.println(firstName + " VS " + secondName + " " + dimensions + " board");
        input.close();
        showBoardGame(dimensions);
    }

    public static String getDimention(Scanner input) {
        boolean validate = false;
        String dimensions = "";
        while (!validate) {
            System.out.println("Set the board dimensions (Rows x Columns)");
            System.out.println("Press Enter for default (6 x 7)");
            dimensions = input.nextLine().replace(" ", "");
            if (dimensions.equals("")) return "";
            String[] split = dimensions.split("x");
            Integer row = Integer.valueOf(split[0]);
            Integer column = Integer.valueOf(split[1]);
            if (!validateRow(row))
                continue;
            if (!validateColumn(column))
                continue;
            validate = true;
        }
        return dimensions;
    }

    public static boolean validateRow(Integer row) {
        if (!(5 <= row & row <= 9)) {
            System.out.println("Board rows should be from 5 to 9");
            return false;
        }
        return true;
    }

    public static boolean validateColumn(Integer column) {
        if (!(5 <= column & column <= 9)) {
            System.out.println("Board column should be from 5 to 9");
            return false;
        }
        return true;
    }

    public static void showBoardGame(String dimensions) {
        String[] split = dimensions.split("x");
        Integer row = Integer.valueOf(split[0]);
        Integer column = Integer.valueOf(split[1]);
        for (int i = 1; i <= column; i++) {
            System.out.print(" ");
            System.out.print(i);
        }
        System.out.println();
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j <= column; j++) {
                System.out.print("| ");
            }
            System.out.println();
        }
        for (int k = 1; k <= column * 2 + 1; k++) {
            System.out.print("=");
        }
    }
}
