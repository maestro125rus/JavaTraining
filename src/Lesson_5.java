import java.util.Arrays;
import java.util.Scanner;

public class Lesson_5 {
    /**
     ������ 1:
     ������� ������ char, ����������� ������� ������ ����� � ������ �������.
     ��������� ���� ������, ������� ���� ��� � �������.
     ������� 1: �� ��������� ���������� ���� String;
     ������� 2: �������������� ������ �������� ������� � ���������� ���� String.
     ��������� ��� �������� 2: ������� ������ ������ ����� ���: String s = ��;

     ������ 2:
     ������� ������ int��� �� 5 ���������. ��������� ��� ����������, ���������� � ����������.
     ������� �� ����� ����� ������� �������� � ����������.
     ���������� ��������� ��� 0�� �������� ������� ��������� �������� �������.


     ������ 3 (*):
     ��������� �� �������� � ������ ������ 10 ������� �����.
     ������� ����� � ������������� ����� �����, ������� ������� ��� ������� ���� �� ���� � �� 1.
     1 �� �������� ������� ������.
     ������� � ������� ����� ���� ��������� ����������� �������.
     */






//1)____________________________________________________________________________________________________________________


//2)____________________________________________________________________________________________________________________
    static void arrInput() {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {

            System.out.print("������� " + (i + 1) + "-�" + " ������� �������: ");
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
        System.out.println("���������: " + Arrays.toString(result));
    }

//3)____________________________________________________________________________________________________________________
    static void findPrimeDigits(int x) {

        long start = System.currentTimeMillis();
        if (x > 0) {

            int[] primeDigits = new int[x];
            //������� ����� ��� ��������, ����� 2, ������� ����� ���������� 2 � ����������� �������� ����� ����������� �� 2;
            primeDigits[0] = 2;

            //���� ��������� ������ �������� �������;
            int cell = 0;
            for (int var = 3; cell < primeDigits.length - 1; var += 2) {
                boolean tmp = false;
                int i = 0;

                //���� ���������� ��� ����������� ������� ����� � ������� � ��������� �������;
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


            //������� �����;
            int sum = 0;
            for (int i : primeDigits) {
                sum += i;
            }
            System.out.println("\n����� ��������� ������� �� ������� ����� = " + sum);
        }


        else {
            System.out.println("������������ ��������!");
        }
        System.out.println("\nrun time (millis): " + (System.currentTimeMillis() - start));
    }
}

