package 第二章;

public class Ex8 {
    public static void main (String[] args) {
        System.out.println("----orgin----");
        System.out.println("ex8.i = " + ex.i);
        ex a = new ex();
        ex b = new ex();
        ex c = new ex();
        System.out.println("a = " + a.i);
        System.out.println("b = " + b.i);
        System.out.println("c = " + c.i);
        System.out.println("----after add----");
        change.add();
        System.out.println("a = " + a.i);
        System.out.println("b = " + b.i);
        System.out.println("c = " + c.i);
        System.out.println("----change a.i----");
        a.i++;
        System.out.println("a = " + a.i);
        System.out.println("b = " + b.i);
        System.out.println("c = " + c.i);
    }
}

class ex {
    static int i = 1;
}

class change {
    static void add() {
        ex.i++;
    }
}