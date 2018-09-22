package 第二章;

public class Ex6 {
    public static void main (String[] args) {
        String s = "fjdoiashg";     //length = 9
        int a;
        storage l = new storage();
        a = l.storage(s);
        System.out.println("a = " + a);
    }
}

class storage {
    int storage(String s) {
        return s.length()*2;
    }
}

