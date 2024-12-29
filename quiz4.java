import java.util.Scanner;

public class quiz4 {
    public static void main(String[] args) {
        int n, m, x, y, c = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        n = input.nextInt();
        System.out.print("Masukkan m: ");
        m = input.nextInt();
        System.out.print("Masukkan x: ");
        x = input.nextInt();
        System.out.print("Masukkan y: ");
        y = input.nextInt();

        while ((n - x) >= 0 && (m - y) >= 0) {
            n = n - x;
            m = m - y;
            c++;
        }
        System.out.println(c);

        input.close();
    }
}
