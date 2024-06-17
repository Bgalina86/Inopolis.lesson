package Homework6;

import java.util.ArrayList;
import java.util.List;

public class Task2List {

    public static void main(String[] args) {

        List<String> exercise = new ArrayList<>();
        exercise.add("Заправить кровать");
        exercise.add("Умыться");
        exercise.add("Приготовить завтрак");
        exercise.add("Позавтракать");
        exercise.add("Помыть посуду");

        int i = 1;

        for (String  string : exercise){
            System.out.println("Задание " + i +": "+ string);
            i++;
        }
    }

}
