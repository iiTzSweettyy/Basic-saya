public class quizTerakhir {
    public static void main(String[] args) {
        String[] buku = { "Belajar Python", "algoritma dan struktur data", "pemrogaman web dasar",
                "machine learning praktis", "dasar dasar java" };
        for (int i = 0; i < buku.length; i++) {
            if (buku[i].equals("pemrogaman web dasar")) {
                buku[i] = "pemrograman mobile android";
            }
        }
        for (int i = 0; i < buku.length; i++) {
            System.out.println("buku ke-" + (i + 1) + " : " + buku[i]);
        }
    }
}