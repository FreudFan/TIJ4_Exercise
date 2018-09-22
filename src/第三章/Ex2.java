package 第三章;

public class Ex2 {
    public static void main (String[] args) {
        tank aa = new tank();
        tank bb = new tank();
        aa.f = 2.23f;
        bb.f = 49.26f;
        System.out.println("1: aa.level: " + aa.f + ", bb.level: " + bb.f);
        aa = bb;
        System.out.println("2: aa.level: " + aa.f + ", bb.level: " + bb.f);
        aa.f = 89.6f;
        System.out.println("3: aa.level: " + aa.f + ", bb.level: " + bb.f);

    }
}

class tank {
    float f;
}
