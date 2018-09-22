package 第三章;

public class Ex10 {
    public static void main(String[] args) {
        int a = 46;
        int b = 37;
        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));

        System.out.println("a & b = " + Integer.toBinaryString(a&b));
        System.out.println("a | b = " + Integer.toBinaryString(a|b));
        System.out.println("a ^ b = " + Integer.toBinaryString(a^b));
        System.out.println("~b = " + Integer.toBinaryString(~b));
    }
}
