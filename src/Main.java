/**
 * Created by akloster on 6/3/16.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Easiest exercise ever");
        printAsterisk();

        System.out.println("Draw a horizontal line");
        printAsterisks2(8);

        System.out.println("Draw a vertical line");
        drawAVerticalLine(3);
    }

    private static void drawAVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
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
