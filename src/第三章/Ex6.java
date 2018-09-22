package 第三章;

public class Ex6 {
    public static void main(String[] args) {
        Dog1 spot = new Dog1();
        Dog1 scruffy = new Dog1();
        spot.name = "spot";
        spot.says = "Ruff!";
        scruffy.name = "scruffy";
        scruffy.says = "Wurf!";

        System.out.println("spot.name = " + spot.name + "\t" +"spot.says = " + spot.says);
        System.out.println("scruffy.name = " + scruffy.name + "\t" + "scruffy.says = " + scruffy.says);

        Dog1 cpy = new Dog1();
        cpy = spot;
        System.out.println("cpy.equals(spot) = " + cpy.equals(spot));
    }
}

class Dog1 {
    String name, says;
}