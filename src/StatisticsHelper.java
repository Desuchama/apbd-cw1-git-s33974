import java.util.Arrays;

public class StatisticsHelper {
    public double average;
    public int[] data;
    public int max;

    public StatisticsHelper(int[] input){
        this.data = input;
        this.average = calculateAverage(input);
        this.max = calculateMax(input);
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
    public String toString(){
        return average + " is the average of: " + Arrays.toString(data);
    }
}
