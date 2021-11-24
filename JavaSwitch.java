public class JavaSwitch {
    public static void main(String[] args) {
        int num = 3;

        switch(num) {
            case 1,3 -> {
                System.out.println("Hello1");
                System.out.println("Hye");
            }
            case 2 -> System.out.println("Hello2");
            default -> System.out.println("hello");
        }

        switch(num) {
            case 1,3:
                {
                    System.out.println("Hello1");
                    System.out.println("Hye");
                    break; //we must use break statment
                } //even if the code is inside a block
            case 2:
                    System.out.println("Hello2");
                    break;    
            default:
                {
                    System.out.println("Hello");
                }
        }
    }
}
