package Consult;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Homework3 {

    public static void main(String[] args) {
        double number = 1.543534634;

        BigDecimal bigDecimal = new BigDecimal(number);

        bigDecimal = bigDecimal.setScale(5, RoundingMode.DOWN);

        System.out.println(bigDecimal);

        double value = 34.766674;
        String result = String.format("%.3f",value);
        System.out.print(result);//  34,767
    }
}