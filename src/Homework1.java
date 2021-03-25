import com.sun.org.apache.xpath.internal.objects.XString;

public class Homework1 {

    public static void main(String[] args) {

        int varA = 10;
        int varB = 5;
        int varC = 3;
        int varD = 2;
        int year = 1203;

        System.out.println("Задание 1: a * (b + (c / d)) = " + taskOne(varA, varB, varC, varD));

        System.out.println("Задание 2: Сумма " + varA + " и " + varB + " лежит в промежутке от 10 до 20 | " + taskTwo(varA, varB));

        if (taskThree(varA)) {
            System.out.println("Задание 3: " + varA +  " положительное число");
        }

        else {
            System.out.println("Задание 3: " + varA +  " отрицательное число");
        }

        System.out.println("Задание 4: Привет, " + taskFour("человекнейм") + "!");

        if (taskFive(year)) {
            System.out.println("Задание 5: " + year +  " год високосный");
        }

        else {
            System.out.println("Задание 5: " + year +  " год не високосный");
        }
    }

    public static float taskOne(int a, int b, int c, int d) {
        return a * (b + ((float) c / d));
    }

    public static boolean taskTwo(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static boolean taskThree(int a) {
        return (a >= 0);
    }

    public static String taskFour(String name) {
        return name;
    }

    public static boolean taskFive(int a) {
        return (a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0);
    }

}
