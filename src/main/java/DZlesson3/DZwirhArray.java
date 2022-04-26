package DZlesson3;


import java.util.Random;

public class DZwirhArray {

    public static Random random = new Random();

    public static void main(String[] args) {
     //Level 1 of homework____________________;
       int[] firstArray = new int[10];
       for (int i = 0; i < firstArray.length; i++){
           firstArray[i] = random.nextInt(2);
       }
       //printArr(firstArray);

        for (int i = 0; i < firstArray.length; i++){
            if (firstArray[i] == 1)
                firstArray[i] = 0;
            else
                firstArray[i] = 1;
        }
        //printArr(firstArray);
        //++++++++++++++++++++++++++++



        //Level 2 of homework____________________;
        int[] secondArray = new int[100];
        for (int i = 0; i < secondArray.length; i++){
            secondArray[i] = i + 1;
        }
       // printArr(secondArray);
        //++++++++++++++++++++++++++++



        //Level 3 of homework____________________;
        int[] thirdArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //printArr(thirdArray);
        for (int i = 0; i < thirdArray.length; i++) {
            if (thirdArray[i] < 6)
                thirdArray[i] *= 2;
        }
        //printArr(thirdArray);
        //++++++++++++++++++++++++++++



        //Level 4 of homework____________________;
        int arrSise = 5;
        int[][] squareArr = new int[arrSise][arrSise];
        //first diagonal;
        for (int i = 0; i < arrSise; i++) {
            for (int j = 0; j < arrSise; j++) {
                if (i == j) squareArr[i][j] = 1;
            }
        }

        //second diagonal;
        int arrX = 0;
        int arrY = arrSise-1;
        for (int i = 0; i < arrSise; i++) {
            squareArr[arrX][arrY] = 1;
            arrX++;
            arrY--;
        }
        //printDoubleArr(squareArr);
        //++++++++++++++++++++++++++++



        //Level 5 of homework____________________;
        int len = 11;
        int initialValue = 11;
        int[] fourArr = new int[len];
        fourArr = createArr(len, initialValue);
        //printArr(fourArr);
        //++++++++++++++++++++++++++++



        //Level 6 of homework____________________;
        int[] fiveArray = {99, 34, 3, 2, 11, 4, 47, 2, 4, 55, 9, 1};
        int minValue = 9999999;
        int maxValue = 0;
        for (int i = 0; i < fiveArray.length; i++) {
            if (fiveArray[i] > maxValue)
                maxValue = fiveArray[i];
            if (fiveArray[i] < minValue)
                minValue = fiveArray[i];
        }
        System.out.println("Max value is - " + maxValue);
        System.out.println("Min value is - " + minValue);
    }


    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printDoubleArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++ ) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[] createArr (int len, int initialValue) {
        int[] tmpArr = new int[len];
        for (int i = 0; i < len; i++) {
            tmpArr[i] = initialValue;
        }
        return  tmpArr;
    }

}
