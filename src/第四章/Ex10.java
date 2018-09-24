package 第四章;

public class Ex10 {     //false! collect is VampireNumbers.java
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            for (int j = 10; j < 100; j++) {
                int k = i * j;
                if ( k < 1000 || k >= 10000) {
                    continue;
                }
                if ( k % 1000 != 0 ) {
                    System.out.println(k + "\t" + i + " * " + j);
                }
            }
        }
    }
}
