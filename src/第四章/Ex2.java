package 第四章;

import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        int m;
        int n = (int)(Math.random()*100);
        System.out.println(n);
        for(int i=0;i < 25;i++) {
            m = (int)(Math.random()*100);
            if(m<n) {
                System.out.println(m + "\t" + "<");
            } else if(m==n) {
                System.out.println(m + "\t" + "=");
            } else {
                System.out.println(m + "\t" + ">");
            }
            n = m;
        }
    }
}
