public class StatisticsHelper {
    public double average;
    public double[] data;

    public StatisticsHelper(double[] input){
        this.data = input;
        this.average = calculateAverage(input);
    }
    public double calculateAverage(double[] input) {
        double result = 0;
        for (int i = 0; i < input.length; i++) {
            result += input[i];
        }
        result /= input.length;
        return result;
    }
}
