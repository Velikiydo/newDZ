import java.util.*;

/**
 * Created by Velikiy Dmitriy
 */
public class Randoms {
    public static void main(String[] args) {

        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20) - 10;

        }
        System.out.println("Массив случайных чисел от -10 до 10");
        int min = serchMax(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Максимальное отрицательное значение: " + min);
        int max=serchMin(array);
        System.out.println("Минимальное положительное значение: " + max);
        System.out.println("\nСортировка случайных чисел:");
        int sort = sortMassiv(array);
        System.out.println(Arrays.toString(array));
    }

    //Ищем минимальное число оно будет максимальным отрицательным
    public static int serchMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max > array[i]) {
                max = array[i];
            }

        }
        return max;
    }
    //Ищем минимальное положительное число
    public static int serchMin(int[] array) {
        int ar_min = 10;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] < ar_min) {
                ar_min = array[i];
            }
        }
        return ar_min;
    }


    // Метод по сортировки масива от мин до макс
    public static int sortMassiv(int[] array) {
        int sort = array[0];
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }

            }

        }

        return sort;
    }
}


