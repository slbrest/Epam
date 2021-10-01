package BasicsOfSoftwareCodeDevelopment;

public class Tasks {
    public static void main(String args[]) {
        System.out.println("1. Найти значение функции z =( ( a - 3 ) * b / 2 ) + c");
        func(11, 22, 33);
        System.out.println("\n2. Вычеслить выражения по формуле:");
        formulaOne(1, 2, 3);
        System.out.println("\n3. Вычеслить выражения по формуле:");
        formulaTwo(1, 2);
        System.out.println("\n4. Дано дробное число поменять местами дробную часть с натуральной");
        reverseDouble(123.456);
        System.out.println("\n5. Секунды перевести в часы, минуты, секунды");
        seconds(3601);
        System.out.println("\n6. True если точко кординат соответствует закрашеной области либо false.");
        shadedArea(2, 3);
        System.out.println("\n7. Даны два угла треугольника (в градусах). Определить существует ли такой треугольник." +
                " Если да, то будет ли он прямоугольным. ");
        triangle(45, 45);
        System.out.println("\n8. Найти max{min(a, b), min(c, d)}");
        maxMin(4, 6, 7, 1);
        System.out.println("\n9. Даны три точки А (х1,y1), B(x2,y2) и C(x3,y3). Определить, будут ли они " +
                "расположены на одной прямой.");
        straight(1, 1, 2, 2, 3, 3);
        System.out.println("\n10. Заданы размеры прямоугольного отверстия A, B. Пройдет ли в него кирпичь с размерами x, y, z.");
        brick(5, 4);
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

    static void brick(int a, int b) {

        int brickHeight = 6;
        int brickWidth = 4;
        int brickLength = 5;

        if (brickHeight <= a && brickWidth <= b || brickHeight <= b && brickWidth <= a
        || brickHeight <= a && brickLength <= b || brickHeight <= b && brickLength <= a
        || brickWidth <= a && brickLength <= b || brickWidth <= b && brickLength <= a){
            System.out.println("Пройдет");
        }
        else
            System.out.println("Не пройдет");
    }

}