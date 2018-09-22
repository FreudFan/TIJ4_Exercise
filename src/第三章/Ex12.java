package 第三章;

public class Ex12 {
    public static void main(String[] args) {
        int a = -1;
        System.out.println(Integer.toBinaryString(a));
        a <<= 1;
        System.out.println(Integer.toBinaryString(a));
        while ( a != 0 ) {
            System.out.println(Integer.toBinaryString(a>>>=1));
        }
    }
}
