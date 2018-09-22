package 第二章;

public class Ex9 {
    public static void main (String[] args) {
        char c = 'x';
        Character ch = new Character(c);
        Character cl = new Character('x');
        char l = cl;
        System.out.println("c = " + c);
        System.out.println("ch = " +ch);
        System.out.println("cl = " + cl);
        System.out.println("l = " + l);
    }
}
