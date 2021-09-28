package MainTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class OptionalTask2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(reader.readLine());
        int column  = Integer.parseInt(reader.readLine());
        reader.close();
       // int[][] arr = {{-2, -1, 1, 2, 3}, {1, 0, -1, 2, 3}};
        int[][] arr = new int[line][column];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(-100, 100);
            }
        }

        //2.Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
        moreLess(arr);
        System.out.println("****************************************\n");
        //1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
        sortArray(arr);
        System.out.println("****************************************\n");
    }

    public static void sortArray (int[][] arr){
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
        int[] arrTemp = new int[arr.length * arr.length];//Создаем одномерный массив
        int flagToArray = 0;
        //переносим все значения двумерного массива в одномерный
        for(int[] temp : arr){
            for(int temp2 : temp){
                arrTemp[flagToArray++] = temp2;
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
        System.out.println("Максимальная последовательность убывающих чисел:");
        int[] arrLess = new int[min + 1];
        System.arraycopy(arrTemp, (indexLastLess - min), arrLess,0, (min + 1));//копирую последовательность убыв элем в новый массив
        System.out.println(Arrays.toString(arrLess) + " Длина последовательности: " + (min + 1));
    }

    /*

3.     Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки

4.     Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие

     */
}

