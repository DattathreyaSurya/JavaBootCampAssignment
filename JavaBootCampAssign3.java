import java.util.Scanner;

class Assign3 {
    public static void main(String args[]) {
        int x, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        x = sc.nextInt();
        sum = sum(x);
        System.out.println("The sum of first" + x + "  numbers is: " + sum);
    }

    public static int sum(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + i;
        }
        return sum;
    }
}