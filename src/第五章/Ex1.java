package 第五章;

public class Ex1 {
    public static void main(String[] args) {
        for (int i=0; i < 10; i++) {
            Str n = new Str();
            System.out.println(n.s);
        }
    }
}

class Str {
    String s;
}
/*
class Tester {
    String s;
}

public class Ex1 {
    public static void main(String[] args) {
        Tester t = new Tester();
        System.out.println(t.s);
    }
}
*/