package Testing;
import java.util.*;
public class task{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("vvedi one: ");
        double one = input.nextDouble();
        double two = one * 5;
        System.out.println("two = " + two);
        double three = one + two;
        System.out.println("three = " + three);
        one = one + three;
        System.out.println("new one = " + one);

    }
}