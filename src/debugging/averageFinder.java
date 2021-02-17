package debugging;

public class averageFinder {
    public static void main(String[] args) {
        System.out.println("Average finder v1.0 ");
        double avg = findAverage(args);
        System.out.println("The average is " + avg);
    }

    public static double findAverage(String[] input) {
        double result = 0;
        for (String s : input) {
            result += Integer.parseInt(s);
        }
        return result / input.length;
    }
}
