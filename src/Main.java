import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] X = {10, 12}, Y = {14, 15};

        System.out.println(dist(new int[] {3, 5}, Y));

        int[] X1 = new int[4], X2 = new int[4], X3 = new int[4], X4 = new int[4];
        int[][] array = new int[][] {X1, X2, X3, X4};
        randomDoubleGenerator(array);
        System.out.println(Arrays.deepToString(array));
    }
    public static double dist(int[] x, int[] y) {
        double[] result = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            result[i] = Math.pow((x[i]-y[i]), 2);
        }
        double sum = 0.0;
        for(int i = 0; i < result.length; i++) {
            sum += result[i];
        }
        return Math.sqrt(sum);
    }
    public static void randomDoubleGenerator(int[][] arr){
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                arr[i][j] = (int) (Math.random()*10);
            }
        }
    }
}