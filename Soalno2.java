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
        switch (ukuran) {
            case "S": harga = 30000; break;
            case "M": harga = 38000; break;
            case "L": harga = 45000; break;
            case "XL": harga = 50000; break;
            case "XXL": harga = 60000; break;
            default: harga = 0; break;
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
