package MainTask;

import java.util.Arrays;
import java.util.Scanner;

public class MainTask {
    public static void main(String[] args) {
    //Раскоментируйте нужный метод для проверки
       // HelloName("Сергей");
       // ArgumentsRevers();
    }
    //1. Приветствовать любого пользователя при вводе его имени через командную строку.
    public static void HelloName(String name){
        System.out.println("Привет " + name); //Принимаем переменую name и выводим на печать.
    }
    //2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
    public static void ArgumentsRevers() {
        Scanner sc = new Scanner(System.in);
        String arrayText = "";
        //Все аргументы командной строки вносятся в строку при помощи цикла,
        //при завершениие ввода аргументвов нажать Ctr^D
        while (sc.hasNext()){
            arrayText += sc.nextLine().trim() + " ";
        }
        String[] array = arrayText.split(" ");  //Аргументы переносятся в массив при помощи разделителя " "
        for (int i = array.length-1; i >= 0 ; i--) { //Выводим на печать массив
            System.out.println(array[i]);
        }
    }
//3.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
//
//4.Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
//
//5.Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
}
