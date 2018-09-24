package 第四章;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        int m;
        int n = (int)(Math.random()*100);
        System.out.println(n);
        while(true) {
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
