package MainTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OptionalTask {
    public static void main(String[] args) {
        //Задание. Ввести n чисел с консоли.
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        System.out.println("Введите положительно число, при окончании ввода нажмите CTRL^D:");
        while (sc.hasNextInt()){
            int x = sc.nextInt();
            if(x >= 0)
            list.add(x); //ввод чисел прекращается при нажатии ctrl^D
            else
                System.out.println("Введите положительно число!");
        }
        sc.close();
        //1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        ShortLong(list);
        //2. Вывести числа в порядке возрастания (убывания) значений их длины.
        SortPrint(list);

        }
        public static void ShortLong(ArrayList<Integer> list){
            Collections.sort(list);
            System.out.println("Самое короткое число: "
                    + list.get(0) + ". Длина короткого числа = " + list.get(0).toString().length());
            System.out.println("Самое длинное число: "
                    + list.get(list.size() - 1) + ". Длина длинного числа = "
                    + list.get(list.size() - 1).toString().length());
        }

        public static void SortPrint(ArrayList<Integer> list){
            Collections.sort(list);
            list.forEach(System.out::println);
            Collections.reverse(list);
            list.forEach(System.out::println);
        }
}


    /*Для успешного выполнения задания достаточно реализовать 2-4 пункта.
/*

3.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

4.     Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.

5.     Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.

6.     Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.

7.     Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.

     */

