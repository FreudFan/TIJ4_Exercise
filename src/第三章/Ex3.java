package 第三章;

public class Ex3 {
    public static void main(String[] args) {
        Letter x = new Letter();
        x.i = 56.9f;
        System.out.println("1: x.i = " + x.i);
        f(x);
        System.out.println("2: x.i = " + x.i);
    }

    static void f(Letter o) {
        o.i = 898.98f;
    }
}

class Letter {
    float i;
}