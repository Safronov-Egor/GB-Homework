public class Homework2 {

    public static void main(String args[]) {

        newTaskName("Задание 1");

        int[] arrayTaskOne = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        showArray(arrayTaskOne);
        taskOne(arrayTaskOne);
        showArray(arrayTaskOne);

        newTaskName("Задание 2");

        int[] arrayTaskTwo = new int[8];

        showArray(arrayTaskTwo);
        taskTwo(arrayTaskTwo);
        showArray(arrayTaskTwo);

        newTaskName("Задание 3");

        int[] arrayTaskThree = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        showArray(arrayTaskThree);
        taskThree(arrayTaskThree);
        showArray(arrayTaskThree);

        newTaskName("Задание 4");

        int[] arrayTaskFour = {2, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        showArray(arrayTaskFour);
        System.out.println("Минимальное значение: " + taskFourMin(arrayTaskFour));
        System.out.println("Максимальное значение: " + taskFourMax(arrayTaskFour));

        newTaskName("Задание 5");

        int[][] arrayTaskFive = new int [8][8];

        taskFive(arrayTaskFive);
        showArrayTwo(arrayTaskFive);

        newTaskName("Задание 6");

       /*
        int[] arrayTaskSixOne = {1, 2, 3, 4, 5};
        int[] arrayTaskSixTwo = new int[5];


        for (int i = 0; i < arrayTaskSixOne.length ; i++) {
            arrayTaskSixTwo[arrayTaskSixOne.length - 1 - 2 * i] = arrayTaskSixOne[i];
        }
        */

    }

    public static void showArray (int array[]) {
        for (int i = 0; i < array.length ; i++) {

            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static  void showArrayTwo(int arr [][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void newTaskName(String name) {
        System.out.println();
        System.out.println();
        System.out.println(name);
    }

    public static void taskOne(int arrayOne[]) {
        for (int i = 0; i < arrayOne.length ; i++) {
            if ( arrayOne[i] == 1 ) {
                arrayOne[i] = 0;
            }

            else {
                arrayOne[i] = 1;
            }
        }
    }

    public static void taskTwo(int[] arrayTwo) {
        int count = 1;
        for (int i = 0; i < arrayTwo.length ; i++) {
            arrayTwo[i] = count;
            count = count + 3;
        }
    }

    public static void taskThree(int[] arrayThree) {
        for (int i = 0; i < arrayThree.length; i++) {
            if (arrayThree[i] < 6) {
                arrayThree[i] = arrayThree[i] * 2;
            }
        }
    }

    public static int taskFourMin(int[] arrayFour) {

        int min = arrayFour[0];

        for (int i = 0; i < arrayFour.length; i++) {

            if (arrayFour[i] < min) {
                min = arrayFour[i];
            }
        }
        return min;
    }

    public static int taskFourMax(int[] arrayFour) {

        int max = arrayFour[0];

        for (int i = 0; i < arrayFour.length; i++) {

            if (arrayFour[i] > max) {
                max = arrayFour[i];
            }
        }
        return max;
    }

    public static void taskFive(int[][] arrayFive) {
        for (int i = 0; i < arrayFive.length; i++) {
            arrayFive[i][i] = 1;
            arrayFive[i][arrayFive.length - i - 1] = 1;
        }
    }

}
