package Lesson4;

public class ArraysIntro {

    public static void main(String[] args) {
        int x = 4; //сколько байт
        long y = 8; // 8

        int[][] marks = new int[5][5];
        marks[0][0] = 1;
        marks[0][1] = 2;
        marks[0][2] = 3;
        marks[0][3] = 4;
        marks[0][4] = 5;
        marks[1][0] = 6;
        marks[2][0] = 7;
        marks[3][0] = 8;
        marks[4][0] = 9;

        String[] names = new String[5];
        names[0] = "Галина";
        names[1] = "Данила";
        names[2] = "Никита";
        names[3] = "Анна";
        names[4] = "Милана";
        System.out.println(names[1]);
        //long[] numbers = new long[1_000_000_000];

    }

}
