package MainTask;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class MainTask {
    public static void main(String[] args) {
    //Раскоментируйте нужный метод для проверки
       // HelloName("Сергей");
       // ArgumentsRevers();
       // RandomNumber();
       //SumNumbers();
       //Month();
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
        sc.close();
        String[] array = arrayText.split(" ");  //Аргументы переносятся в массив при помощи разделителя " "
        for (int i = array.length-1; i >= 0 ; i--) { //Выводим на печать массив
            System.out.println(array[i]);
        }
    }
    //3.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
    public static void RandomNumber(){
        Scanner sc = new Scanner(System.in);
        int quantityRandomNumber = sc.nextInt(); // принимаем колчество случайных чисел
        sc.close();
        while (quantityRandomNumber >= 0){ //реализуем метод вывода случайных чисел
            if ((int)(Math.random() * 100) > 50){
            //если случайное число условиях if будет больше 50 вывод случайного числа с новой строки, иначе через пробел
                System.out.println((int)(Math.random() * 100));
            }
            else {
                System.out.print((int)(Math.random() * 100) + " ");
            }
            quantityRandomNumber--;
        }
        int z = (int)(Math.random() * 100);
        System.out.println(z);
    }
    //4.Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
    public static void SumNumbers(){
        Scanner sc = new Scanner(System.in);
        int sumNumber = 0;
        while (sc.hasNextInt()){ //воод чисел прекращается если введена не цифра либо при нажатии ctrl^D
            sumNumber += sc.nextInt();
        }
        System.out.println(sumNumber);
    }
    //5.Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
    // Осуществить проверку корректности ввода чисел.
    public static void Month(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца от 1 до 12:");
        switch (sc.nextInt()){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Не верный ввод");
        }
    }
}
