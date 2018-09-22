package 第三章;

public class Ex5 {
    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        spot.name = "spot";
        spot.says = "Ruff!";
        scruffy.name = "scruffy";
        scruffy.says = "Wurf!";

        System.out.println("spot.name = " + spot.name + "\t" +"spot.says = " + spot.says);
        System.out.println("scruffy.name = " + scruffy.name + "\t" + "scruffy.says = " + scruffy.says);
    }
}

class Dog {
    String name, says;
}