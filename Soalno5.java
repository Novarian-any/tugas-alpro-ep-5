import java.util.Scanner;

public class Soalno5 {
    public static void main(String[] args) {
        Scanner inputSegitiga = new Scanner(System.in);

        // Input panjang sisi segitiga
        System.out.print("Masukkan sisi a: ");
        int a = inputSegitiga.nextInt();
        System.out.print("Masukkan sisi b: ");
        int b = inputSegitiga.nextInt();
        System.out.print("Masukkan sisi c: ");
        int c = inputSegitiga.nextInt();

        String jenis;

        // Tentukan jenis segitiga
        if (a == b && b == c) {
            jenis = "Segitiga Sama Sisi";
        } else if (a == b || b == c || a == c) {
            jenis = "Segitiga Sama Kaki";
        } else if ((a * a + b * b == c * c) ||
                   (a * a + c * c == b * b) ||
                   (b * b + c * c == a * a)) {
            jenis = "Segitiga Siku-Siku";
        } else {
            jenis = "Segitiga Sembarang";
        }

        // Tampilkan hasil
        System.out.println("Jenis segitiga: " + jenis);

        inputSegitiga.close();
    }
}
