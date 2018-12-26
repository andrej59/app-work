package ru.ajana.work.common.search;

/**
 * Алгоритм двоичного поиска
 * Created by Андрей on 21.12.2015.
 */
public class BinarySearch {

    public static int search(int value) {
        int[] arr = new int[]{-8, -7, -6, -6, -4, 2, 6, 7, 8, 15}; // объявление одномерного массива
        int size = arr.length;
        System.out.println(arr.toString());
        int avgIndex = 0; // переменная для хранения индекса среднего элемента массива
        int firstIndex = 0; // индекс первого элемента в массиве
        int lastIndex = size - 1; // индекс последнего элемента в массиве
        //--------------------------------------------------------
        //search_value  = 15; // искомое (ключевое) значение
        //--------------------------------------------------------
        if (lastIndex == -1) {
            return -1;
        }

        while (firstIndex < lastIndex) {
            avgIndex = firstIndex + (lastIndex - firstIndex) / 2; // меняем индекс среднего значения
            if (value <= arr[avgIndex]) {
                lastIndex = avgIndex;
            } else {
                firstIndex = avgIndex + 1;
            }
            System.out.println("avgIndex = " + avgIndex);

        }
        if (arr[lastIndex] == value) {
            System.out.println("value is found index = " + lastIndex);
            return lastIndex;
        } else {
            System.out.println("value is not found");
            return -1;
        }
    }

    public static void main(String[] args) {
        search(-6);
    }
}
