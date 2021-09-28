import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Epam {
        public static void main(String args[]){
        BigDecimal b1 = new BigDecimal("23.43");
        BigDecimal b2 = new BigDecimal("23.43");
        BigDecimal b3 = new BigDecimal("24");
        System.out.println(b1.compareTo(b2) == 0); //1
        System.out.println(b1.compareTo(b3) == 1); //2
        System.out.println(b1.equals(b2)); //3
        System.out.println(b1.equals(new BigDecimal("23.43"))); //4
        System.out.println(b1 == b2); //5
        b2 = b2.add(new BigDecimal("0.57"));
        System.out.println(b3.equals(b2)); //6
}
}
