public class Main {
    public static void main(String[] args) {
        double[] X = {10, 12}, Y = {14, 15};
        ;

        System.out.println(dist(new double[] {3, 5}, Y));

    }
    public static double dist(double[] x, double[] y) {
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
}