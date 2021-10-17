import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String reverse = String.valueOf(new StringBuffer(str).reverse());
        System.out.println(reverse);
        input.close();
    }
}