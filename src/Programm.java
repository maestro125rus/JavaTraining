import java.util.Arrays;
import java.util.Scanner;

public class Programm {

    public static void main(String[] args) {
        //Counter counter = new Counter(3, 5);
        //System.out.println(counter.incrementation());
        //Lesson_5.arrInput();
        //System.out.print("??????? ????? - ?????? ?????: ");
        //Scanner in = new Scanner(System.in);
        //int input = in.nextInt();
        //FindPrimeDigits.findPrimeDigits(input);

        //System.out.println(Lesson_7.calculateExpression(5));
        // System.out.println(Lesson_7.roots(5));
        // System.out.println(Lesson_7.fac(5));

        //even- ??????, odd - ????????;

        Scanner sc = new Scanner(System.in);
        System.out.println("??????? ???????? ?????, ????????????? ?????!");
        System.out.print("??????: ");
        int start = Integer.parseInt(sc.nextLine());
        System.out.print("?????: ");
        int end = Integer.parseInt(sc.nextLine());
        sc.close();

        if ((end < start) || (end < 0) || (start < 0)){
                System.out.println("?? ??, ??????");
            }

        else {
                Counter countOdd = new Counter();
                Counter countEven = new Counter();
                int i = start;

                for (i = start; i <= end; i++){
                    if (i == 0){
                        i++;
                    }
                    if (i % 2 == 0){
                        countEven.increment();
                    }
                    else {
                        countOdd.increment();
                    }

                }
            System.out.println("???????? ?????: " + countOdd.count + "\n׸???? ?????: " + countEven.count);

            }
        }



//______________________________________________________________________________________________________________________

//______________________________________________________________________________________________________________________

//______________________________________________________________________________________________________________________


}