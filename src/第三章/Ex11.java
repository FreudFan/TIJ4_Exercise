package 第三章;

public class Ex11 {
    public static void main(String[] args) {
        int a = 0xab;
        System.out.println(Integer.toBinaryString(a));
        while ( a != 0 ) {
            System.out.println(Integer.toBinaryString(a>>>=1));
        }
    }
}
