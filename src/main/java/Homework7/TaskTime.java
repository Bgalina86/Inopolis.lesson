package Homework7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TaskTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputD = input.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm");
        LocalDateTime parse = LocalDateTime.parse(inputD, formatter);

        System.out.println(parse);
        String parseTime = (String.valueOf(parse));
      Long inputTimeMill = parse.getTime();

        System.out.println(inputTimeMill);
    }

}
