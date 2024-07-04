package Homework9_IntermediateCertification;

import java.util.Scanner;

public class Task1Message {

    static final int lettersAnd3Length = 62;
    static final int space = 12;
    static final int lettersTotal = 15;
    static final int spaceCount = 3;


    private static void LengthComparison(int fenceLength, int stringLength) {
        if (fenceLength > stringLength) {
            System.out.println(
                String.format("Надпись мальчика поместится на забор длинной %d см ", fenceLength));
        } else {
            System.out.println(
                String.format("Надпись мальчика не поместится на забор длинной %d см ",
                    fenceLength));
        }
    }

    public static void main(String[] args) {
        int fenceLength;
        int stringLength = lettersTotal * (lettersAnd3Length / 3) + spaceCount * space;

        //Тест ввод с клавиатуры
        System.out.print("Введите длинну забора ");
        fenceLength = Integer.parseInt(new Scanner(System.in).nextLine());
        LengthComparison(fenceLength, stringLength);

        //Тест проверки условий
        LengthComparison(50, stringLength);
        LengthComparison(400, stringLength);
    }
}
