/**
 * Created by akloster on 6/3/16.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("\nEasiest exercise ever");
        printAsterisk();

        System.out.println("\nDraw a horizontal line");
        printAsterisks2(8);

        System.out.println("\nDraw a vertical line");
        drawAVerticalLine(3);

        System.out.println("\nDraw a right triangle");
        drawRightTriangle(3);

        System.out.println("\nIsosceles Triangle");
        drawIsoscelesTriangle(3);

        System.out.println("\nDiamond");
        drawDiamond(3);

        System.out.println("\nDiamond with Name");
        drawDiamondWithName(5, "Name");

        System.out.println("\nFizzBuzz");
        fizzBuzz();

    }

    private static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            String output;
            if (i%3 == 0 && i%5 == 0){
                output = "FizzBuzz";
            }else if(i%3 == 0){
                output = "Fizz";
            }else if(i%5 == 0){
                output = "Buzz";
            }else{
                output = new Integer(i).toString();
            }
            System.out.println(output);
        }
    }

    private static void drawDiamondWithName(int n, String name) {

        diamondTopHelper(n);

        System.out.println(name);

        diamondBottomHelper(n);
    }

    private static void drawDiamond(int n) {
        diamondTopHelper(n);

        for (int i = 1; i <n *2 ; i++) {
            System.out.print("*");
        }
        System.out.println();
        diamondBottomHelper(n);
    }

    // TOneverDO  parameterize diamond helper to make one helper
    private static void diamondTopHelper(int n){
        for (int i = 0; i < n-1 ; i++) {
            for (int j = i; j < n-1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void diamondBottomHelper(int n){
        for (int i = 1; i < n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j < n*2-i*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawIsoscelesTriangle(int n) {
        for (int i = 0; i < n ; i++) {
            for (int j = i; j < n-1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawAVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    private static void drawRightTriangle(int n) {
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    private static void printAsterisk() {
        System.out.println("*");
    }
    private static void printAsterisks2(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
