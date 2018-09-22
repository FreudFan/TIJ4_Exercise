package 第三章;

public class Ex13 {
    public static void main(String[] args) {
        char b = 's';
        show(b);
        show('a');
    }

    static void show ( char c ) {
        System.out.println(Integer.toBinaryString(c));  //根据ASCII码来表示
    }
}
