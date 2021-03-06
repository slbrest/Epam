package BasicsOfSoftwareCodeDevelopment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Random;

public class TasksPageOne {
    public static void main(String args[]) throws IOException {
        System.out.println("1. Найти значение функции z =( ( a - 3 ) * b / 2 ) + c");
        func(11, 22, 33);
        System.out.println("\n2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):");
        formulaOne(1, 2, 3);
        System.out.println("\n3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):");
        formulaTwo(1, 2);
        System.out.println("\n4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). " +
                "Поменять местами дробную и целую части числа и вывести полученное значение числа.");
        reverseDouble(123.456);
        System.out.println("\n5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. " +
                "Вывести данное значение длительности в часах, минутах и секундах в следующей форме:");
        seconds(3601);
        System.out.println("\n6. Для данной области составить линейную программу, которая печатает true, если точка с " +
                "координатами (х, у) принадлежит закрашенной области, и false — в противном случае:");
        shadedArea(2, 3);
        System.out.println("\n7. Даны два угла треугольника (в градусах). " +
                "Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.");
        triangle(45, 45);
        System.out.println("\n8. Найти max{min(a, b), min(c, d)}");
        maxMin(4, 6, 7, 1);
        System.out.println("\n9. Даны три точки А (х1,y1), B(x2,y2) и C(x3,y3). Определить, будут ли они " +
                "расположены на одной прямой.");
        straight(1, 1, 2, 2, 3, 3);
        System.out.println("\n10. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. " +
                "Определить, пройдет ли кирпич через отверстие.");
        brick(5, 4);
        System.out.println("\n11. Вычислить значение функции:");
        function(2);
        System.out.println("\n12. Напишите программу, где пользователь вводит любое целое положительное число. " +
                "А программа суммирует все числа от 1 до введенного пользователем числа.");
        sum(3);
        System.out.println("\n13. вычислить значение функции на отрезке a b шагом h");
        funLine(3, 10, 2);
        System.out.println("\n14. вычислить сумму квадратов первых 100 чисел.");
        sumSquare(100);
        System.out.println("\n15. составить программу нахождения произведения квадратов первых двухсот чисел");
        multiplicationSquare(200);
        System.out.println("\n16. вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.");
        asc();
        System.out.println("\n17. Для каждого натурального числа в промежутке от m до n вывести все делители, " +
                "кроме единицы и самого числа. m и n вводятся с клавиатуры.");
        allDivider();
        System.out.println("\n18. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.");
        twoNumbers();
    }

    static void func(double a, double b, double c) {
        double z = ((a - 3) * b / 2) + c;
        System.out.println(z);
    }

    static void formulaOne(double a, double b, double c) {
        double z = b + (Math.sqrt(Math.pow(b, 2) + (4 * a * c)));
        double x = 2 * a;
        double m = z / x;
        double v = (Math.pow(a, 3) * c);
        double n = (Math.pow(b, -2));
        double s = m - v + n;
        System.out.println(s);
    }

    static void formulaTwo(double x, double y) {
        double z = Math.sin(x) + Math.cos(y);
        double c = Math.cos(x) - Math.sin(y);
        double v = z / c;
        double b = v * Math.tan(x * y);
        System.out.println(b);
    }

    static void reverseDouble(double x) {
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println(y);
    }

    static void seconds(int x) {

        System.out.printf("%d:%02d:%02d", x / 3600, x % 3600 / 60, x % 60);

    }

    static void shadedArea(int x, int y) {
        if (x <= 2 && y <= 4 && x >= -2 && y >= -3 || x <= 4 && y >= -3 && x >= -4 && y <= 0)
            System.out.println("True");
        else
            System.out.println("false");

    }

    static void triangle(int x, int y) {

        if (x > 0 && y > 0 && (x + y) < 180) {
            System.out.println("Существует");
            System.out.println((x == 90 || y == 90 || x + y == 90) ? "Он прямоугольный." : "Он непрямоугольный");
        } else {
            System.out.println("Не существует");
        }


    }

    static void maxMin(int a, int b, int c, int d) {

        int result = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println(result);

    }

    static void straight(int x1, int y1, int x2, int y2, int x3, int y3) {

        System.out.println((x1 - x2) * (y1 - y3) == (x1 - x3) * (y1 - y2) ? "Расположены на одной прямой." : "Не расположены на одной прямой.");

    }

    static void function(int numX) {
        double result;
        if (numX <= 3) {
            result = Math.pow(numX, 2) - 3 * numX + 9;
        } else {
            result = 1 / (Math.pow(numX, 3) + 6);
        }
        System.out.println("При x = " + numX + ", значение функции F(x) = " + result);
    }

    static void brick(int a, int b) {

        int brickHeight = 6;
        int brickWidth = 4;
        int brickLength = 5;

        if (brickHeight <= a && brickWidth <= b || brickHeight <= b && brickWidth <= a
                || brickHeight <= a && brickLength <= b || brickHeight <= b && brickLength <= a
                || brickWidth <= a && brickLength <= b || brickWidth <= b && brickLength <= a) {
            System.out.println("Пройдет");
        } else
            System.out.println("Не пройдет");
    }

    static void sum(int x) {
        int y = 1;
        for (int i = 1; i <= x; i++) {
            y = y + i;
        }

        System.out.println(y);
    }

    static void funLine(double start, double end, double step) {
        double x, y;
        for (x = start; x <= end; x += step) {
            if (x <= 2) {
                y = -x;
                System.out.println(y);
            } else {
                y = x;
                System.out.println(y);
            }
        }
    }

    static void sumSquare(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println(sum);
    }

    static void multiplicationSquare(int number) {
        BigInteger multip = BigInteger.valueOf(1);
        for (int i = 2; i <= number; i++) {
            multip = multip.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println(multip);
    }

    static void asc() {
        for (int i = 0; i < Character.MAX_VALUE; i++) {
            System.out.print((char) i + " ");
        }
    }

    static void allDivider() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numM = Integer.parseInt(reader.readLine());
        int numN = Integer.parseInt(reader.readLine());
        int count;
        for (int i = numM; i <= numN; i++) {
            count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                    count++;
                }
            }
            if (count != 0) System.out.println(" делители для числа " + i);
        }
    }

    static void twoNumbers() {
        Random rnd = new Random();
        int one = rnd.nextInt(Integer.MAX_VALUE);
        int two = rnd.nextInt(Integer.MAX_VALUE);
        String strOne = Integer.toString(one);
        String strTwo = Integer.toString(two);

        int[] oneArr = new int[strOne.length()];
        int[] twoArr = new int[strTwo.length()];

        for (int i = strOne.length() - 1; i >= 0; i--) {
            oneArr[i] = one % 10;
            one /= 10;
        }
        for (int i = strTwo.length() - 1; i >= 0; i--) {
            twoArr[i] = two % 10;
            two /= 10;
        }
        System.out.println("Числа который нам данны:");
        System.out.println(strOne);
        System.out.println(strTwo);
        HashSet hashSet = new HashSet();
        System.out.println("Числа которые есть в двух разныч числах: ");
        for (int i = 0; i < oneArr.length; i++) {
            for (int j = 0; j < twoArr.length; j++) {
                if (oneArr[i] == twoArr[j]){
                    hashSet.add(oneArr[i]);
                }
            }
        }
        System.out.println(hashSet);

    }

}

