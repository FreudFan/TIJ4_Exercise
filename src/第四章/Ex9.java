package 第四章;

public class Ex9 {
    public static void main(String[] args) {
        int n = 5;
        int q = 0, w = 1;
        for(int i = -1; i < 5; i++) {
            if ( q != 0 ) {
                System.out.println(q);
            }
            int e = w;
            w = q + w;
            q = e;
        }
    }
}
