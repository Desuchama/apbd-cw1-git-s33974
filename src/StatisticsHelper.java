import java.util.Arrays;

public class StatisticsHelper {
    public double average;
    public int[] data;

    public StatisticsHelper(int[] input){
        this.data = input;
    }
    public String toString(){
        return average + " is the average of: " + Arrays.toString(data);
    }
}
