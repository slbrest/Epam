package MainTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class OptionalTask {
    public static void main(String[] args) {
        //Задание. Ввести n чисел с консоли.
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList(); //Заполняем List числами
        System.out.println("Введите положительно число, при окончании ввода нажмите CTRL^D:");
        while (sc.hasNextInt()){
            int x = sc.nextInt();
            if(x >= 0)
            list.add(x); //ввод чисел прекращается при нажатии ctrl^D
            else
                System.out.println("Введите положительно число!");
        }
        sc.close();
        int[] numbersTemp = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            numbersTemp[i] = list.get(i);
        }

        //1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        shortLong(list);
        System.out.println("***************************************\n");
        //2. Вывести числа в порядке возрастания (убывания) значений их длины.
        sortPrint(list);
        System.out.println("***************************************\n");
        //3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
        lessMore(list);
        System.out.println("***************************************\n");
        //4. Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
        minDiffNum(numbersTemp);
        System.out.println("***************************************\n");
        //5. Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
        even(numbersTemp);
        System.out.println("***************************************\n");
        //6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
        System.out.println("***************************************\n");
        }
        public static void shortLong(ArrayList<Integer> list){
            Collections.sort(list);
            System.out.println("Самое короткое число: "
                    + list.get(0) + ". Длина короткого числа = " + list.get(0).toString().length());
            System.out.println("Самое длинное число: "
                    + list.get(list.size() - 1) + ". Длина длинного числа = "
                    + list.get(list.size() - 1).toString().length());
        }

        public static void sortPrint(ArrayList<Integer> list){
            Collections.sort(list);
            list.forEach(System.out::println);
            Collections.reverse(list);
            list.forEach(System.out::println);
        }

        public static void lessMore(ArrayList<Integer> list){
            int lengthList = 0;
            for (Integer temp: list) {
                lengthList += temp.toString().length();
            }
            lengthList = lengthList / list.size();

            for (Integer temp: list) {
                if (temp.toString().length() >= lengthList){
                    System.out.println(temp);
                }
            }
            System.out.println("Больше средней длины по всем числам\n");
            for (Integer temp: list) {
                if (temp.toString().length() <= lengthList){
                    System.out.println(temp);
                }
            }
            System.out.println("Меньше средней длины по всем числам\n");
        }
        //методы minDiffNum и diffNumLength для 4-й задачи
        public static void minDiffNum(int[] arr) {
        //стандартный поиск минимального числа, если длина HashSet меньше изначального минимумма, то HashSet обновляет минимум
            int min = diffNumLength(arr[0]);
            int minElem = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (diffNumLength(arr[i]) < min) {
                    min = diffNumLength(arr[i]);
                    minElem = arr[i];
                }
            }
            System.out.printf("Число, в котором количество различных цифр минимально: %d\n", minElem);
        }
        public static int diffNumLength(int x){
            HashSet<Integer> number = new HashSet<>();
            //перебираем число по фифрам и вносим в HashSet, повторяющиеся эелементы в HashSet не вносятся
            //поэтому если есть повторения цифр в числе, то они не запишутся тем самым уменьшат длину числа
            while (x > 0) {
                number.add(x % 10);
                x /= 10;
            }
            return number.size();
        }

        //методы even и evenOdd для 5-й задачи
        public static void even(int[] arr){
        int evenNumbers = 0;
        int evenOdd = 0;

        int start = 0;
        //в методе evenOdd едет переборка числа на цифры и вычесление четные или не четные находят в ней цифры
        //Если метод evenOdd возвращает 1, значит все цифры в числе четные, если возвращает 2 значит на половину четные и на половину нечетные.
            for (int i = 0; i < arr.length; i++) {
                start = evenOdd(arr[i]);
                if (start == 1) evenNumbers++;
                if (start == 2) evenOdd++;
            }
            System.out.println("Количество чисел в которых только четные числа " + evenNumbers);
            System.out.println("Количество с равным числом четных и нечетных цифр " + evenOdd);
        }
        public static int evenOdd(int x){
        //перебираем каждое число на цифры и при помощи деления на остаток проверяем их на четность.
        int z = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (x > 0) {
            list.add(x % 10);
            x /= 10;
        }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 == 0) z++;
            }
            if (z == list.size())
                return 1;
            if (z == list.size() /2 )
                return 2;
            else
                return 0;
    }



}
    /*
6.     Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.

7.     Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
     */

