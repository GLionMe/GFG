import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if((num & 1) == 1)
            System.out.println(num + " is an odd number");
        else
            System.out.println(num + " is an even number");
        
        input.close();
    }
}
