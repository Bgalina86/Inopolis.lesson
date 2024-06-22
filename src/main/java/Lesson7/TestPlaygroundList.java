package Lesson7;

import java.util.ArrayList;
import java.util.List;

public class TestPlaygroundList {

    public static void main(String[] args) {
        List<String > strings=new ArrayList<>();
        strings.add("Nikita");
        strings.add("Женя");
        strings.add("Камиль");
        strings.add("Галина");
        strings.add("Игорь");

        strings.add(1,"Рината");

        strings.remove("Женя");
        strings.remove(1);



        System.out.println(strings.size());
        for (String string : strings){
            System.out.println(string.toUpperCase());
        }
    }

}
