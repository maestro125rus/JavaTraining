/**
 ������ 1:
 ��������������� ������
 https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson3_casts_conditional_constructions/Task2SwitchCase.java
 ������� � ��������� ����� ������������� switch-case. ����� ������� � ��������� ����� �������������  System.out.println

 ������ 2:
 ��������������� ������
 https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson3_casts_conditional_constructions/Task4.java
 ������� � ��������� ����� ����� ������, ������� ������������, ����� ������ ����� ������ � ����, � ����.

 ������ 3:
 �������� ���������, ������� ��������� ����� � ������ �������������� (2 ����� �����).
 ���������� � ������� �������� �������������, ��������� �-� � �|�. ���� �������������� ���������� �������� � �.
 ������ ������� ����� ������ ������������ ����� �������� �-�, ������ ������� ������ � �������� �|�.
 ���������� ������������ �� ������ ����������. ���������� ������� �� ��������. ������� ����.
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