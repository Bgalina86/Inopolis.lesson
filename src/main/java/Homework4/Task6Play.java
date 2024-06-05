package Homework4;

// Топ-3 игроков
//    создайте массив строк (размер 10)
//    запишите в него 10 имен
//    в цикле выведите на экран только первых трех игроков

public class Task6Play {

    public static void main(String[] args) {

        //Организация массива из 10 элементов
        String[] names = new String[10];

        //Заполнение массива данными
        names[0] = "Галина";
        names[1] = "Данила";
        names[2] = "Никита";
        names[3] = "Анна";
        names[4] = "Милана";
        names[5] = "Григорий";
        names[6] = "Татьяна";
        names[7] = "Давид";
        names[8] = "Камиль";
        names[9] = "Вика";

        // Вывод на экран первых трех
        for (int i = 0; i< 3; i=i+1){
            System.out.println(names[i]);
        }
    }

}
