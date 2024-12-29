import java.util.Scanner;

public class quiz6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t, v, x = 0;
        boolean check = false;
        System.out.println("Volume tangki: ");
        t = input.nextInt();

        do {
            System.out.println("Masukkan air: ");
            v = input.nextInt();

            x += v;
            if (x >= t) {
                check = true;
                System.out.println("Volume Air: " + x);
                System.out.println("Volume Tangki: " + t);
                if (x > t) {
                    System.out.println("Tangki Overload");
                }
            } else {
                System.out.println("Silakan isi air lagi.");
            }
            System.out.println("Tangki Penuh : " + check);
        } while (check == false);
        input.close();
    }
}