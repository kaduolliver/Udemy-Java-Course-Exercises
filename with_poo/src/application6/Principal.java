package application6;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);

        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI value: %.2f\n", calc.PI);

        sc.close();
    }
}
