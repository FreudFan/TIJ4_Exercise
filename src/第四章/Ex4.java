package 第四章;

public class Ex4 {
    public static void main(String[] args) {
        for (int i = 2; i <=100; i++ ) {
            int k = 0;
            for (int j = 1; j < i; j++) {
                if ( i % j == 0 && j != 1 ) {
                    k = 1;
                    break;
                }
            }
            if (k == 0) {
                System.out.println(i);
            }
        }
    }
}
