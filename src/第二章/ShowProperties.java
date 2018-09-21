package 第二章;

public class ShowProperties {
    public static void main (String[] args) {
        System.out.println("---start---");
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(
                System.getProperty("java.library.path")
        );
        System.out.println("---end---");
    }
}