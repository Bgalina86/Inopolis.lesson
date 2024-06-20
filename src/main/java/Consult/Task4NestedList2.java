package Consult;

import Homework6Collection.Company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task4NestedList2 {

    public static void main(String[] args) {
        List<String> companies = new ArrayList<>();
        companies.add("TVT");
        companies.add("CTC");
        companies.add("BBC");
        int i = 0;
        for (String string : companies) {
            List<Company> companies1Filme = new ArrayList<>();

            for (String s : Arrays.asList("\"Лёд 1\"", "\"Лёд 2\"", "\"Лёд 3\"")) {
                System.out.println(companies.get(i) + ": ");
          //    companies1Filme.add(  Company("", Collections.singletonList(s)));

            }
            i++;
            List<Company> companies2Filme = new LinkedList<>();
            for (String s : Arrays.asList("\"Министерство неджентльменских дел 1\"",
                "\"Министерство неджентльменских дел 2\"",
                "\"Министерство неджентльменских дел 3\"")) {
                System.out.println(companies.get(i) + ": ");
               companies2Filme.add(
                    new Company("", Collections.singletonList(s)));
            }
            i++;
            List<Company> companies3Filme = new LinkedList<>();
            for (String s : Arrays.asList("\"Онегин 1\"", "\"Онегин 2\"", "\"Онегин 3\"")) {
                System.out.println(companies.get(i) + ": ");
               companies3Filme.add(new Company("", Collections.singletonList(s)));
            }
            return;
        }
//        int i = 0;
//        for (Company companiesnumber : companies1Filme) {
//            if (i < 3) {
//                System.out.println(companies.get(0) + ": " + companies1Filme.get(i));
//            }
//            i++;
//        }
//      int x=0;
//        for (Company companiesnumber2 : companies2Filme) {
//            System.out.println(companies.get(1) + ": " + companies2Filme.get(x));
//
//        }
//        int y = 0;
//        for (Company companiesnumber3 : companies3Filme) {
//            System.out.println(companies.get(2) + ": " + companies3Filme.get(y));
//            y++;
//        }

    }

}
