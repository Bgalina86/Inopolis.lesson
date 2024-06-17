package Homework6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task4NestedList {

    public static void main(String[] args) {
        List<String> companies = new ArrayList<>();
        companies.add("TVT");
        companies.add("CTC");
        companies.add("BBC");
        int i = 0;
        for (String string : companies) {
            List<Company> companies1Filme = new ArrayList<>();

            for (String s : Arrays.asList("\"Лёд 1\"", "\"Лёд 2\"", "\"Лёд 3\"")) {
                System.out.print(companies.get(i) + ": ");
              companies1Filme.add(new Company("", Collections.singletonList(s)));
            }
            i++;
            List<Company> companies2Filme = new LinkedList<>();
            for (String s : Arrays.asList("\"Министерство неджентльменских дел 1\"",
                "\"Министерство неджентльменских дел 2\"",
                "\"Министерство неджентльменских дел 3\"")) {
                System.out.print(companies.get(i) + ": ");
               companies2Filme.add(
                    new Company("",Collections.singletonList(s)));
            }
            i++;
            List<Company> companies3Filme = new LinkedList<>();
            for (String s : Arrays.asList("\"Онегин 1\"", "\"Онегин 2\"", "\"Онегин 3\"")) {
                System.out.print(companies.get(i) + ": ");
               companies3Filme.add(new Company("", Collections.singletonList(s)));
            }
            return;
        }
    }

}
