import java.util.Scanner;

public class siakadWhile16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        int i = 0;

        while (i < jumlahMahasiswa) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            double nilai = scanner.nextDouble();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan nilai antara 0 hingga 100.");
                continue; // Mengulangi iterasi untuk mahasiswa yang sama
            }
            // nilai yang valid dikelompokkan ke dalam kategori huruf A (80 < nilai ≤ 100), B+ (73 < nilai ≤ 80), B (65 < nilai ≤ 73), C+ (60 < nilai ≤ 65), C (50 < nilai ≤ 60), D (39 < nilai ≤ 50), dan E (nilai ≤ 39).
            if (nilai > 80 && nilai <= 100){
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A (Bagus Pertahankan Nilainya)");
            }
            else if (nilai > 73 && nilai <= 80){
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+ ");
            }
            else if (nilai > 65 && nilai <= 73){
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B ");
            }
            else if (nilai > 60 && nilai <= 65){
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+ ");
            }
            else if (nilai > 50 && nilai <= 60){
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C ");
            }
            else if (nilai > 39 && nilai <= 50){
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D ");
            }
            else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E ");
            }
            i++;

       
        }
    }
}