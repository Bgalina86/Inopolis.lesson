package Consult;

import Homework6.Company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TTEESSTTTask4NestedList1 {

    private static void sample() {
//        Map<String, Company> companies = new HashMap<String, Company>();
//        var movies = Arrays.asList("\"Лёд 1\"", "\"Лёд 2\"", "\"Лёд 3\"");
//
//        var newCompany = new Homework6.Company(movies);
//        //companies.put(new String("A21"), new Company(movies));
//
//        companies.put("Comp1", newCompany);

    }

    public static void main(String[] args) {
        List<String> companies = new ArrayList<>();
        companies.add("TVT");
        companies.add("CTC");
        companies.add("BBC");

        Map<String, String> companies1 = new HashMap<>();
        var movies = Arrays.asList("\"Лёд 1\"", "\"Лёд 2\"", "\"Лёд 3\"");
      //  var newCompany = new Company(movies);
        companies1.put(companies.get(0),movies.get(0));
        //newCompany.setName(companies.get(0));
        System.out.println(companies1.get(0));

        return;
    }
}
/*

        for (String string : companies) {
            Map<String,Company> companies1Filme = new HashMap<>();

            for (String s : Arrays.asList("\"Лёд 1\"", "\"Лёд 2\"", "\"Лёд 3\"")) {
               // System.out.println(companies.get(i) + ": ");
                List<String> companyname = companies.stream().toList();

                //companies1Filme.put( new Company(Collections.singletonList(s)));

            }
            i++;
            List<Company> companies2Filme = new LinkedList<>();
            for (String s : Arrays.asList("\"Министерство неджентльменских дел 1\"",
                "\"Министерство неджентльменских дел 2\"",
                "\"Министерство неджентльменских дел 3\"")) {
                System.out.println(companies.get(i) + ": ");
                companies2Filme.add(
                    new Company(Collections.singletonList(s)));
            }
            i++;
            List<Company> companies3Filme = new LinkedList<>();
            for (String s : Arrays.asList("\"Онегин 1\"", "\"Онегин 2\"", "\"Онегин 3\"")) {
                System.out.println(companies.get(i) + ": ");
                companies3Filme.add(new Company(Collections.singletonList(s)));
            }
            return;
            */
//    }
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


