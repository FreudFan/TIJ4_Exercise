package 第三章;

public class Ex4 {
    public static void main(String[] args) {
        double time, distance, velocity;
        time = 3;
        distance = 7;
        if ( time == 0 ) {
            velocity = 0;
        } else {
            velocity = distance / time;
        }
        System.out.println("velocity = " + velocity);
    }
}
