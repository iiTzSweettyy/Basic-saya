public class Smile {

    public static void main(String[] args) {
        // Lirik lagu Die With A Smile
        String[] lyrics = {
                "So I'ma love you every night like it's the last night",
                "Like it's the last night",
                "If the world was ending, I'd wanna be next to you",
                "If the party was over and our time on Earth was through",
                "I'd wanna hold you just for a while and die with a smile",
                "If the world was ending, I'd wanna be next to you"
        };

        // Delay per karakter dan delay tambahan
        int delayPerChar = 100; // 100 milliseconds
        int longDelay = 4000; // 4000 milliseconds (4 seconds)

        // Cetak lirik dengan delay
        for (String line : lyrics) {
            for (char c : line.toCharArray()) {
                System.out.print(c); // Cetak karakter tanpa baris baru
                try {
                    Thread.sleep(delayPerChar); // Delay antar karakter
                } catch (InterruptedException e) {
                    System.err.println("Terjadi kesalahan: " + e.getMessage());
                }
            }
            System.out.println(); // Pindah ke baris berikutnya setelah satu lirik selesai

            // Tambahkan delay tambahan jika baris sesuai
            if (line.equals("If the world was ending, I'd wanna be next to you")) {
                try {
                    Thread.sleep(longDelay); // Delay tambahan
                } catch (InterruptedException e) {
                    System.err.println("Terjadi kesalahan: " + e.getMessage());
                }
            }
            if (line.equals("If the party was over and our time on Earth was through")) {
                try {
                    Thread.sleep(longDelay); // Delay tambahan
                } catch (InterruptedException e) {
                    System.err.println("Terjadi kesalahan: " + e.getMessage());
                }
            }
        }
    }
}