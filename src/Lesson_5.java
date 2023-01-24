import java.util.Arrays;
import java.util.Scanner;

public class Lesson_5 {
    /**
     Задача 1:
     Создать массив char, заполненный буквами своего имени в верном порядке.
     Используя этот массив, вывести свое имя в консоль.
     Вариант 1: не используя переменную типа String;
     Вариант 2: предварительно собрав значения массива в переменную типа String.
     Подсказка для варианта 2: создать пустую строку можно так: String s = “”;

     Задача 2:
     Создать массив int’ов из 5 элементов. Заполнить его значениями, введенными с клавиатуры.
     Вывести на экран сумму каждого значения с предыдущим.
     Предыдущим значением для 0го элемента считать последнее значение массива.


     Задача 3 (*):
     Вычислить из записать в массив первые 10 простых чисел.
     Простое число – положительное целое число, которое делится без остатка лишь на себя и на 1.
     1 не является простым числом.
     Вывести в консоль сумму всех элементов полученного массива.
     */






//1)____________________________________________________________________________________________________________________


//2)____________________________________________________________________________________________________________________
    static void arrInput() {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {

            System.out.print("Введите " + (i + 1) + "-й" + " элемент массива: ");
            int input = in.nextInt();
            arr[i] = input;
        }

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                result[i] = arr[0] + arr[arr.length - 1];
            } else {
                result[i] = arr[i] + arr[i - 1];
            }
        }
        System.out.println("Результат: " + Arrays.toString(result));
    }

//3)____________________________________________________________________________________________________________________
    static void findPrimeDigits(int x) {

        long start = System.currentTimeMillis();
        if (x > 0) {

            int[] primeDigits = new int[x];
            //Простые числа все нечётные, кроме 2, поэтому сразу записываем 2 и проверяемое значение будем увеличивать на 2;
            primeDigits[0] = 2;

            //Цикл заполняет массив простыми числами;
            int cell = 0;
            for (int var = 3; cell < primeDigits.length - 1; var += 2) {
                boolean tmp = false;
                int i = 0;

                //Цикл перебирает уже заполненные простые числа в массиве и проверяет условие;
                while (i < cell) {
                    if (var >= primeDigits[i] * 2 && var % primeDigits[i] == 0) {
                        tmp = true;
                        break;
                    }
                    i++;
                }

                if (cell < primeDigits.length - 1 && !tmp) {
                    cell++;
                    primeDigits[cell] = var;
                }

            }
            System.out.println("\n" + Arrays.toString(primeDigits));


            //Считаем сумму;
            int sum = 0;
            for (int i : primeDigits) {
                sum += i;
            }
            System.out.println("\nСумма элементов массива из простых чисел = " + sum);
        }


        else {
            System.out.println("Некорректное значение!");
        }
        System.out.println("\nrun time (millis): " + (System.currentTimeMillis() - start));
    }
}

