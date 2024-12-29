import java.util.Scanner;

public class quiz2Terakhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan jumlah siswa : ");
        int jumlahSiswa = input.nextInt();

        int[] nilai = new int[jumlahSiswa];
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Masukan nilai siswa ke- " + (i + 1) + " : ");
            nilai[i] = input.nextInt();
        }
        tampilkanNilai(nilai);

        double rataRata = hitungRataRata(nilai);
        System.out.println(" Nilai Rata-Rata Kelas : " + rataRata);

        int nilaiMax = cariNilaiMax(nilai);
        System.out.println("Nilai Maksimum : " + nilaiMax);

        int nilaiMin = cariNilaiMin(nilai);
        System.out.println("Nilai Minimum : " + nilaiMin);

        input.close();
    }

    public static void tampilkanNilai(int[] nilai) {
        System.out.println("daftar nilai siswa : ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Siswa ke-" + (i + 1) + " : " + nilai[i]);
        }
    }

    public static double hitungRataRata(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return (double) total / nilai.length;
    }

    public static int cariNilaiMax(int[] nilai) {
        int max = nilai[0];
        for (int n : nilai) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static int cariNilaiMin(int[] nilai) {
        int min = nilai[0];
        for (int n : nilai) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }
}
