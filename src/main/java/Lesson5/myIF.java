package Lesson5;

import java.util.Scanner;

public class myIF {

    public static void main(String[] args) {
        String size = new Scanner(System.in).nextLine();

        if (size.equals("xs")) {
            System.out.println(">>>>40-42");
        } else {
            if (size.equals("s")) {
                System.out.println(">>>>44-46");
            } else {
                if (size.equals("m")) {
                    System.out.println(">>>>48-50");
                } else {
                    if (size.equals("l")) {
                        System.out.println(">>>>52-54");
                    } else {

                        System.out.println(">>>>56-58");

                    }

                }
            }
        }

        switch (size) {
            case "xs":
                System.out.println("40-42");
                break;
            case "s":
                System.out.println("44-46");
                break;
            case "m":
                System.out.println("48-50");
                break;
            case "x":
                System.out.println("50-52");
                break;
            case "xl":
                System.out.println("54-56");
                break;
            default:
                System.out.println("У нас нет таких размеров");
        }
    }
}



