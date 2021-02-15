
public class demoMArr {
    static int maxValue(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        return max;
    }

    static int[] allRowSum(int[][] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            arr1[i] = sum;
        }
        return arr1;
    }
}
