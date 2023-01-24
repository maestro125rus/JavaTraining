public class Lesson_7 {
/**
 ������ 1:
 �������� ���������, ������� ���������� ����� ���������� �����, ��������� �� ����� ������.
 ���������� ������������ ����� ������� � ��������� �����.*/
    static String strConcantenation(String... strings){
        StringBuilder result = new StringBuilder();
        for (String string : strings) {
            result.append(string).append(" ");
        }
        return result.toString();
    }

/** ������ 2:
 ����������� ������ ����������� ������ ��� ���� ����������� �����, ����� void. ����������:
 * ��� �������� ����� � ��� �� ���. ���� ���� ��� ����� � ������ ��������. ��� ������ ������ ������ � ��������
 ��������� � ������� � ���������� ������� ��������� (��� byte, short, int);
 * ��� boolean � ����������� ���������� ���� ���������� ����������, �������� ��,
   ��� �� ����� ���������� ����� ���������� �;
 * ��� char � ������, ���������� � ���������� ������������ ���� ���������� ����������.
 ���������� ���������� ����� ���� �����. ����������� ���������� � � ���� ������� ������ ���� ���������� ��������.

 ����������: ��� ������ ��� ���������, ������ ��� ���� ����� ������ ���� ����������� � ����� ���������.*/
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
/** ������ 3:
 ��������� ��������� ���������� � ���������� ������ �����, ��������� ����������� ��������.*/
    static long fac(int n){
        if (n < 0) {
            System.out.print("������������ ��������! ");
            //return n;
        }
        else if (n == 0){
            return 1;
        }
        return n * fac(n - 1);
    }
/** ������ 4:
 ��������� ��������� ��������� (sqrt 1 + sqrt 2 + ... + sqrt n), ��������� ����������� ��������.
 n � �����, ��������� � ����������.
 ��� N < 1 � ������� ��������������� ��������� � ������� � ��������� ���������� ���������.*/
//(Math.sqrt(1 + Math.sqrt(2 + Math.sqrt(3 + Math.sqrt(4  + Math.sqrt(5))))));
  //      1: 1.0
   //     2: 1.5537739740300374
   //     3: 1.7122650649295326
   //     4: 1.7487627132551438
    //    5: 1.7562384875823431


    static double roots(double n) {
        double result = 1;
        if (n < 1) {
            System.out.println("n < 1. ������������ ��������!");
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

/** ������ 5 (*):
 ��������� �� �������� � ������ ������ 10 ������� �����.
 ������� ����� � ������������� ����� �����, ������� ������� ��� ������� ���� �� ���� � �� 1. 1 �� �������� ������� ������.
 ������� � ������� ����� ���� ��������� ����������� �������.
 ���������� ������� ����� � ���������� ����� �����������, ��������� ����������� ������.*/
    static int findPrimesDigits(int n){
        return n;
    }

}

