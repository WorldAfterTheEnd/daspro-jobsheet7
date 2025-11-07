import java.util.Scanner;

public class siakadFor16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nilai, tertinggi=0, terendah=100;
        int jumlahTidakLulus=0, jumlahLulus=0;

        //If nilai < 60 = tidak lulus

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = scanner.nextDouble();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan nilai antara 0 hingga 100.");
                i--; // Mengulangi iterasi untuk mahasiswa yang sama
                continue;
            }
            // nilai yang valid dikelompokkan ke dalam kategori huruf A (80 < nilai ≤ 100), B+ (73 < nilai ≤ 80), B (65 < nilai ≤ 73), C+ (60 < nilai ≤ 65), C (50 < nilai ≤ 60), D (39 < nilai ≤ 50), dan E (nilai ≤ 39).
            if (nilai > 80 && nilai <= 100){
                System.out.println("Nilai mahasiswa ke-" + i + " adalah A ");
            }
            else if (nilai > 73 && nilai <= 80){
                System.out.println("Nilai mahasiswa ke-" + i + " adalah B+ ");
            }
            else if (nilai > 65 && nilai <= 73){
                System.out.println("Nilai mahasiswa ke-" + i + " adalah B ");
            }
            else if (nilai > 60 && nilai <= 65){
                System.out.println("Nilai mahasiswa ke-" + i + " adalah C+ ");
            }
            else if (nilai > 50 && nilai <= 60){
                System.out.println("Nilai mahasiswa ke-" + i + " adalah C ");
            }
            else if (nilai > 39 && nilai <= 50){
                System.out.println("Nilai mahasiswa ke-" + i + " adalah D ");
            }
            else {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah E ");
            }

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai < 60) {
                jumlahTidakLulus++;
            } else {
                jumlahLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);
        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
    }
}
