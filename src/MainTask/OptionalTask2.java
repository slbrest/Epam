package MainTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class OptionalTask2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(reader.readLine());
        int column  = Integer.parseInt(reader.readLine());
        reader.close();
        int[][] arr = new int[line][column];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(-100, 100);
            }
        }

        //2.Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
        moreLess(arr);
        System.out.println("\n****************************************\n");
        //3.Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки
        positiveSum(arr);
        System.out.println("\n****************************************\n");
        //4.Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие
        delete(arr);
        System.out.println("\n****************************************\n");
        //1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
        sortArray(arr);
        System.out.println("\n****************************************\n");
    }

    public static void sortArray (int[][] arr){
        System.out.println("Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).\n");
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void moreLess(int[][] arr) {
        System.out.println("Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.\n");
        int[] arrTemp = new int[arr.length * arr[0].length];//Создаем одномерный массив
        int flagToArray = 0;
        //переносим все значения двумерного массива в одномерный
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrTemp[flagToArray] = arr[i][j];
                flagToArray++;
            }
        }
        int flagMore = 0;
        int max = 0;
        int indexLastMore = 0;
        int flagLess = 0;
        int min = 0;
        int indexLastLess = 0;

        for (int i = 0; i < arrTemp.length - 1; i++){
            if (arrTemp[i] < arrTemp[i + 1]){//если последующий элемент больше
                flagMore += 1;
                if (flagMore > max) {
                    max = flagMore;
                    indexLastMore = i + 1; //запоминаем количество возрастаний и индекс последнего возрастающего элем
                }
            } else {//возрастание прервалась
                flagMore =0 ;
            }
            if ( arrTemp[i] > arrTemp[i + 1]){
                flagLess += 1;
                if (flagLess > min){
                    min = flagLess;
                    indexLastLess = i + 1;//запоминаем количество возрастаний и индекс последнего убыв элем
                }
            } else{// убывание прервалась
                flagLess = 0;
            }
        }
        System.out.println("Максимальная последовательность возрастающих чисел:");
        int[] arrMore = new int[max + 1];
        System.arraycopy(arrTemp, (indexLastMore - max), arrMore,0,(max + 1));//копирую последовательность возр элем в новый массив
        System.out.println(Arrays.toString(arrMore) + " Длина последовательности: " + (max + 1));
        System.out.println("\nМаксимальная последовательность убывающих чисел:");
        int[] arrLess = new int[min + 1];
        System.arraycopy(arrTemp, (indexLastLess - min), arrLess,0, (min + 1));//копирую последовательность убыв элем в новый массив
        System.out.println(Arrays.toString(arrLess) + " Длина последовательности: " + (min + 1));
    }

    public static void positiveSum (int[][] arr) {
        System.out.println("Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.\n");
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int flag = 0; //Устанавливаем флаги между 1 и 2 положительным числом
            for (int j = 0; j < arr[i].length - 1; j++) {
                if (arr[i][j] >= 0) {
                    flag++;
                }
                if(arr[i][j + 1] >= 0 && flag == 1){
                    flag++;
                }
                //Суммируем все числа между флагами
                if (arr[i][j] >= 0 && flag < 2){
                    sum += arr[i][j + 1];
                }
                if (arr[i][j] < 0 && flag == 1){
                    sum += arr[i][j + 1];
                }
            }
        System.out.println("Строка " + (i + 1));
            System.out.println(Arrays.toString(arr[i]));
        System.out.println(sum != 0 ? sum : "-");
        }
    }

    public static void delete (int[][] arr) {
        System.out.println("Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие\n");
        System.out.println("Массив в котором ищем максимальное число:\n\n" + Arrays.deepToString(arr));
        int flagMaxNumber = Integer.MIN_VALUE; //устанавливаем флаги максимального номера и места его нахождения
        int flagPositionMaxLine = 0;
        int flagPositionMaxColumn = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > flagMaxNumber){
                    flagMaxNumber = arr[i][j];
                    flagPositionMaxLine = i;
                    flagPositionMaxColumn = j;
                }
            }
        }
        int indexPositionLine = 0;
        //создаем новый массив с размерностью минус одна линия и колонна и перезаписываем данные с вычетом
        //колонны и строки в котором максимальное число
        int[][] arrTemp = new int[arr.length - 1][arr[0].length - 1];
        for (int i = 0; i < arrTemp.length; i++) {
            int indexPositionColumn = 0;
            for (int j = 0; j < arrTemp[i].length; j++) {
                if (indexPositionLine == flagPositionMaxLine){
                    indexPositionLine++;
                }
                if (indexPositionColumn == flagPositionMaxColumn){
                    indexPositionColumn++;
                }
                arrTemp[i][j] = arr[indexPositionLine][indexPositionColumn];
                indexPositionColumn++;
            }
        }
        System.out.println("Отредактированный массив:\n\n" + Arrays.deepToString(arrTemp));
    }
}

