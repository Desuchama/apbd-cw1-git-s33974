import java.util.Arrays;

public class StatisticsHelper {
    public double average;
    public int[] data;
    public int max;
    public int min;

    public StatisticsHelper(int[] input){
        this.data = input;
        this.average = calculateAverage(input);
        this.max = calculateMax(input);
        this.min = calculateMin(input);
    }
    public double calculateAverage(int[] values){
        double result = 0;
        for (int i = 0; i < values.length; i++) {
            result += values[i];
            }
        result /= values.length;
        return result;
    }
    public int calculateMax(int[] values){
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            if (result<values[i])
                result = values[i];
            }
        return result;
    }
    public int calculateMin(int[] values) {
        int result = values[0];
        for (int i = 1; i < values.length; i++) {
            if (result>values[i])
                result = values[i];
            result -= 1;
        }
        return result;
    }
    public String toString(){
        return "Data for: " + Arrays.toString(data) +
                "\nAverage: " + average +
                "\nMax: " + max +
                "\nMin: " + min;
    }
}
