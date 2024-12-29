import java.util.Scanner;

public class quiz5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b = 100, selisih;
        System.out.println("Input: ");
        a = input.nextInt();
        do {
            selisih = (a % b) / (b / 10) - (a % (b / 10)) / (b / 100);
            b = b * 10;
            System.out.println(selisih);

            if (selisih < 0) {
                selisih *= -1;
            }

            if (selisih > 1) {
                break;
            }
        } while ((a / b) > 10);
        System.out.println((selisih == 1) ? "true" : "false");
        input.close();
    }
}
