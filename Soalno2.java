import java.util.Scanner;

public class Soalno2 {
    public static void main(String[] args) {
        Scanner inputKaos = new Scanner(System.in);

        // Input ukuran dan jumlah kaos
        System.out.print("Masukkan ukuran kaos (S/M/L/XL/XXL): ");
        String ukuran = inputKaos.next().toUpperCase();
        System.out.print("Masukkan jumlah kaos: ");
        int jumlah = inputKaos.nextInt();

        int harga;

        // Tentukan harga berdasarkan ukuran
        if (ukuran.equals("S")) {
            harga = 30000;
        } else if (ukuran.equals("M")) {
            harga = 38000;
        } else if (ukuran.equals("L")) {
            harga = 45000;
        } else if (ukuran.equals("XL")) {
            harga = 50000;
        } else if (ukuran.equals("XXL")) {
            harga = 60000;
        } else {
            harga = 0;
        }

        // Hitung total
        if (harga > 0) {
            int total = harga * jumlah;
            System.out.println("Total yang harus dibayar: Rp " + total);
        } else {
            System.out.println("Ukuran tidak valid!");
        }

        inputKaos.close();
    }
}
