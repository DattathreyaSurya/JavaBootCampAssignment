import java.util.Scanner;

class Assign1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = in.nextInt();

        if (n > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }
}
