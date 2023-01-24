/**
 Задача 1:
 Декомпозировать задачу
 https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson3_casts_conditional_constructions/Task2SwitchCase.java
 Вынести в отдельный метод использование switch-case. Также вынести в отдельный метод использование  System.out.println

 Задача 2:
 Декомпозировать задачу
 https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson3_casts_conditional_constructions/Task4.java
 Вынести в отдельный метод метод логику, которая отрабатывает, когда первое число кратно и двум, и трем.

 Задача 3:
 Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
 Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”. Углы прямоугольника обозначить символом “ “.
 Каждая единица длины должна обозначаться одним символом “-“, каждая единица ширины – символом “|“.
 Произвести декомпозицию по своему усмотрению. Рекомендую скинуть на проверку. Контакт ниже.
 */

import java.util.Scanner;
public class Lesson_6 {

//1)____________________________________________________________________________________________________________________
    static String input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String x = scanner.nextLine();
        scanner.close();
        return x;
    }
    static String logic(String s){
        String answer = "";
        switch (s) {
            case "Hi":
                return answer = "Hello";

            case "Bye":
                return answer = "Good bye";

            case "How are you":
                return answer = "How are your doing";

            default:
                return answer = "Unknown message";
        }
    }
    static void printingAnswer(String answer){
        System.out.println(answer);
    }

//2)____________________________________________________________________________________________________________________


//3)____________________________________________________________________________________________________________________


}