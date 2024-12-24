import java.util.Scanner;

class sample {
    public static void main(String[] args) {
        final double PI = 3.1415926535897932384626433832795028;

        Scanner stdIn = new Scanner(System.in);

        System.out.print("radius: ");
        double x = stdIn.nextDouble();

        double area = x*x*PI;
        System.out.println(area);
    }
}
