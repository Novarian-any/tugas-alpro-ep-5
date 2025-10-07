import java.util.Scanner;

public class Soalno3 {
    public static void main(String[] args) {
        Scanner inputBonus = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan golongan (I/II/III/IV): ");
        String golongan = inputBonus.next().toUpperCase();
        System.out.print("Masukkan masa kerja (tahun): ");
        int masa = inputBonus.nextInt();
        System.out.print("Masukkan gaji pokok: ");
        double gaji = inputBonus.nextDouble();

        double persen = 0;

        // Tentukan persentase bonus berdasarkan golongan dan masa kerja
        if (golongan.equals("I")) {
            if (masa <= 10) persen = 0.5;
            else if (masa <= 20) persen = 0.6;
            else persen = 0.7;
        } else if (golongan.equals("II")) {
            if (masa <= 10) persen = 0.6;
            else if (masa <= 20) persen = 0.7;
            else persen = 0.8;
        } else if (golongan.equals("III")) {
            if (masa <= 10) persen = 0.7;
            else if (masa <= 20) persen = 0.8;
            else persen = 0.9;
        } else if (golongan.equals("IV")) {
            if (masa <= 10) persen = 0.8;
            else if (masa <= 20) persen = 0.9;
            else persen = 1.0;
        }

        // Hitung bonus
        double bonus = gaji * persen;
        System.out.println("Bonus akhir tahun: Rp " + bonus);

        inputBonus.close();
    }
}
