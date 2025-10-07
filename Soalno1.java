import java.util.Scanner;

public class Soalno1 {
    public static void main(String[] args) {
        // Deklarasi variabel
        double a, b, c, D, x1, x2;

        // Membuat objek Scanner
        Scanner dataKuadrat = new Scanner(System.in);

        // Baca data koefisien persamaan dari keyboard
        System.out.print("Koefisien x^2 (a): ");
        a = dataKuadrat.nextDouble();
        System.out.print("Koefisien x (b): ");
        b = dataKuadrat.nextDouble();
        System.out.print("Konstanta (c): ");
        c = dataKuadrat.nextDouble();

        // Hitung nilai diskriminan (D)
        D = b * b - (4 * a * c);

        // Tentukan jenis akar
        if (a == 0) {
            System.out.println("Bukan persamaan kuadrat karena a = 0");
        } else if (D < 0) {
            System.out.println("Tidak mempunyai akar nyata (akar kompleks)");
        } else if (D == 0) {
            x1 = -b / (2 * a);
            System.out.println("Akar tunggal: x = " + x1);
        } else {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Akar pertama : " + x1);
            System.out.println("Akar kedua   : " + x2);
        }
        dataKuadrat.close();
    }
}

