import java.util.Scanner;

public class Soalno4 {
    public static void main(String[] args) {
        Scanner inputZodiak = new Scanner(System.in);

        // Input tanggal lahir
        System.out.print("Tanggal lahir: ");
        int tanggal = inputZodiak.nextInt();
        System.out.print("Bulan lahir (angka): ");
        int bulan = inputZodiak.nextInt();

        String zodiak = "";
        String sifat = "";

        // Tentukan zodiak berdasarkan tanggal dan bulan
        if ((bulan == 1 && tanggal >= 20) || (bulan == 2 && tanggal <= 18)) {
            zodiak = "Aquarius"; sifat = "Kreatif, independen, humanis";
        } else if ((bulan == 2 && tanggal >= 19) || (bulan == 3 && tanggal <= 20)) {
            zodiak = "Pisces"; sifat = "Sensitif, penyayang, intuitif";
        } else if ((bulan == 3 && tanggal >= 21) || (bulan == 4 && tanggal <= 19)) {
            zodiak = "Aries"; sifat = "Berani, energik, percaya diri";
        } else if ((bulan == 4 && tanggal >= 20) || (bulan == 5 && tanggal <= 20)) {
            zodiak = "Taurus"; sifat = "Setia, sabar, praktis";
        } else if ((bulan == 5 && tanggal >= 21) || (bulan == 6 && tanggal <= 20)) {
            zodiak = "Gemini"; sifat = "Ramah, mudah beradaptasi, cerdas";
        } else if ((bulan == 6 && tanggal >= 21) || (bulan == 7 && tanggal <= 22)) {
            zodiak = "Cancer"; sifat = "Penuh kasih, protektif, emosional";
        } else if ((bulan == 7 && tanggal >= 23) || (bulan == 8 && tanggal <= 22)) {
            zodiak = "Leo"; sifat = "Percaya diri, karismatik";
        } else if ((bulan == 8 && tanggal >= 23) || (bulan == 9 && tanggal <= 22)) {
            zodiak = "Virgo"; sifat = "Analitis, perfeksionis";
        } else if ((bulan == 9 && tanggal >= 23) || (bulan == 10 && tanggal <= 22)) {
            zodiak = "Libra"; sifat = "Adil, harmonis, ramah";
        } else if ((bulan == 10 && tanggal >= 23) || (bulan == 11 && tanggal <= 21)) {
            zodiak = "Scorpio"; sifat = "Misterius, penuh gairah";
        } else if ((bulan == 11 && tanggal >= 22) || (bulan == 12 && tanggal <= 21)) {
            zodiak = "Sagitarius"; sifat = "Optimis, petualang";
        } else {
            zodiak = "Capricornus"; sifat = "Disiplin, pekerja keras";
        }

        // Output hasil
        System.out.println("Anda berbintang: " + zodiak);
        System.out.println("Sifat Anda: " + sifat);

        inputZodiak.close();
    }
}
