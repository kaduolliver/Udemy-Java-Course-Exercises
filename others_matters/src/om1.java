import java.util.Scanner;
import java.util.Locale;

public class om1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int mask = 0b100000;
        int n = sc.nextInt();

        if ((n & mask ) != 0) {
            System.out.println("6th bit is true!");
        }else{
            System.out.println("6th bit is false!");
        }

    sc.close();
    }
}
