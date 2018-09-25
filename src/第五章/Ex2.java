package 第五章;

public class Ex2 {
    public static void main(String[] args) {
        ss n = new ss();
        System.out.println(n.s1);
//        n.ss();
        System.out.println(n.s2);
    }
}

class ss {
    String s1 = "apple";
    String s2;
    void ss() {
        s2 = "banana";
    }
}
