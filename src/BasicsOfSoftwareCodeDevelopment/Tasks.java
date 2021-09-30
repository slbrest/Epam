package BasicsOfSoftwareCodeDevelopment;

public class Tasks {
    public static void main(String args[]) {
        System.out.println("1. Найти значение функции z =( ( a - 3 ) * b / 2 ) + c");
        func(11, 22, 33);
        System.out.println("\n2. Вычеслить выражения по формуле:");
        formulaOne(1, 2, 3);
        System.out.println("\n3. Вычеслить выражения по формуле:");
        formulaTwo(1,2);
        System.out.println("\n4. Дано дробное число поменять местами дробную часть с натуральной");
        reverseDouble(123.456);
        System.out.println("\n5. Секунды перевести в часы, минуты, секунды");
        seconds(3601);
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

    if (x < 0 && x <= y && y <= 2 - (x * x) || x >= 0 && y >= 0&& y <= 2 - (x * x))
            System.out.println("Yes");
        else
                System.out.println("No");


}