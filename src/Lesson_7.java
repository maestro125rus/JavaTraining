public class Lesson_7 {
/**
 Задача 1:
 Написать программу, которая объединяет любое количество строк, объединяя их через пробел.
 Реализацию конкатенации строк вынести в отдельный метод.*/
    static String strConcantenation(String... strings){
        StringBuilder result = new StringBuilder();
        for (String string : strings) {
            result.append(string).append(" ");
        }
        return result.toString();
    }

/** Задача 2:
 Реализовать методы «вычисления суммы» для всех примитивных типов, кроме void. Возвращать:
 * Для числовых типов — тот же тип. Даже если это ведет к потере точности. При угрозе потери данных — выводить
 сообщение в консоль и возвращать текущий результат (для byte, short, int);
 * Для boolean — определение истинности всех переданных параметров, принимая то,
   что их стоит объединять через логическое И;
 * Для char — строку, полученную в результате конкатенации всех переданных параметров.
 Количество параметров может быть любым. Используйте перегрузку — у всех методов должны быть одинаковые названия.

 Примечание: это задача без вариантов, методы для всех типов должны быть реализованы в одной программе.*/
    static byte sum (byte... nums){
        byte result = 0;
        for (byte num : nums) {
            result += num;
        }
        return (result);
    }
//--------------------------------------------------------
    static short sum (short... nums){
        short result = 0;
        for (short num : nums) {
            result += num;
        }
        return (result);
    }
//--------------------------------------------------------
    static int sum (int... nums){
        int result = 0;
        for (int num : nums) {
            result += num;
        }
        return (result);
    }
//--------------------------------------------------------
    static long sum (long... nums){
        long result = 0;
        for (long num : nums) {
            result += num;
        }
        return (result);
    }
//--------------------------------------------------------
    static float sum (float... nums){
        float result = 0;
        for (float num : nums) {
            result += num;
        }
        return (result);
    }
//--------------------------------------------------------
    static double sum (double... nums){
        double result = 0;
        for (double num : nums) {
            result += num;
        }
        return (result);
    }
//--------------------------------------------------------
    static boolean sum (boolean... vars) {
        for (boolean var : vars) {
            if (!var) {
                return false;
            }
        }
        return true;
    }
//--------------------------------------------------------
    static StringBuilder sum (char... chars){
        StringBuilder result = new StringBuilder();
        for (char aChar : chars) {
            result.append(aChar);
        }
        return (result);
    }
/** Задача 3:
 Вычислите факториал введенного с клавиатуры целого числа, используя рекурсивный алгоритм.*/
    static long fac(int n){
        if (n < 0) {
            System.out.print("Некорректное значение! ");
            //return n;
        }
        else if (n == 0){
            return 1;
        }
        return n * fac(n - 1);
    }
/** Задача 4:
 Вычислите результат выражения (sqrt 1 + sqrt 2 + ... + sqrt n), используя рекурсивный алгоритм.
 n — число, введенное с клавиатуры.
 Для N < 1 — вывести соответствующее сообщение в консоль и завершить выполнение программы.*/
//(Math.sqrt(1 + Math.sqrt(2 + Math.sqrt(3 + Math.sqrt(4  + Math.sqrt(5))))));
  //      1: 1.0
   //     2: 1.5537739740300374
   //     3: 1.7122650649295326
   //     4: 1.7487627132551438
    //    5: 1.7562384875823431


    static double roots(double n) {
        double result = 1;
        if (n < 1) {
            System.out.println("n < 1. Некорректное значение!");
            ;
        } else if (n == 1) {
            return 1;
        }

        return Math.sqrt(1 + (roots(n - 1)));
    }


    static double calculateExpression(int number) {
            return calculateExpression(1, number);
        }

   static double calculateExpression(int number, int maxNumber) {
            if (number == maxNumber) {
                return Math.sqrt(number);
            }

            return Math.sqrt(number + calculateExpression(number + 1, maxNumber));
        }

/** Задача 5 (*):
 Вычислить из записать в массив первые 10 простых чисел.
 Простое число – положительное целое число, которое делится без остатка лишь на себя и на 1. 1 не является простым числом.
 Вывести в консоль сумму всех элементов полученного массива.
 Нахождение простых чисел и вычисление суммы реализовать, используя рекурсивные методы.*/
    static int findPrimesDigits(int n){
        return n;
    }

}

