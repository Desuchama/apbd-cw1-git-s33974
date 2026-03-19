import java.util.Arrays;

public class StatisticsHelper {
    public double average;
    public int[] data;

    public StatisticsHelper(int[] input){
        this.data = input;
        this.average = calculateAverage(input);
    }
    public double calculateAverage(int[] values){
        double result = 0;
        for (int i = 0; i < values.length; i++) {
            result += values[i];
            }
        result /= values.length;
        return result;
    }
    public String toString(){
        return average + " is the average of: " + Arrays.toString(data);
    }
}
