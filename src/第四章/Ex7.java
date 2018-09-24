package 第四章;

public class Ex7 {
    public static void main(String[] args) {
        int i = 0;
        con(i);

        System.out.println("finish");
    }

    static void con(int i) {
        while(true) {
            System.out.println(i);
            i++;
            if(i > 100) {
                return;
            }
        }
    }
}
