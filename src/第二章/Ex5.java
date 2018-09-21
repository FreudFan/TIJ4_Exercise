package 第二章;

public class Ex5 {
    public static void main (String[] args) {
        DataOnly0 data = new DataOnly0();
        data.i = 47;
        data.d = 1.1;
        data.b = false;
        data.show();
    }
}

class DataOnly0 {
    int i;
    double d;
    boolean b;
    void show() {
        System.out.println("data.i = " + this.i);
        System.out.println("data.d = " + this.d);
        System.out.println("data.b = " + this.b);
    }
}