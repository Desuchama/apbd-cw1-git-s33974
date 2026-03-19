public class Main {
    public static void main(String[] args) {
        double[] X = {10, 12}, Y = {14, 15};

        System.out.println(dist(new double[] {3, 5}, Y));

        double[] X1 = new double[4], X2 = new double[4], X3 = new double[4], X4 = new double[4];
        double[][] array = new double[][] {X1, X2, X3, X4};
        System.out.println(array.toString());
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