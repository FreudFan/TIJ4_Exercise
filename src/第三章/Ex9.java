package 第三章;

public class Ex9 {
    public static void main(String[] args) {
        float a = 1e30f;
        double b = 1e300;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        double max = java.lang.Double.MAX_VALUE;
        System.out.println("Max double = " + max);
        double min = java.lang.Double.MIN_VALUE;
        System.out.println("Min double = " + min);
        float maxf = java.lang.Float.MAX_VALUE;
        System.out.println("Max float = " + maxf);
        float minf = java.lang.Float.MIN_VALUE;
        System.out.println("Min float = " + minf);
    }
}
