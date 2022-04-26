package ru.ajana.work.task;

/*

Даны два массива, содержащие числа от 0 до 9. Эти массивы представляют собой целые неотрицательные числа, разбитые в массив по десятичным разрядам.

Например:

[1, 5, 2] (число 152)

[4, 2, 6] (число 426)

Нужно написать функцию, которая примет на вход два таких массива, вычислит сумму чисел, представленных массивами, и вернет результат в виде такого же массива:

[5, 7, 8] (число 578)

Числа, которые представлены массивами, могут быть любыми, в том числе очень большими (тысячи разрядов = элементов массива).

Импортировать другие классы нельзя.

[1,1,9]
[2,2,8]

---
[111, 222]

[3,3,3]

[9] + [8] = [1, 7]

Примечание:
Задача не доделана.
*/

public class SumArray {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 1, 9};
        int[] arr2 = new int[]{2, 2, 8};
        long[] arrSum = getSumArray(arr1, arr2);
        System.out.println(arrSum);
    }

    public static long[] getSumArray(int[] arr1, int[] arr2) {
        String sumArray = "";
        int[] locArr1;
        int[] locArr2;
        if (arr1.length > arr2.length) {
            locArr1 = arr1;
            locArr2 = arr2;
        } else {
            locArr1 = arr2;
            locArr2 = arr1;
        }

        for (int i = 0; i < locArr1.length; i++) {
            long sum = locArr1[i];
            if (i < locArr2.length) {
                sum = sum + locArr2[i];
            }
            if (sum <= 9) {
                sumArray += sum + "";
            } else {
                char[] arr = String.valueOf(sum).toCharArray();
                for (char s : arr) {
                    sumArray += (long) s;
                }
            }
        }

        long[] result = new long[sumArray.length()];
        for (int i = 0; i < sumArray.length(); i++) {
            result[i] = sumArray.charAt(i);
        }
        return result;
    }
}
